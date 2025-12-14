package es1;

public class Main {
    public static void main(String[] args) {
        // Creo la SINGOLA istanza del controller
        ParcheggioController controller = ParcheggioController.getInstance();

        // Creo la boundary
        TotemIngresso boundary = new TotemIngresso(controller);

        // Simulo l'entrata dei veicoli
        boundary.gestisciUscita("AA123BB", "AUTO", 10, 14);
        boundary.gestisciUscita("MOTO1", "MOTO", 10, 12);


    }
}
