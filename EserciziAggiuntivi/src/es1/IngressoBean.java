package es1;

public class IngressoBean {
    private String targa;
    private String tipoVeicolo;
    private int orarioIngresso;
    private int orarioUscita;

    public IngressoBean(String targa, String tipo, int in, int out) {
        this.targa = targa;
        this.tipoVeicolo = tipo;
        this.orarioIngresso = in;
        this.orarioUscita = out;
    }

    // Metodi getter
    public String getTarga() {
        return this.targa;
    }

    public String getTipoVeicolo() {
        return this.tipoVeicolo;
    }

    public int getOrarioIngresso() {
        return this.orarioIngresso;
    }

    public int getOrarioUscita() {
        return this.orarioUscita;
    }
}
