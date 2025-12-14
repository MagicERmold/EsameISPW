package es3.gestione;

public class AppDelivery {
    private DeliveryController deliveryController;

    // Costruttore
    public AppDelivery(DeliveryController deliveryController) {
        this.deliveryController = deliveryController;
    }

    // Metodi della boundary
    public void selezionaPiatto(String tipo, String nome, double prezzo, boolean isMaxi, int ingr){
        PiattoBean bean = new PiattoBean(tipo, nome, prezzo, isMaxi, ingr);

        deliveryController.aggiungiAlCarrello(bean);
        System.out.println("Il piatto: " + nome + " è stato aggiunto correttamente");
    }

    public void checkout(){
        deliveryController.confermaOrdine();
        System.out.println("Checkout eseguito correttamente!");
    }
}
