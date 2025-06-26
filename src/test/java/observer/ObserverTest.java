package observer;

import builder.Ordine;
import builder.OrdineBuilder;
import composite.Corona;
import strategy.NessunoSconto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {
    @Test
    public void testNotifica() {
        PazienteNotifier p = new PazienteNotifier("Mario");
        Ordine o = new OrdineBuilder()
                .aggiungi(new Corona(120))
                .conStrategia(new NessunoSconto())
                .build();
        o.aggiungiObserver(p);
        o.setStato("IN ATTESA");

        assertEquals("IN ATTESA", o.getStato());
    }
}