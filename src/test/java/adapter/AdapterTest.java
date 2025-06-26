package adapter;

import composite.Trattamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {
    @Test
    public void testAdapter() {
        VecchioTrattamento vecchio = new VecchioTrattamento("Laser", 99.99);
        Trattamento adattato = new TrattamentoAdapter(vecchio);
        assertEquals("Laser", adattato.getDescrizione());
        assertEquals(99.99, adattato.calcolaCosto());
    }
}