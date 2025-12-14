package es2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Asta {
    private int idAsta;
    private double prezzoAttuale;
    private String migliorOfferente;
    private List<Partecipante> listaOsservatori;
    FileWriter fw;

    public Asta(int idAsta) {
        this.idAsta = idAsta;
        this.prezzoAttuale = 0;
        this.migliorOfferente = "";
        this.listaOsservatori = new ArrayList<>();
    }

    public boolean gestisciOfferta(String nomeOfferente, double importo) throws IOException {
        if(importo > prezzoAttuale){
            prezzoAttuale = importo;
            migliorOfferente = nomeOfferente;

            avvisaPartecipanti();

            try (FileWriter fw = new FileWriter("aste.txt", true)) {
                fw.append("L'offerta dell'asta " + this.idAsta + " è stata superata da " + nomeOfferente + " con " + importo + "\n");
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }



            return true;
        }else{
            System.out.println("L'offerta è troppo bassa!!!");
            return false;
        }
    }

    public void iscrivi(Partecipante p){
        listaOsservatori.add(p);
        System.out.println("Partecipante aggiunto: " + p.getNome());
    }

    public void disiscrivi(Partecipante p){
        listaOsservatori.remove(p);
        System.out.println("Partecipante rimosso: " + p.toString());
    }

    public int getIdAsta() {
        return idAsta;
    }

    public void avvisaPartecipanti() {
        for(Partecipante p : listaOsservatori){
            p.aggiornaAsta("Il prezzo dell'asta " + this.getIdAsta() + "è stato superato!!!");
        }
    }
}
