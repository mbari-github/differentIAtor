package com.example.application.views.oggi;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Oggi")
@Route(value = "hello", layout = MainLayout.class)
@Tag("oggi-view")
@JsModule("./views/oggi/oggi-view.ts")
public class OggiView extends LitTemplate implements HasComponents {

    @Id
    private Select<String> sortBy;

    public OggiView() {
        addClassNames("oggi-view", "flex", "flex-col", "h-full");
        sortBy.setItems("Newest first", "Oldest first");
        sortBy.setValue("Newest first");

        
        
        
       
        
        
        
        
        ImageCard imagecard1 = new ImageCard("Raccolta differenziata",
                "https://www.comune.tavagnacco.ud.it/var/opencitytavagnacco/storage/images/media/images/servizi_raccolta-differenziata/624620-4-ita-IT/Servizi_Raccolta-differenziata_reference.jpg",
                "Raccolta differenziata",
                " ",
                "A volte può succedere che, per fretta o confusione, gettiamo nella differenziata gli scontrini o la carta sporca di cibo. Ancora oggi sono tanti gli errori che si commettono quando si fa la raccolta differenziata. Piccoli errori certo, ma ... ",
                "https://www.nonsprecare.it/come-fare-la-raccolta-differenziata");
                
        
        
        //https://www.nonsprecare.it/come-fare-la-raccolta-differenziata
                
       
       
       
        ImageCard imagecard2 = new ImageCard("Raccolta rifiuti elettronici",
                "https://www.rinnovabili.it/wp-content/uploads/2020/05/08162e780d42455e7de0ac92d4d31cbc-e1588861265354.jpg",
                "Raccolta rifiuti elettronici ",
                " ",
                "Tv, cellulari, ma anche robot da cucina, computer, modem, pennette USB, frigoriferi, lavatrici e altri elettrodomestici non sono spazzatura qualsiasi, ma sono RAEE, rifiuti da apparecchiature elettriche ed elettroniche, cioè rifiuti speciali il cui ... ",
                "https://www.nonsprecare.it/rifiuti-elettronici-come-smaltirli-in-modo-corretto?refresh_cens"
                );
        //https://www.nonsprecare.it/rifiuti-elettronici-come-smaltirli-in-modo-corretto?refresh_cens
        
       
       
       
        ImageCard imagecard3 =new ImageCard("Deforestazione",
                "https://inchiostrovirtuale.it/wp-content/uploads/2018/04/deforestazione-2.jpg",
                "Deforestazione",
                " ",
                "Il problema della deforestazione colpisce molte aree del Pianeta, ma in particolare quelle aree che forniscono legname pregiato e purtroppo sono anche più ricche di biodiversità come le foreste pluviali e tropicali. Negli ultimi 30 anni ... ",
                "https://www.wwf.it/cosa-facciamo/foreste/deforestazione/"
                );
        //https://www.wwf.it/cosa-facciamo/foreste/deforestazione/

      
      
      
        ImageCard imagecard4 =new ImageCard("Ocean Cleanup",
                "https://www.futuroprossimo.it/wp-content/uploads/2020/10/P1111502-1280x720-1.jpg",
                "Ocean Cleanup ",
                " ",
                "The Ocean Cleanup is a non-profit organization developing and scaling technologies to rid the oceans of plastic. To achieve this objective, we have to work on a combination of closing the source and cleaning up what has already accumulated in ... ",
                "https://theoceancleanup.com"
                );
        //https://theoceancleanup.com

       
       
       
        ImageCard imagecard5 =new ImageCard("Isola di plastica",
                "https://www.culligan.it/wp-content/uploads/2021/05/mare-plastica.jpg",
                "Isola di plastica ",
                " ",
                "Capire cosa sono le isole di plastica è abbastanza intuitivo, ma sicuramente non se ne immaginano le dimensioni. Si tratta di estese discariche di rifiuti galleggianti che si sono accumulati nel tempo nei mari e negli oceani di tutto il mondo. Sono le microplastiche ... ",
                "https://www.nieddittas.it/2021/07/cosa-sono-le-isole-di-plastica/"
                );
          
        //https://www.nieddittas.it/2021/07/cosa-sono-le-isole-di-plastica/

      
      
        ImageCard imagecard6 =new ImageCard("A.I. per la raccolta rifiuti ",
                "https://www.ehabitat.it/wp-content/uploads/2018/06/wall-e.jpg",
                "A.I. per la raccolta rifiuti ",
                " ",
                "La ricerca Data Augmentation Using Background Replacement for Automated Sorting of Littered Waste, condotta dall'Università degli Studi di Roma Tor Vergata ha come obiettivo quello di costruire sistemi di smistamento automatico dei rifiuti per identificare e ... ",
                "https://www.adnkronos.com/lintelligenza-artificiale-che-riconosce-i-rifiuti-nellambiente_1TfepnC3MuX2kBwkx3f56x"
                );
        //https://www.adnkronos.com/lintelligenza-artificiale-che-riconosce-i-rifiuti-nellambiente_1TfepnC3MuX2kBwkx3f56x
    
    
    add(
            imagecard1,
            imagecard2,
            imagecard3,
            imagecard4,
            imagecard5,
            imagecard6
            );
        }

}