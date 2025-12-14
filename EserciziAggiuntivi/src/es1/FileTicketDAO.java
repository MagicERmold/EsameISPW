package es1;

import java.io.*;

public class FileTicketDAO implements TicketDAO {
    @Override
    public void salvaTicket(Ticket t) {
        // Imposto il nome del file con la targa
        String nomeFile = "ticket_" + t.getTarga() + ".dat";

        try (
                // Prova a creare i FILE
                FileOutputStream out = new FileOutputStream(nomeFile);
                ObjectOutputStream oos = new ObjectOutputStream(out);
                ){
            // Scrivi sui file
            oos.writeObject(t);
            System.out.println("Ticket salvato con sucesso!");

        } catch (IOException e) {
            // Se non vengono creati i file lancia l'eccezione
            throw new RuntimeException(e);
        }
    }
}
