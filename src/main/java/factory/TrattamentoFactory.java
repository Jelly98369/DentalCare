// My factory for generate Trattamento: corona or impianto
package factory;

import composite.Trattamento;
import composite.Corona;
import composite.Impianto;

public class TrattamentoFactory {
    public static Trattamento crea(String tipo, double costo) {
        switch (tipo.toLowerCase()) {
            case "corona": return new Corona(costo);
            case "impianto": return new Impianto(costo);
            default: throw new IllegalArgumentException("Tipo non riconosciuto: " + tipo);
        }
    }
}
