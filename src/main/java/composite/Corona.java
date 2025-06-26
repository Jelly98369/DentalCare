package composite;

public class Corona implements Trattamento {
    private double costo;

    public Corona(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcolaCosto() {
        return costo;
    }

    @Override
    public String getDescrizione() {
        return "Corona dentale";
    }
}
