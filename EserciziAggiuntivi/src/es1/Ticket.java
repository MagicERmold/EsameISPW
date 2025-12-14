package es1;

import java.io.Serializable;

/*
* Ricordiamo che Seriazible è una tagging interface e serve solamente a dire che questo oggetto può essere "smontato".
* Questo mi permette di salvare gli oggetti e assicurarmi che non scriva oggetti indesiderati.
*
* */

public class Ticket implements Serializable {
    private String targa;
    private double totaleDaPagare;

    // Costruttore
    public Ticket(Veicolo v, int orarioUscita) {
        this.targa = v.targa;

        // Prima calcolo la tariffa
        // RICORDATI CHE I METODI NON SONO FUNZIONI, quindi non restituiscono un valore ma lo cambiano e basta
        v.calcolaTariffa(orarioUscita);
        this.totaleDaPagare = v.getTariffa();
    }

    // Non è importante per il Seriazible
    // SENZA:
    // Non sapresti se i dati dentro sono giusti!
    // Vedresti qualcosa di incomprensibile come es1.Ticket@7a81197d (nome della classe + indirizzo di memoria).
    // CON:
    // Istruisci Java su come "rappresentare a parole" quell'oggetto. Così, stampandolo, leggi Targa: AA123BB Totale: 10.0.
    // È fondamentale per verificare che il salvataggio sia andato a buon fine.

    @Override
    public String toString() {
        return targa + " " + totaleDaPagare;
    }

    // Singolo metodo Getter
    public String getTarga() {
        return this.targa;
    }
}
