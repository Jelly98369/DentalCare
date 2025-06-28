// Adapeter for get an old object and adapt this as Trattamento
package adapter;

import composite.Trattamento;

public class TrattamentoAdapter implements Trattamento {
    private VecchioTrattamento vecchio;

    public TrattamentoAdapter(VecchioTrattamento vecchio) {
        this.vecchio = vecchio;
    }

    @Override
    public double calcolaCosto() {
        return vecchio.getPrezzo();
    }

    @Override
    public String getDescrizione() {
        return vecchio.getNome();
    }
}
