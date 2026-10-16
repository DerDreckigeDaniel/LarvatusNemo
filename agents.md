# agents.md – Larvatus Nemo

Anweisungen für KI-Assistenten und Agenten, die an diesem Projekt mitarbeiten.

**Projekt:** Larvatus Nemo, ein psychologisches Text-Horror-Adventure für die Konsole
**Autor:** Daniel Redl
**Kontext:** Persönliches Semesterprojekt, Wirtschaftsinformatik, FH Technikum Wien

---

## 1. Vor jeder Aufgabe

1. Lies **`memory.md`**. Dort stehen alle Konzeptentscheidungen (Personen, Opfer-Reihenfolge, Ablauf, Regeln).
2. Prüfe in **`features.md`**, auf welche Feature-Nummer sich die Aufgabe bezieht.
3. Widerspricht eine Aufgabe dem Konzept in `memory.md`, weise darauf hin und frage nach, bevor du etwas umsetzt.

## 2. Verbindliche technische Vorgabe der Lehrveranstaltung

> „The project should use structured programming in Java including records or simple classes. No abstractions, inheritance, Collections or other higher level Java features may be used.“

### Was in der Lehrveranstaltung geübt wurde
Die Übungssammlung der LV („BWI Structured Programming Lab“) ist in diese Themen gegliedert:
Formatierte Ein- und Ausgabe · Berechnungen · Verzweigungen (Selection Statements) · Schleifen (Iteration Statements) · Arrays · Arrays und Funktionen · Mehrdimensionale Arrays · Graphen · Sortieren und Rekursion.

Der Code soll sich an diesem Niveau orientieren. Wer die Übungen gemacht hat, muss den Projektcode vollständig verstehen können.

### Erlaubt (in der LV verwendet)
- Primitive Datentypen (`int`, `double`, `boolean`, `char`) und `String`
- `if`/`else`, `switch`, `for`, `while`, `do-while`
- Statische Methoden mit Parametern und Rückgabewerten
- Eindimensionale und mehrdimensionale Arrays (`int[]`, `String[]`, `int[][]`, `String[][]`)
- `Scanner` für Eingaben (`nextInt()`, `nextLine()`), `System.out.println` und `System.out.printf` für Ausgaben
- `java.util.Random` für Zufall
- Konstanten mit `static final`
- **Menüs mit nummerierter Auswahl** über `switch`, wie in der Übung *ZooManager*

### Erlaubt laut Projektvorgabe, aber sparsam einsetzen
- `record`s und einfache Klassen ohne Vererbung, nur um zusammengehörige Daten zu bündeln (z. B. `Person`, `Raum`)
- Einfache `String`-Methoden (`equals`, `equalsIgnoreCase`, `trim`, `toLowerCase`). Sie kommen in den Übungen kaum vor, daher bei der ersten Verwendung kurz erklären.

### Verboten
- `abstract`, `interface`, `extends`, `implements`, Polymorphie
- Collections: `ArrayList`, `List`, `HashMap`, `Map`, `Set` usw.
- Streams, Lambdas, Methodenreferenzen, `Optional`
- Generics, Enums, Reflection, Threads
- Exceptions selbst definieren; `try`/`catch` nur, wenn unbedingt nötig, und dann erklären
- Externe Bibliotheken

Wenn eine Lösung mit verbotenen Mitteln einfacher wäre, nutze trotzdem eine erlaubte Lösung, z. B. ein Array fester Größe mit Zähler statt einer `ArrayList`.

### Eingabe: nummerierte Menüs statt Textbefehle
Spieleraktionen werden **ausschließlich als nummerierte Menüs** umgesetzt, nicht als freie Textbefehle:

```
Du bist im Gemeinschaftsraum. Anwesend: Nora, Johan.
1) Raum wechseln
2) Mit jemandem sprechen
3) Jemanden untersuchen
4) Raum durchsuchen
5) Notizbuch öffnen
Auswahl: _
```

Das entspricht dem Stoff der LV (`nextInt()` + `switch`), ist robuster gegen Tippfehler und leichter zu testen.

## 3. Code-Stil

- Bezeichner auf **Deutsch** in camelCase, passend zu `memory.md` (z. B. `aktuellerRaum`, `naechstesOpfer`, `Person`, `Raum`, `Hinweis`)
- Klassen und Records in PascalCase, Konstanten in GROSSBUCHSTABEN (`ANZAHL_RAEUME = 10`)
- Kurze Methoden mit einer klaren Aufgabe
- Kommentare auf Deutsch, die erklären, **warum** etwas passiert
- Keine Magic Numbers: Indizes für Räume und Personen als Konstanten (`RAUM_FUNKRAUM = 7`, `PERSON_JOHAN = 0`)
- Spieltexte (Dialoge, Beschreibungen) getrennt von der Spiellogik halten, z. B. in einer eigenen Klasse `Texte` mit statischen Arrays

### Geplante Dateistruktur
```
src/
  Main.java        – Startpunkt, Hauptmenü, Spielschleife
  Raum.java        – record für Räume (Name, Beschreibung, Ausgänge als Indizes)
  Person.java      – record für die festen Daten einer Person (Name, Beschreibung, Ausgangs-Vitalwerte)
  Hinweis.java     – record für Spuren, Botschaften, Funksprüche
  Spielzustand.java – einfache Klasse mit Tag, Aktionen, Lebenden, nächstem Opfer
  Texte.java       – alle Spieltexte als statische Arrays
  Befehle.java     – Verarbeitung der Spielereingaben
```
Diese Struktur ist ein Vorschlag. Änderungen bitte begründen.

