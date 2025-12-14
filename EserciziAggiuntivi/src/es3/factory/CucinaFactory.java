package es3.factory;

import es3.entity.Panino;
import es3.entity.Piatto;
import es3.entity.Pizza;

public class CucinaFactory {
    // Fondamentale lo static per il pattern factory
    public static Piatto creaPiatto(String tipo, String nome, double prezzoBase, boolean infoMaxi, int infoIngr){
        if(tipo.equals("PIZZA")){
            return new Pizza(nome, prezzoBase, infoMaxi);
        }else if(tipo.equals("PANINO")){
            return new Panino(nome, prezzoBase, infoIngr);
        }else{
            System.out.println("Piatto inesistente o non valido");
            return null; // Ritorno null se il tipo non corrisponde
        }
    }
}
