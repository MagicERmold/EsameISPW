package es3.gestione;

import es3.factory.CucinaFactory;
import es3.sessione.Ordine;

import java.io.FileWriter;
import java.io.IOException;

public class DeliveryController {
    private static  DeliveryController deliveryController;
    private Ordine ordineCorrente;
    private static int id;

    private DeliveryController(){
        id = 0;
    }

    // Metodo del pattern SINGLETON
    public static DeliveryController getInstance() {
        if (deliveryController == null) {
            deliveryController = new DeliveryController();
        }

        return deliveryController;
    }

    // Metodi del controller
    public void nuovaSessione(){
        System.out.println("Creazione nuova sessione in corso...");
        id++;
        ordineCorrente = new Ordine(id);
    }

    public void aggiungiAlCarrello(PiattoBean bean){
        // Non c'è bisogno di istanziare la classe CucinaFactory, posso usare i suoi metodi anche senza crearla
        ordineCorrente.aggiungiPiatto(CucinaFactory.creaPiatto(bean.getTipo(), bean.getNome(), bean.getPrezzo(), bean.isMaxi(), bean.getNumIngr()));
    }

    public void confermaOrdine(){
        String filename = "ricevuta_" + id + ".txt";
        try(
                FileWriter fw = new FileWriter(filename);
                ){
            String scontrino = ordineCorrente.getScontrino();
            // Scrivo sul file
            fw.write(scontrino + "\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
