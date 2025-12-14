package es2;

import java.io.IOException;

public class PortaleAste {
    GestoreAste gestoreAste;

    public PortaleAste(GestoreAste gestoreAste) {
        this.gestoreAste = gestoreAste;
    }

    public void inviaOfferta(Partecipante p, int idAsta, double importo) throws IOException {
        OffertaBean bean = new OffertaBean(p.getNome(), idAsta,  importo);

        gestoreAste.elaboraOfferta(bean);
    }

    public void iscriviPartecipante(Partecipante p, int idAsta){
        OffertaBean bean = new OffertaBean(p.getNome(), idAsta);

        gestoreAste.iscriviPartecipante(p, idAsta);
    }
}
