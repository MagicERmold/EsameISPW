package es1;

public class TotemIngresso {
    // final è un consiglio di intelliJ, non è essenziale, però è utile per garantire più sicurezza
    private final ParcheggioController controller;

    // Costruttore che imposta il controller
    public TotemIngresso(ParcheggioController controller) {
        this.controller = controller;
    }

    // Metodo che prende in input i dati e crea l'istanza del BEAN e la passa al controller
    public void gestisciUscita(String targa, String tipo, int in, int out){
        // Istanzio il BEAN
        IngressoBean bean =  new IngressoBean(targa, tipo, in, out);

        // Chiamo il metodo del controller e gli passo il BEAN
        controller.elaboraPagamento(bean);
    }
}
