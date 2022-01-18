package com.example.application.views.selector;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Selector")
@Route(value = "finder", layout = MainLayout.class)
public class SelectorView extends VerticalLayout {
    
    H1 risultato = new H1("");
    Button findButton = new Button("Find"); 
    TextField textField = new TextField(); 
    
    public SelectorView() {
        setSpacing(false);
        textField.setHelperText("Inserisci qui il codice");

        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        

        findButton.addClickListener(click -> { 
            risultato.setText(" ");
            String ris = Selector.dimmiBidone(Integer.parseInt(textField.getValue()));
            risultato.setText(ris);
           
          });
        findButton.addClickShortcut(Key.ENTER); 
      

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");

        H3 info = new H3("Inserisci il numero presente all'interno del simbolo del riciclo per sapere se il rifiuto è riciclabile o no");
        HorizontalLayout hLayout = new HorizontalLayout();
        hLayout.add(textField, findButton );
        
        add(
            info,
            hLayout,
            risultato,
            img
            
        );
    }

}
