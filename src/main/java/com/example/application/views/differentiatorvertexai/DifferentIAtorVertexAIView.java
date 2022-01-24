package com.example.application.views.differentiatorvertexai;



/*import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;*/
import java.io.IOException;



import com.vaadin.flow.component.button.Button;


import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.component.upload.receivers.FileData;

import com.vaadin.flow.router.Route;



import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
//import com.vaadin.flow.component.html.Image;

import com.vaadin.flow.router.PageTitle;

import com.vaadin.flow.router.RouteAlias;

@PageTitle("DifferentIAtor | Vertex AI")
@Route(value = "differentiator", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class DifferentIAtorVertexAIView extends VerticalLayout {
    
  
    
    Button conferma = new Button("Vertex IA");
    String absolutePath = " ";
    H1 risultato = new H1(" ");
    long startTime;
    long endTime;
    long durata;



    public DifferentIAtorVertexAIView() {
        setSpacing(false);

        conferma.setVisible(false);
 
        ///Inizio uploader
    
        FileBuffer buffer = new FileBuffer();
        Upload upload = new Upload(buffer);
        upload.setDropAllowed(true);
        
        upload.setHeight("200px");
        upload.setWidth("250px");
        int maxFileSizeInBytes = 1 * 1024 * 1024; // 1MB
        upload.setMaxFileSize(maxFileSizeInBytes);


        upload.setAcceptedFileTypes("image/*");

        upload.addSucceededListener(event -> {
        FileData savedFileData = buffer.getFileData();
        absolutePath = savedFileData.getFile().getAbsolutePath();
        conferma.setVisible(true);
        
        
            });


        upload.addFileRejectedListener(event -> {
        String errorMessage = event.getErrorMessage();
        Notification notification = Notification.show(
                errorMessage,
                5000,
                Notification.Position.MIDDLE
        );
        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
              });

    ////Fine uploader
        conferma.addClickListener(click-> {

          startTime = System.nanoTime();

        try {
         /* BufferedImage originalImage = ImageIO.read(new File(absolutePath));
          BufferedImage outputImage = resizeImage(originalImage, 400, 400);
          ImageIO.write(outputImage, "jpg", new File("src\\main\\temp\\immmagine-temp.jpg"));
  */
          String prediction = PIC.predictImageClassification("dulcet-answer-333112", absolutePath, "7816217055627051008");
        //  Files.deleteIfExists(Paths.get("src\\main\\temp\\immmagine-temp.jpg"));

          risultato.setText(prediction);
          
          endTime = System.nanoTime();

          durata = endTime - startTime;
          System.out.println("Il tempo impegato per esecuzione task:  " + durata);
        } catch (IOException e) {
  
          System.out.print("---------------------------Eccezione inizia ora ------------------------------------------");
          
          e.printStackTrace();
        }
  
      });
        

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");

        H2 info = new H2("Carica la tua immagine da far riconoscere alla nostra IA differentIAtor.");
        
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(upload,conferma);
        

        add(
        info,
        horizontalLayout,
        risultato
        );
    }

    /*static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }*/
}
