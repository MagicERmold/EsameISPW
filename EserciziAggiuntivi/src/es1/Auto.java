package es1;

public class Auto extends Veicolo {
    public Auto(String targa, int orarioIngresso) {
        // Creo il padre
        super(targa, orarioIngresso);
    }

    // Metodo calcolaTariffa impostato per l'auto
    @Override
    public void calcolaTariffa(int orarioUscita) {
        this.tariffa = ((orarioUscita - this.orarioIngresso)) * 2;
    }
}