### Wichtig: Records sind unveränderlich
Ein `record` kann nach dem Erzeugen nicht mehr geändert werden. Deshalb gilt:
- In Records stehen **nur feste Daten** (Name, Beschreibung, Ausgänge, Ausgangswerte).
- Alles, was sich im Spiel ändert, steht in **Arrays mit einem Eintrag pro Person**, z. B. `boolean[] lebt`, `int[] vertrauen`, `int[] verdacht`, `int[] aufenthaltsort`.
- Das Bunkerprotokoll ist ein zweidimensionales Array `int[tag][person]`, das den Raum-Index speichert.
- Der Index einer Person ist überall gleich (`PERSON_JOHAN = 0` gilt für alle Arrays).

## 4. Arbeitsweise

- **Ein Feature pro Schritt.** Setze nur das um, worum gebeten wurde, und nenne die Feature-Nummer.
- **Erklären statt nur liefern.** Dies ist ein Lernprojekt. Erkläre neuen Code kurz und verständlich, besonders Stellen, die über die Grundlagen hinausgehen.
- **Auf dem Niveau des Autors bleiben.** Keine „cleveren“ Profi-Lösungen. Die LV warnt ausdrücklich davor, dass fortgeschrittene Lösungen eher verwirren als helfen. Lieber einfacher und länger als kurz und unverständlich.
- **Bei Fehlern zuerst Hinweise geben**, nicht sofort fertigen Code. Der Autor soll selbst debuggen lernen (z. B. mit Breakpoints in IntelliJ).
- **Kleine, lauffähige Schritte.** Nach jedem Schritt muss das Programm kompilieren und starten.
- **Kein unaufgefordertes Umschreiben** von bestehendem Code. Verbesserungsvorschläge bitte als Vorschlag formulieren.
- Nach einer Umsetzung kurz angeben: was geändert wurde, welche Dateien betroffen sind und wie man es testet.
- Wenn eine Konzeptentscheidung getroffen wird, darauf hinweisen, dass `memory.md` aktualisiert werden sollte.

## 5. Inhaltliche Regeln für das Spiel

Diese Regeln sind der Kern des Spiels und dürfen beim Schreiben von Texten und Logik nicht verletzt werden:

1. **Der Nachahmer (Johan) lügt nie.** Jede seiner Aussagen muss wahr sein, darf aber mehrdeutig sein oder etwas weglassen.
2. **Unschuldige dürfen sich widersprechen** (aus Angst, Scham, Trauma oder Eigennutz) und bleiben trotzdem Menschen.
3. **Falsche Fährten sind gewollt.** Daria, Vincent, Tobias und Pablo sollen verdächtig wirken können.
4. **Psychische Auffälligkeit ist kein Beweis.** Kein Text darf nahelegen, dass psychisch belastete Menschen Monster sind.
5. **Pablo beschuldigt reihum alle.** Seine Vorwürfe gegen Johan sind berechtigt, aber nicht auffälliger als die gegen andere.
6. **Die Tells des Nachahmers sind subtil** (siehe `memory.md`, Abschnitt 7). Kein einzelner Hinweis darf ihn eindeutig verraten, außer in den späten Tagen.
7. **Die Bedrohung ist neu.** Es gibt keine alten Aufzeichnungen oder Tagebücher. Der Bunker gehört dem Spieler.
8. **Steigerung einhalten:** Tag 1 ruhig, Tag 2 Untersuchungen, ab Tag 3 Anspielungen, späte Tage eindeutigere Hinweise.
9. Das Wesen heißt **Nemo**, auch „der Nachahmer“. In der Rolle des Menschen tritt es als Johan auf.

### Ton und Sprache
- Alle Spieltexte auf **Deutsch**
- Düster, ruhig, psychologisch und eher andeutend als explizit
- Gewalt wird nicht ausgeschlachtet. Der Horror entsteht durch Andeutung, Kälte und Erkenntnis.
- Jede Person hat eine eigene, wiedererkennbare Sprechweise (siehe Personenbeschreibungen in `memory.md`)

## 6. Kommende Anforderungen der LV

Code und Dokumentation sollen von Anfang an darauf ausgerichtet sein:
- **Woche 8:** lauffähiger Grundcode, `manual.md` (Bedienungsanleitung), mindestens 1 Feature umgesetzt und in `features.md` mit ✅ markiert, Screenshot eines Breakpoints beim Debuggen
- **Woche 12:** mindestens 5 Features fertig und funktionsfähig (mit ✅ markiert), Code kompiliert, 3-Minuten-Video der Anwendung
- **Abschluss:** Präsentation „Lessons learned“ mit Beispielen

Daraus folgt: Der Code muss **immer kompilieren**. Erledigte Features werden in `features.md` mit ✅ markiert. Wenn ein Feature fertig ist, auf die passende Aktualisierung von `features.md` und `manual.md` hinweisen.

## 7. Prompt-Tagebuch

Die Zusammenarbeit mit KI wird im Prompt-Tagebuch dokumentiert. Antworten sollten so formuliert sein, dass nachvollziehbar bleibt, welcher Teil des Codes von der KI vorgeschlagen und welcher vom Autor angepasst wurde.
