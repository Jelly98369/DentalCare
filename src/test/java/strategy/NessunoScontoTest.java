package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NessunoScontoTest {
    @Test
    public void testApplicaSconto() {
        CalcoloScontoStrategy sconto = new NessunoSconto();
        assertEquals(100.0, sconto.applicaSconto(100.0));
    }
}