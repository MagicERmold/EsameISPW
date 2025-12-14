package es2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException {
        GestoreAste controller = GestoreAste.getInstance();
        PortaleAste boundary =  new PortaleAste(controller);

        controller.aggiungiAsta();

        Partecipante p1 = new Partecipante("Mario");
        Partecipante p2 = new Partecipante("Luigi");
        Partecipante p3 = new Partecipante("Paolo");

        boundary.iscriviPartecipante(p1, 1);
        boundary.iscriviPartecipante(p2, 1);
        boundary.iscriviPartecipante(p3, 1);

        boundary.inviaOfferta(p1, 1, 120);
        boundary.inviaOfferta(p2, 1, 150);
        boundary.inviaOfferta(p3, 1, 100);
    }
}
