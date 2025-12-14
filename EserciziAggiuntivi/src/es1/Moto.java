package es1;

public class Moto extends Veicolo{

    public Moto(String targa, int orarioIngresso) {
        // Creo il PADRE
        super(targa, orarioIngresso);
    }

    // Metodo calcolaTariffa impostato per la moto
    @Override
    public void calcolaTariffa(int orarioUscita) {
        this.tariffa = ((orarioUscita - this.orarioIngresso));
    }
}
