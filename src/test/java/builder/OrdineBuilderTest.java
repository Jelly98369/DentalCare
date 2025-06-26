package builder;

import composite.Corona;
import composite.Trattamento;
import observer.PazienteNotifier;
import org.junit.jupiter.api.Test;
import strategy.NessunoSconto;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrdineBuilderTest {
    @Test
    public void testCostruzioneOrdine() {
        Trattamento t = new Corona(100);
        Ordine ordine = new OrdineBuilder()
                .aggiungi(t)
                .conStrategia(new NessunoSconto())
                .build();

        assertEquals(1, ordine.getTrattamenti().size());
        assertEquals(100.0, ordine.calcolaTotale());
    }
}