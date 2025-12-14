package es1;

public class ParcheggioController {
    private static ParcheggioController instance; // FONDAMENTALE per il SINGLETON

    // Costruttore PRIVATE fondamentale per il SINGLETON
    private ParcheggioController() {
        System.out.println("Creazione istanza unica");
    }

    // Metodo che imposta la singola istanza
    public static ParcheggioController getInstance() {
        if (instance == null) {
            instance = new ParcheggioController();
        }
        return instance;
    }

    // Metodo che prende i dati del BEAN e crea il veicolo
    public void elaboraPagamento(IngressoBean dati){
        System.out.println("Elaborazione pagamento in corso...");

        // Creo il veicolo come variabile locale
        Veicolo v = null;

        // Controllo se è un'auto o una moto
        if(dati.getTipoVeicolo().equals("AUTO")){
            // Nota il principio di Liskov
            v = new Auto(dati.getTarga(), dati.getOrarioIngresso());
        } else if (dati.getTipoVeicolo().equals("MOTO")) {
            v = new Moto(dati.getTarga(), dati.getOrarioIngresso());
        }

        if(v == null ){
            System.out.println("Errore durante la creazione del veicolo");
        }else{
            // Per il principio di LISKOV anche se ho creato un'AUTO o MOTO posso applicare i stessi metodi.
            v.calcolaTariffa(dati.getOrarioUscita());

            // Salvo il ticket
            Ticket t = new Ticket(v, dati.getOrarioUscita());
            FileTicketDAO tDAO = new FileTicketDAO();
            tDAO.salvaTicket(t);
            // I file sono stati creati correttamente

            // Stampo a schermo la tariffa per il veicolo
            System.out.println("La tariffa da pagare per il veicolo con targa: " + v.getTarga() + " è di: " + v.getTariffa());
        }

    }
}
