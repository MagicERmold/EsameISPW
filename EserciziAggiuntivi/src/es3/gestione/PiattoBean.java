package es3.gestione;

public class PiattoBean {
    private String tipo;
    private String nome;
    private double prezzo;
    private boolean isMaxi;
    private int numIngr;

    // Costruttore
    public PiattoBean(String tipo, String nome, double prezzo, boolean isMaxi, int numIngr) {
        this.tipo = tipo;
        this.nome = nome;
        this.prezzo = prezzo;
        this.isMaxi = isMaxi;
        this.numIngr = numIngr;
    }

    // Getter
    public String getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public boolean isMaxi() {
        return isMaxi;
    }
    public int getNumIngr() {
        return numIngr;
    }
}
