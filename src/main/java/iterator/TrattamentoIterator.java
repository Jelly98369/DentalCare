// My custom Iterator for List of Trattamenti
package iterator;

import composite.Trattamento;
import java.util.Iterator;
import java.util.List;

public class TrattamentoIterator implements Iterator<Trattamento> {
    private final List<Trattamento> lista;
    private int pos = 0;
    public TrattamentoIterator(List<Trattamento> lista) { this.lista = lista; }
    @Override public boolean hasNext() { return pos < lista.size(); }
    @Override public Trattamento next() { return lista.get(pos++); }
}
