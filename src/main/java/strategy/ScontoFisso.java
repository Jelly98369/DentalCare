// Other implementation of my strategy wave
package strategy;

public class ScontoFisso implements CalcoloScontoStrategy {
    private final double sconto;

    public ScontoFisso(double sconto) {
        this.sconto = sconto;
    }

    @Override
    public double applicaSconto(double prezzo) {
        return prezzo - sconto;
    }
}