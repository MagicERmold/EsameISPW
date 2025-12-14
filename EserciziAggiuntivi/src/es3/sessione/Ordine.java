package es3.sessione;

import es3.entity.Piatto;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int idOrdine;
    private List<Piatto> carrello;

    // Costruttore
    public Ordine(int idOrdine) {
        this.idOrdine = idOrdine;
        this.carrello = new ArrayList<Piatto>();
    }

    // Metodi
    public void aggiungiPiatto(Piatto p) {
        if(p != null) {
            this.carrello.add(p);
        }else{
            System.out.println("Piatto non inserito");
        }
    }

    public String getScontrino(){
        String scontrino = "--- RICEVUTA ORDINE " + idOrdine + " ---\n";
        double totaleCalcolato = 0;

        for(Piatto p : this.carrello){
            // 1. Aggiungo descrizione piatto e vado a capo
            // Nota: chiamo il metodo per avere il prezzo aggiornato
            double prezzoPiatto = p.calcolaPrezzo();
            scontrino += p.toString() + " | Prezzo: " + prezzoPiatto + " euro\n";

            // 2. Sommo al totale
            totaleCalcolato += prezzoPiatto;
        }

        scontrino += "---------------------------\n";
        scontrino += "TOTALE DA PAGARE: " + totaleCalcolato + " euro";

        return scontrino;
    }
}
