// Builder for order, can also add there a strategy
package builder;

import composite.Trattamento;
import strategy.CalcoloScontoStrategy;
import strategy.NessunoSconto;

import java.util.ArrayList;
import java.util.List;

public class OrdineBuilder {
    private final List<Trattamento> trattamenti = new ArrayList<>();
    private CalcoloScontoStrategy strategia = new NessunoSconto();

    public OrdineBuilder aggiungi(Trattamento t) {
        trattamenti.add(t);
        return this;
    }
    public OrdineBuilder conStrategia(CalcoloScontoStrategy s) {
        strategia = s;
        return this;
    }
    public Ordine build() {
        return new Ordine(trattamenti, strategia);
    }
}
