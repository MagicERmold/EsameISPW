package es2;

public class Partecipante implements OsservatoreAsta {
    private String nome;

    public Partecipante(String nome) {
        this.nome = nome;
    }

    @Override
    public void aggiornaAsta(String messaggio) {
        System.out.println(this.nome + " ha ricevuto il messaggio: " + messaggio);
    }

    public String getNome() {
        return this.nome;
    }
}
