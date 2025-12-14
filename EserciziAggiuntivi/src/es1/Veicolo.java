package es1;

public abstract class Veicolo {
    protected String targa;
    protected int orarioIngresso; // Contiente solo l'ora
    protected int tariffa;

    // Costruttore
    public Veicolo(String targa, int orarioIngresso) {
        this.targa = targa;
        this.orarioIngresso = orarioIngresso;
    }

    // Metodo da implementare per i figli
    public abstract void calcolaTariffa(int orarioUscita);

    // Metodi Getter
    public double getTariffa() {
        return tariffa;
    }

    // Metodi Getter che verranno ereditati da AUTO e MOTO
    public String getTarga(){
        return targa;
    }

    public int getOrarioIngresso() {
        return orarioIngresso;
    }
}
