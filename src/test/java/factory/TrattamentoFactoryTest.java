package factory;

import composite.Trattamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrattamentoFactoryTest {
    @Test
    public void testCreaCorona() {
        Trattamento t = TrattamentoFactory.crea("corona", 120);
        assertEquals("Corona", t.getDescrizione());
        assertEquals(120.0, t.calcolaCosto());
    }
}