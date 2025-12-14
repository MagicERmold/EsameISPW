package es3.entity;

public class Pizza extends Piatto {
    private boolean isMaxi;

    // Costruttore
    public Pizza(String nome, double prezzoBase, boolean isMaxi) {
        super(nome, prezzoBase); // Creazione del padre
        this.isMaxi = isMaxi;
    }

    // Override del metodo astratto
    @Override
    public double calcolaPrezzo() {
        if(isMaxi){
            return this.prezzoFinale = prezzoBase*1.2;
        }else{
            return this.prezzoFinale = prezzoBase;
        }
    }
}
