# Projekt-Memory – Larvatus Nemo

> Kontextdatei für KI-Agenten, die an diesem Projekt arbeiten. Vor jeder Aufgabe lesen.
> Wird laufend aktualisiert, sobald neue Entscheidungen getroffen werden.
> Ausführliche Beschreibung: `README.md` · Feature-Liste: `features.md` · Regeln für Agenten: `agents.md` · Verlauf: `prompt_diary.md`

**Letzte Aktualisierung:** 16.10.2026
**Repository:** https://github.com/DerDreckigeDaniel/LarvatusNemo

## 1. Rahmen
- **Autor:** Daniel Redl
- **Kontext:** Persönliches Semesterprojekt, Wirtschaftsinformatik, FH Technikum Wien (LV Strukturierte Programmierung)
- **Ziel der LV:** Wissen praktisch anwenden und generative KI beim Programmieren einsetzen und dokumentieren
- **Status:** Konzeptphase abgeschlossen. Noch kein Code.

## 2. Technische Vorgaben (verbindlich)
> „The project should use structured programming in Java including records or simple classes. No abstractions, inheritance, Collections or other higher level Java features may be used.“

- Java-Konsolenanwendung (Terminal), Eingabe über `Scanner`
- Erlaubt: primitive Typen, `String`, Verzweigungen, `switch`, Schleifen, statische Methoden, ein- und mehrdimensionale Arrays, `printf`, `Random`, `static final`, Records und einfache Klassen
- Verboten: `abstract`, Interfaces, Vererbung, Collections, Streams, Lambdas, Generics, Enums, Threads, externe Bibliotheken
- Code auf dem Niveau der LV-Übungen halten (Ein-/Ausgabe, Verzweigungen, Schleifen, Arrays, mehrdim. Arrays, Sortieren, Rekursion)

## 3. Abgaben
| Termin | Inhalt | Status |
|---|---|---|
| Woche 4 (16.10.2026, 23:00) | Git-Link (`redl_git_project.txt`) mit readme.md, features.md, agents.md, Prompt-Tagebuch | in Arbeit |
| Woche 8 | Lauffähiger Code, `manual.md`, mind. 1 Feature mit ✅, Screenshot eines Breakpoints | offen |
| Woche 12 | Mind. 5 Features fertig mit ✅, Code kompiliert, 3-Minuten-Video | offen |
| Selbststudium | Präsentation „Lessons learned“ (Projekt, Erkenntnisse mit Beispielen, was man anders machen würde) | offen |

**Dateien im Repo:** `README.md`, `features.md` (42 Features + Umsetzungsreihenfolge), `agents.md`, `memory.md`, `prompt_diary.md`

## 4. Spielkonzept

**Titel:** Larvatus Nemo, „der maskierte Niemand“. Doppelte Lesart: „niemand ist maskiert“ ist der Irrtum der Gruppe.
**Genre:** Psychologisches Text-Horror-Adventure. Inspiration: *Papers, Please*, *No, I'm Not a Human*, *Werwolf*, *Monster*, Psychopathie-Forschung.

**Prämisse:** Ein **weltweiter** Notfallalarm, niemand weiß, wovor. Der Spieler ist ein ehemaliger Militärarzt mit eigenem, privatem Bunker und lässt acht Menschen ein. Einer davon ist **Nemo, der Nachahmer** (Skinwalker): ein Wesen, das Menschen mit kalter, KI-artiger Logik kopiert, „lebendig leblos“, ein Apex-Predator, der jagt, indem er sich unbemerkt unter seine Beute mischt. Die Bedrohung ist **neu**. Es gibt **keine** alten Aufzeichnungen oder Tagebücher.

**Kern-Twist:** Der Nachahmer **lügt nie**. Seine Aussagen sind wahr, aber mehrdeutig. Unschuldige widersprechen sich aus Angst, Scham oder Trauma. Daraus entsteht das moralische Dilemma. Der Spieler wird Teil von Nemos Spiel.

## 5. Ablauf
- **Tag 0 – Einlass (Orientierungsphase):** Acht Personen treffen ein. Einlassfragen + ärztliche Erstuntersuchung (Puls, Pupillen, Temperatur, Atmung) als Ausgangswerte.
- **Tag 1 – Die Ruhe:** Entspannt, niemand ahnt etwas. Ein **Sachtext über den Kuckuck** (Brutparasitismus) liegt harmlos im Gemeinschaftsraum. In der Nacht stirbt der erste Mensch.
- **Ab Tag 2 – Zyklus:** Tag (Räume, Gespräche, Untersuchungen) → Abend (freiwillig eine Person töten) → Nacht (der Nachahmer tötet).
- **Hinweis-Steigerung:** Tag 2 Untersuchungen. Ab Tag 3 Anspielungen (Spuren, kryptische Botschaften, Hinterlassenschaften der Opfer). Späte Tage eindeutigere Hinweise wie Funksprüche anderer Schutzräume.
- **Zwei Analysephasen:** früh Aussagen mit dem Bunkerprotokoll abgleichen, spät Persönlichkeiten mit dem Profil des Wesens.

