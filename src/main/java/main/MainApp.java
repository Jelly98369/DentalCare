package main;

import factory.TrattamentoFactory;
import composite.ProtesiComposite;
import exception.ExceptionHandler;
import strategy.ScontoFisso;
import strategy.NessunoSconto;
import builder.OrdineBuilder;
import singleton.OrdineManager;
import adapter.TrattamentoAdapter;
import adapter.VecchioTrattamento;
import iterator.TrattamentoIterator;
import observer.PazienteNotifier;
import composite.Trattamento;
import composite.Corona;
import composite.Impianto;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // Instance of scanner for read input, for observer and for Collection
        Scanner scanner = new Scanner(System.in);
        List<Trattamento> trattamentiScelti = new ArrayList<>();
        PazienteNotifier paziente = null;

        System.out.println("=== DentalCare Manager ===");
        boolean running = true;

        // Composite Pattern instance
        ProtesiComposite protesi = new ProtesiComposite("Protesi Composita");
        protesi.aggiungi(new Corona(120));
        protesi.aggiungi(new Impianto(250));

        // Adapter Pattern instance
        VecchioTrattamento vecchio = new VecchioTrattamento("Trattamento laser vecchio", 99.99);
        Trattamento adattato = new TrattamentoAdapter(vecchio);

        while (running) {
            try {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Inserisci paziente");
                System.out.println("2. Aggiungi trattamento (corona/impianto/composito/legacy)");
                System.out.println("3. Visualizza trattamenti scelti");
                System.out.println("4. Crea ordine, visualizza e notifica");
                System.out.println("5. Visualizza storico ordini");
                System.out.println("6. Esci");
                System.out.print("Scelta: ");
                String scelta = scanner.nextLine();

                switch (scelta) {
                    case "1":
                        System.out.print("Nome paziente: ");
                        paziente = new PazienteNotifier(scanner.nextLine());
                        break;
                    case "2":
                        System.out.print("Tipo trattamento: ");
                        String tipo = scanner.nextLine();
                        if (tipo.equalsIgnoreCase("composito")) {
                            trattamentiScelti.add(protesi);
                        } else if (tipo.equalsIgnoreCase("legacy")) {
                            trattamentiScelti.add(adattato);
                        } else {
                            System.out.print("Costo: ");
                            double costo = Double.parseDouble(scanner.nextLine());
                            Trattamento t = TrattamentoFactory.crea(tipo, costo);
                            trattamentiScelti.add(t);
                        }
                        break;
                    case "3":
                        TrattamentoIterator iterator = new TrattamentoIterator(trattamentiScelti);
                        while (iterator.hasNext()) {
                            Trattamento t = iterator.next();
                            System.out.println("- " + t.getDescrizione() + ": €" + t.calcolaCosto());
                        }
                        break;
                    case "4":
                        if (paziente == null) {
                            System.out.println("Prima inserisci il paziente.");
                            break;
                        }

                        System.out.println("Scegli tipo di sconto: 1) Nessuno  2) Sconto fisso di 10 euro");
                        String sceltaSconto = scanner.nextLine();
                        var strategia = sceltaSconto.equals("2") ? new ScontoFisso(10) : new NessunoSconto();

                        OrdineBuilder builder = new OrdineBuilder().conStrategia(strategia);
                        for (Trattamento t : trattamentiScelti) {
                            builder.aggiungi(t);
                        }
                        var ordine = builder.build();
                        ordine.aggiungiObserver(paziente);
                        ordine.setStato("IN CORSO");
                        OrdineManager.getInstance().aggiungiOrdine(ordine);

                        // Order visualization and total calculation of final price
                        System.out.println("\n--- Riepilogo Ordine ---");
                        double totale = 0.0;
                        for (Trattamento t : trattamentiScelti) {
                            double costo = t.calcolaCosto();
                            System.out.println(t.getDescrizione() + ": €" + costo);
                            totale += costo;
                        }
                        double totaleScontato = strategia.applicaSconto(totale);
                        System.out.println("Totale senza sconto: €" + totale);
                        System.out.println("Totale con sconto: €" + totaleScontato);
                        break;
                    case "5":
                        System.out.println("\n--- Storico Ordini ---");
                        for (var o : OrdineManager.getInstance().getOrdini()) {
                            System.out.println("Ordine con stato: " + o.getStato());
                            for (Trattamento t : o.getTrattamenti()) {
                                System.out.println("- " + t.getDescrizione() + ": €" + t.calcolaCosto());
                            }
                            System.out.println("Totale ordine (scontato): €" + o.calcolaTotale());
                            System.out.println("----------------------------");
                        }
                        break;
                    case "6":
                        running = false;
                        break;
                    default:
                        System.out.println("Scelta non valida.");
                }
            } catch (Exception e) {
                ExceptionHandler.log(e, "Errore nel menu principale");
            }
        }
        scanner.close();
    }
}
