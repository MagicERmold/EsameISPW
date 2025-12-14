package es2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestoreAste {
    private static GestoreAste gestore;
    private static List<Asta> aste;
    private static int numeroAste = 0;

    private GestoreAste() {
        aste = new ArrayList<Asta>();
    }

    public static GestoreAste getInstance(){
        if(gestore == null){
            gestore = new GestoreAste();
        }

        return gestore;
    }

    public void elaboraOfferta(OffertaBean bean) throws IOException {
        Asta a = cercaAsta(bean);
        if(a == null){
            System.out.println("Asta inesistente");
        }

        // Assert è un controllo if che lancia un errore se questa cosa non è vera
        // Assicurati che a sia diversa da null
        assert a != null;
        a.gestisciOfferta(bean.getNomeUtente(), bean.getImportoOfferto());
    }

    public Asta cercaAsta(OffertaBean bean){
        for(Asta a : aste){
            if (bean.getIdAsta() == a.getIdAsta()) {
                return a;
            }
        }
        return null;
    }

    // Attenzione qui stiamo facendo overloading, è tutto lecito
    public Asta cercaAsta(int idAsta){
        for(Asta a : aste){
            if (a.getIdAsta() == idAsta) {
                return a;
            }
        }
        return null;
    }

    public void aggiungiAsta(){
        numeroAste++;
        Asta a = new Asta(numeroAste);
        aste.add(a);
    }

    public void iscriviPartecipante(Partecipante p, int idAsta){
        Asta a = cercaAsta(idAsta);
        assert a != null;
        a.iscrivi(p);
    }
}
