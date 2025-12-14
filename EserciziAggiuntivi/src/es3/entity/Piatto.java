package es3.entity;

import java.io.Serializable;

public abstract class Piatto implements Serializable {
    protected String nome;
    protected double prezzoBase;
    protected double prezzoFinale; // Usato per calcolare il prezzo finale
    // Ricordati che i metodi modificano uno stato dell'attributo

    // Costruttore
    public  Piatto(String nome, double prezzoBase) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
    }

    // Metodi
    public abstract double calcolaPrezzo();

    // Per scriverlo sul file di testo
    @Override
    public String toString() {
        return "NOME: " + this.nome + " ";
    }

}
