package iterator;

import composite.Corona;
import composite.Trattamento;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrattamentoIteratorTest {
    @Test
    public void testIterator() {
        List<Trattamento> lista = new ArrayList<>();
        lista.add(new Corona(100));
        TrattamentoIterator it = new TrattamentoIterator(lista);
        assertTrue(it.hasNext());
        assertEquals("Corona", it.next().getDescrizione());
    }
}