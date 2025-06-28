// Class for implements composite pattern and generate composite objects using Leaf
package composite;

import java.util.ArrayList;
import java.util.List;

public class ProtesiComposite implements Trattamento {
    private String descrizione;
    private List<Trattamento> componenti;

    public ProtesiComposite(String descrizione) {
        this.descrizione = descrizione;
        this.componenti = new ArrayList<>();
    }

    public void aggiungi(Trattamento t) {
        componenti.add(t);
    }

    public void rimuovi(Trattamento t) {
        componenti.remove(t);
    }

    @Override
    public double calcolaCosto() {
        return componenti.stream().mapToDouble(Trattamento::calcolaCosto).sum();
    }

    @Override
    public String getDescrizione() {
        return descrizione + " (" + componenti.size() + " trattamenti)";
    }
}
