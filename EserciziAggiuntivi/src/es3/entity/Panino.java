package es3.entity;

public class Panino extends Piatto{
    private int numeroIngredientiExtra;

    // Costruttore
    public Panino(String nome, double prezzoBaseint,int numeroIngredientiExtra) {
        super(nome, prezzoBaseint); // Creazione del padre
        this.numeroIngredientiExtra = numeroIngredientiExtra;
    }

    // Override del metodo astratto
    @Override
    public double calcolaPrezzo() {
        return this.prezzoFinale = prezzoBase + 1.0*numeroIngredientiExtra;
    }
}
