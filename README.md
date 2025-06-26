
# DentalCare

## 🧾 Overview

**DentalCare** è un'applicazione Java SE progettata per gestire ordini di trattamenti odontoiatrici simulando un sistema gestionale completo. L’app permette di creare, gestire e visualizzare ordini di trattamenti dentali tramite l'uso di pattern di progettazione, tecnologie core Java e pratiche di programmazione sicura.

## 🛠️ Tecnologie e Pattern Utilizzati

### 🔧 Core Java Technologies
- **Collections & Generics**: utilizzati per gestire liste di trattamenti e iterazioni su collezioni tipizzate.
- **Java I/O**: per la lettura/scrittura su file degli ordini.
- **Logging**: per la tracciabilità delle operazioni critiche.
- **JUnit**: test unitari su tutti i pattern principali.

### 🧩 Design Patterns (Obbligatori)
- **Factory** – `TrattamentoFactory`: crea dinamicamente oggetti `Trattamento`.
- **Composite** – `ProtesiComposite`: struttura gerarchica di trattamenti (es. corona, impianto).
- **Iterator** – `TrattamentoIterator`: per iterare trattamenti all’interno delle protesi.
- **Exception Shielding** – `ExceptionHandler`: per incapsulare e loggare eccezioni in modo sicuro.

### 🔁 Design Patterns (Aggiuntivi)
- **Strategy** – `CalcoloScontoStrategy`, `ScontoFisso`, `NessunoSconto`: per calcolare dinamicamente sconti.
- **Builder** – `OrdineBuilder`: costruisce oggetti `Ordine` con configurazioni flessibili.
- **Observer** – `PazienteNotifier`, `Observer`: per notificare cambiamenti di stato degli ordini.
- **Singleton** – `OrdineManager`: gestione centralizzata degli ordini.
- **Adapter** – `TrattamentoAdapter`: integra vecchie implementazioni di trattamenti.

## 🧪 Esecuzione e Setup

1. **Requisiti**:
   - Java SE 17+
   - Maven (per compilazione e test)

2. **Compilazione e Esecuzione**:
```bash
mvn clean install
java -cp target/DentalCare-1.0-SNAPSHOT.jar main.MainApp
```

3. **Esecuzione Test**:
```bash
mvn test
```

## 📐 UML Diagrams

Sono forniti due diagrammi:
- `ArchitectureOverview.png`: schema delle interazioni tra i principali package.
- `ClassDiagram.png`: diagramma delle classi (vedi file allegato).

## 🚫 Limitazioni e Lavori Futuri

- Attualmente, l’interfaccia utente è solo testuale.
- I dati non vengono persistiti in un database relazionale.
- Il logging potrebbe essere ulteriormente raffinato.
- Possibile integrazione futura con GUI JavaFX o REST API.

## 👨‍💻 Autore

Realizzato come progetto finale per il corso di **Programmazione ad Oggetti - Java SE**.
"# DentalCare" 
