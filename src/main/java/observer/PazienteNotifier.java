package observer;

public class PazienteNotifier implements Observer {
    private String nome;

    public PazienteNotifier(String nome) {
        this.nome = nome;
    }

    @Override
    public void aggiorna(String statoOrdine) {
        System.out.println("📢 Paziente " + nome + ": lo stato del tuo ordine è cambiato -> " + statoOrdine);
    }
}
