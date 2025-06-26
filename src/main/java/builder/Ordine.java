// Ordine.java
package builder;

import composite.Trattamento;
import strategy.CalcoloScontoStrategy;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private List<Trattamento> trattamenti;
    private CalcoloScontoStrategy strategiaSconto;
    private List<Observer> observers = new ArrayList<>();
    private String stato;

    public Ordine(List<Trattamento> trattamenti, CalcoloScontoStrategy strategiaSconto) {
        this.trattamenti = trattamenti;
        this.strategiaSconto = strategiaSconto;
    }

    public void aggiungiObserver(Observer obs) {
        observers.add(obs);
    }

    public void setStato(String nuovoStato) {
        this.stato = nuovoStato;
        notificaObservers();
    }
    public String getStato() {
        return stato;
    }

    private void notificaObservers() {
        for (Observer obs : observers) {
            obs.aggiorna(stato);
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Trattamento t : trattamenti) {
            totale += t.calcolaCosto();
        }
        return strategiaSconto.applicaSconto(totale);
    }

    public List<Trattamento> getTrattamenti() {
        return trattamenti;
    }
}
