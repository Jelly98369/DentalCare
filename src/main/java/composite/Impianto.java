package composite;

public class Impianto implements Trattamento {
    private double costo;

    public Impianto(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcolaCosto() {
        return costo;
    }

    @Override
    public String getDescrizione() {
        return "Impianto dentale";
    }
}
