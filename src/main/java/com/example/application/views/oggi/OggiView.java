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
                "https://www.comune.tavagnacco.ud.it/var/opencitytavagnacco/storage/images/media/images/servizi_raccolta-differenziata/624620-4-ita-IT/Servizi_Raccolta-differenziata_reference.jpg");
        
                
        ImageCard imagecard2 = new ImageCard("Raccolta rifiuti elettronici",
                "https://www.rinnovabili.it/wp-content/uploads/2020/05/08162e780d42455e7de0ac92d4d31cbc-e1588861265354.jpg");
        
        ImageCard imagecard3 =new ImageCard("Deforestazione",
                "https://inchiostrovirtuale.it/wp-content/uploads/2018/04/deforestazione-2.jpg");
        
        ImageCard imagecard4 =new ImageCard("Ocean Cleanup",
                "https://www.futuroprossimo.it/wp-content/uploads/2020/10/P1111502-1280x720-1.jpg");
                
        ImageCard imagecard5 =new ImageCard("Isola di plastica",
                "https://www.culligan.it/wp-content/uploads/2021/05/mare-plastica.jpg");
                
        ImageCard imagecard6 =new ImageCard("Intelligenza artificiale per la raccolta rifiuti ",
                "https://www.ehabitat.it/wp-content/uploads/2018/06/wall-e.jpg");
    
    
    
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