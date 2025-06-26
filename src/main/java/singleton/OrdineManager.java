package singleton;

import builder.Ordine;
import java.util.List;
import java.util.ArrayList;

public class OrdineManager {
    private static OrdineManager instance;
    private final List<Ordine> ordini = new ArrayList<>();
    private OrdineManager() {}
    public static synchronized OrdineManager getInstance() {
        if (instance == null) instance = new OrdineManager();
        return instance;
    }
    public void aggiungiOrdine(Ordine o) { ordini.add(o); }
    public List<Ordine> getOrdini() { return new ArrayList<>(ordini); }
}