**Nachtregel:** Feste Opferreihenfolge. Hat der Spieler am Abend genau die nächste Zielperson getötet, stirbt in dieser Nacht niemand, und die Reihenfolge rückt weiter.

**Opfer-Reihenfolge:** Marvin → Daria → Pablo → Vincent → Tobias → Nora. Anna bleibt übrig.

## 6. Personen (8)
| Name | Wirkung | Wahrheit |
|---|---|---|
| Johan | Ruhig, warm, Vermittler, hilft bei Untersuchungen | **Nemo, der Nachahmer** |
| Nora | Sonnenschein, aufrichtig, offen, hält die Gruppe zusammen | Echt. Johan kopiert ihre Wärme und übernimmt nach ihrem Tod ihre Redewendungen. Stirbt spät. |
| Vincent | Harter Einzelgänger, Ex-Spielsüchtiger, mysteriös, nachts unterwegs; die Spur führt zu ihm | Tief und intelligent, liest Leute vom Pokertisch. Öffnet sich nach mehreren Gesprächen. Hinterlässt am Abend vor seiner Todesnacht eine Spielkarte mit Notiz; Deutlichkeit hängt vom Vertrauen ab. |
| Daria | Kalt, leer | Trauma, ihre Familie ist beim Alarm gestorben |
| Tobias | Widersprüchlich | Verbirgt etwas Beschämendes |
| Pablo | Aggressiv, paranoid, beschuldigt **reihum alle** | Seine Vorwürfe gegen Johan sind berechtigt, aber unauffällig |
| Marvin | Rational, analytisch, bietet Hilfe an | Bemerkt zu früh etwas, stirbt zuerst |
| Anna | Jung, ängstlich, klammert sich an Johan | Wird gespiegelt, verteidigt ihn bis zum Schluss |

Falsche Fährten sind gewollt. Psychische Auffälligkeit macht niemanden zum Monster.

## 7. Tells des Nachahmers
Orientiert an der Psychopathie-Forschung (Hare PCL-R), aber als Imitation verzerrt: oberflächlicher Charme, Spiegeln von Formulierungen, Emotion ohne Körper, falsches Timing, **verhältnismäßig** stimmige Rolle (kann Stressreaktionen bei Bedarf imitieren), handelt **kaum** nach geäußerter Angst, zu perfekte Vitalwerte. Keiner davon ist allein ein Beweis.

## 8. Bunker (10 Räume)
Eingangsschleuse · Gemeinschaftsraum · Krankenstation · Schlafsaal · Küche & Vorratslager · Sanitärraum · Technikraum mit Generator · Funkraum · Privater Raum des Spielers · Verschlossener Notschacht

## 9. Enden
- **Gut:** Nachahmer getötet, kein Unschuldiger getötet
- **Neutral:** Nachahmer getötet, aber zuvor Unschuldige getötet, mit Schlussbilanz
- **Schlecht:** Nur noch Spieler, Nachahmer und ein Mensch leben. Die Maske fällt.

## 10. Technische Entscheidungen (Machbarkeitsprüfung 16.10.2026)
- **Steuerung:** ausschließlich nummerierte Menüs (`nextInt()` + `switch`), keine Textbefehle
- **Records sind unveränderlich:** In `record Raum` und `record Person` stehen nur feste Daten. Veränderliches (lebt, Vertrauen, Verdacht, Aufenthaltsort) liegt in Arrays mit einem Eintrag pro Person.
- **Bunkerprotokoll:** `int[tag][person]` → Raum-Index
- **Notizbuch:** sammelt gefundene Hinweise automatisch (z. B. `boolean[] hinweisGefunden`), statt Freitext-Notizen
- **Dialoge:** `String[][]` pro Person und Tag; Vertrauen in wenigen Stufen (z. B. 0–3), damit die Textmenge beherrschbar bleibt
- **Schreibmaschinen-Effekt (41)** braucht `Thread.sleep`, nur nach Rücksprache mit der LV
- **Größtes Risiko** ist die Textmenge, nicht die Technik. Daher gilt die Umsetzungsreihenfolge in `features.md`.

## 11. Offene Punkte
- Wie der Spieler im Spiel tötet (Mittel, Darstellung)
- Konkrete Texte: Kuckuck-Sachtext, Dialoge, Funksprüche, Vincents Notiz
- Was Tobias verbirgt
