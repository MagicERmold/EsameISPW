package es3;

import es3.gestione.AppDelivery;
import es3.gestione.DeliveryController;

public class Main {
    public static void main(String[] args) {
        // Recupero il controller e creo la boundary
        DeliveryController controller = DeliveryController.getInstance();
        AppDelivery boundary = new AppDelivery(controller);

        // Avvio una nuova sessione e aggiungo dei piatti
        controller.nuovaSessione(); // Adesso dentro al controller c'è uno scontrino vuoto
        boundary.selezionaPiatto("PIZZA", "margherita", 5.0, false, 0);
        boundary.selezionaPiatto("PIZZA", "diavola", 6.0, true, 0);
        boundary.selezionaPiatto("PANINO", "Burger", 8.0, false, 2);

        // Conferma ordine
        boundary.checkout();

        // test 2
        controller.nuovaSessione();
        boundary.selezionaPiatto("PANINO", "Burger", 8.0, false, 2);
        boundary.selezionaPiatto("PANINO", "Burger", 8.0, false, 2);
        boundary.selezionaPiatto("PANINO", "Burger", 8.0, false, 2);
        boundary.checkout();
    }
}
