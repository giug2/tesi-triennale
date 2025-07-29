# 🎓 Ottimizzazione di Siti Web con alto contenuto di elementi e nodi

> Tesi di Laurea – Università degli Studi Roma Tre  
> Corso di Laurea in Ingegneria Informatica  

## Descrizione del progetto

Questa tesi esplora strategie di ottimizzazione per siti web caratterizzati da un'elevata complessità strutturale del DOM (Document Object Model), un problema comune nei moderni e-commerce, dashboard e applicazioni web ricche di contenuto.  
Il cuore del lavoro è l'analisi e l'applicazione della **virtualizzazione del DOM**, tecnica che permette di migliorare significativamente la performance del rendering e l'esperienza utente, riducendo i tempi di caricamento e l'utilizzo delle risorse.

## Tecnologie utilizzate

- **[React.js](https://reactjs.org/)** – Framework JavaScript basato sul Virtual DOM.
- **R[react-window](https://react-window.vercel.app/)eact-window** – Libreria per la virtualizzazione di liste e griglie.
- **[Google Lighthouse](https://developers.google.com/web/tools/lighthouse)** – Tool di Google per l’analisi delle Web Performance.
- **HTML, CSS, JavaScript** – Per la creazione del sito sperimentale.

## Obiettivi

- Evidenziare l'impatto negativo di un DOM eccessivo sulle prestazioni.
- Implementare e dimostrare un miglioramento tangibile tramite la virtualizzazione del DOM.
- Confrontare in modo quantitativo le due versioni del sito (con e senza ottimizzazione).
- Valutare approcci alternativi come paginazione e scrolling infinito.

## Risultati principali

| Versione       | Nodi DOM | Tempo di caricamento | Punteggio Lighthouse |
|----------------|----------|----------------------|----------------------|
| **Originale**  | ~83.000  | ~60s                 | Basso (Rosso)        |
| **Ottimizzata**| ~500     | ~2s                  | Alto (Verde)         |

- Riduzione del numero di nodi nel DOM da circa 83.000 a 500.
- Caricamento iniziale ridotto da circa 60 secondi a pochi secondi.
- Maggiore fluidità durante lo scroll e le interazioni.
- Miglioramento significativo nei punteggi Lighthouse (Performance, SEO, Best Practices, ecc.).

## Autore
[Gaglione Giulia](https://github.com/giug2)
