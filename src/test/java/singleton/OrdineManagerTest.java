package singleton;

import builder.Ordine;
import builder.OrdineBuilder;
import composite.Corona;
import strategy.NessunoSconto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrdineManagerTest {
    @Test
    public void testSingleton() {
        Ordine ordine = new OrdineBuilder()
                .aggiungi(new Corona(100))
                .conStrategia(new NessunoSconto())
                .build();

        OrdineManager.getInstance().aggiungiOrdine(ordine);
        assertFalse(OrdineManager.getInstance().getOrdini().isEmpty());
    }
}