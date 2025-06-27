
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

## 📐 Documentazione UML

La progettazione è documentata mediante diagrammi **UML** generati con **PlantUML**.

| File | Contenuto | Finalità didattica |
|------|-----------|--------------------|
| `ClassDiagram.png` | Diagramma delle classi: componenti principali, relazioni, stereotipi dei pattern. | Agevola il valutatore nella verifica della corretta applicazione dei pattern e nella lettura dell’architettura statica. |
| `ClassDiagram.puml` | Sorgente PlantUML che produce l’immagine. | Offre tracciabilità, possibilità di rigenerare o estendere il diagramma senza software proprietari. |

> **Rigenerare il diagramma**
> 1. Aprire `ClassDiagram.puml` in IntelliJ IDEA con il plugin *PlantUML Integration*.
> 2. Selezionare **Preview** (👁️) per il rendering.
> 3. Esportare con **Save as → PNG** e sovrascrivere `ClassDiagram.png`.
> 4. Committare entrambi i file per mantenere sincronizzati sorgente e immagine.

## 🚫 Limitazioni e Lavori Futuri

- Attualmente, l’interfaccia utente è solo testuale.
- I dati non vengono persistiti in un database relazionale.
- Il logging potrebbe essere ulteriormente raffinato.
- Possibile integrazione futura con GUI JavaFX o REST API.

## 👨‍💻 Autore

Realizzato come progetto finale per il corso di **Programmazione ad Oggetti - Java SE**.
"# DentalCare" 
