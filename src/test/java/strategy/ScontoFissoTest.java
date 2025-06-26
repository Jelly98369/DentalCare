package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScontoFissoTest {
    @Test
    public void testApplicaSconto() {
        CalcoloScontoStrategy sconto = new ScontoFisso(10);
        assertEquals(90.0, sconto.applicaSconto(100.0));
    }
}