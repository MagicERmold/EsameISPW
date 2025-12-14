package es2;

public class OffertaBean {
    private String nomeUtente;
    private int idAsta;
    private double importoOfferto;

    public OffertaBean(String nomeUtente, int idAsta) {
        this.nomeUtente = nomeUtente;
        this.idAsta = idAsta;
    }

    public OffertaBean(String nomeUtente, int idAsta, double importoOfferto) {
        this.nomeUtente = nomeUtente;
        this.idAsta = idAsta;
        this.importoOfferto = importoOfferto;
    }

    public int  getIdAsta() {
        return this.idAsta;
    }

    public String getNomeUtente() {
        return this.nomeUtente;
    }

    public double getImportoOfferto() {
        return this.importoOfferto;
    }
}
