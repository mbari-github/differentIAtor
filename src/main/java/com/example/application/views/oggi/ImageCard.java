package com.example.application.views.oggi;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;




@JsModule("./views/oggi/image-card.ts")
@Tag("image-card")
public class ImageCard extends LitTemplate {

    @Id
    private Image image;

    @Id
    private Span header;

    @Id
    private Span subtitle;

    @Id
    private Paragraph text;

    @Id
    private Span badge;

    @Id
    private Anchor anchor;
    

    public ImageCard(String text, String url, String title, String subTitle, String textCard, String link) {

        this.image.setSrc(url);
        this.image.setAlt(text);
        this.header.setText(title);
        this.subtitle.setText(subTitle);
        this.text.setText(textCard);
        this.anchor.setHref(link);
        this.badge.setText("Online");
}
}