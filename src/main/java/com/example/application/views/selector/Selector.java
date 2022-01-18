package com.example.application.views.selector;



public class Selector {

   public  static String dimmiBidone(int a){
        
        String mess = " ";
        final String plastica = "Rifiuto ricilabile nel bidone PLASTICA E ALLUMINIO";
        final String carta = "Rifiuto ricilabile nel bidone CARTA";
        final String vetro = "Rifiuto ricilabile nel bidone VETRO";

       
        
        if(a<100){
        switch (a){
            case 1:
            mess = plastica;
            break;
            case 2:
            mess = plastica;
            break;
            case 3:
            mess = plastica;
            break;
            case 4:
            mess = plastica;
            break;
            case 5:
            mess = plastica;
            break;
            case 6:
            mess = plastica;
            break;
            case 7:
            mess = plastica;
            break;
            case 40:
            mess = plastica;
            break;
            case 41:
            mess = plastica;
            break;

            case 20:
            mess = carta;
            break;
            case 21:
            mess = carta;
            break;
            case 22:
            mess = carta;
            break;

            case 70:
            mess = vetro;
            break;
            case 71:
            mess = vetro;
            break;
            case 72:
            mess = vetro;
            break;
            
            default:
            mess = "Rifiuto non è riciclabile";
        }
      
       
    }else{
        mess = "Il codice inserito non è valido!      Inserisci il numero all'interno del simbolo del riciclo ";
    }
        return mess;
    } 

}
