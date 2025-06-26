package strategy;

public class NessunoSconto implements CalcoloScontoStrategy {
    @Override
    public double applicaSconto(double prezzo) {
        return prezzo;
    }
}