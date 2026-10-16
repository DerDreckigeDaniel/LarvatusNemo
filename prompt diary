# Prompt-Tagebuch – Larvatus Nemo

**Autor:** Daniel Redl
**KI-Werkzeug:** Claude (Anthropic)

Prompts sind sinngemäß wiedergegeben und sprachlich leicht geglättet. Jeder Eintrag hält fest, was ich gefragt habe, was die KI geliefert hat und was ich davon übernommen, geändert oder verworfen habe.

---

## Eintrag 1 – Themenwahl (16.10.2026)

**Ziel:** Ein passendes Projekt finden und gemeinsam ein Konzept erarbeiten.

**Prompt:**
> Für die erste Abgabe brauchen wir noch keinen Code, nur das Konzept. Ein kleines Textadventure finde ich eine gute Idee. Ich brauche ein gutes Konzept und die Features, die ich später in meinen Prompts benennen kann. Stell mir gerne Rückfragen, dann erarbeiten wir das Textadventure gemeinsam.

**Ergebnis:** Claude erklärte, wie die Vorgaben der LV (keine Collections, keine Vererbung) das Spieldesign beeinflussen, z. B. Räume als Array von Records und ein Inventar mit fester Größe. Dazu kamen drei Settings: klassischer Dungeon, „Die Mauerstadt“ und eine Bar nach der Sperrstunde. Außerdem stellte Claude Rückfragen zu Größe, Mechaniken und Enden.

**Meine Entscheidung:** Setting „Mauerstadt“ mit etwa 8 Räumen.

**Prompt-Technik:**
- **Kontext:** Konzeptphase, noch kein Code
- **Ziel und erwartetes Ergebnis:** Konzept plus benennbare Features
- **Interaktives Vorgehen:** Rückfragen ausdrücklich erlaubt. Dadurch kamen gezielte Fragen statt einer fertigen, aber unpassenden Lösung.

---

## Eintrag 2 – Mögliche Mechaniken

**Prompt:**
> Ich nehme Setting 2 mit vielleicht 8 Räumen. Welche Mechaniken wären umsetzbar?

**Ergebnis:** Eine Tabelle mit Mechaniken, sortiert nach Aufwand und jeweils mit Hinweis zur Umsetzung ohne verbotene Java-Features: Bewegung, Inventar, verschlossene Wege, Zeitdruck, Dialoge, Gewissenspunkte, mehrere Enden, Schleichen, Kampf, Speichern (als „eher riskant“ markiert).

**Meine Entscheidung:** Keine Auswahl getroffen. Beim Lesen der Mechaniken (Dialoge, moralische Entscheidungen, mehrere Enden) kam mir eine eigene, stärkere Spielidee (→ Eintrag 3).

**Prompt-Technik:**
- **Iteratives Vorgehen:** Rückfragen der KI beantwortet, bevor der nächste Schritt kommt
- **Optionen statt Lösung:** Nach umsetzbaren Möglichkeiten gefragt, um selbst auswählen zu können

---

## Eintrag 3 – Eigene Grundidee: Bunker und Nachahmer

**Prompt (gekürzt):**
> Kann man so etwas wie das Spiel *Papers, Please* mit einer anderen Story umsetzen? Man ist in einem Bunker mit mehreren Menschen. Einer davon ist in Wirklichkeit ein hochentwickelter Skinwalker, der einen effizienten, charmanten Soziopathen nachahmt und sich so gut integriert, dass man ihn nicht sofort verdächtigt. Es soll psychologisch tiefgründig werden: Der Spieler soll analysieren, basierend auf echten psychologischen Fakten, und sich auch selbst reflektieren. Man soll mit der Zeit merken, dass etwas „off“ ist, aber nicht sofort.
> Ablauf: Jede Nacht stirbt eine Person, immer in derselben Reihenfolge. Wie bei *Werwolf* kann der Spieler freiwillig einen Charakter töten. Tötet er genau das nächste Opfer, stirbt in dieser Nacht niemand. Das Spiel endet, wenn der Skinwalker getötet wird oder der Spieler mit ihm und einer weiteren Person allein ist.

**Ergebnis:** Claude bestätigte die technische Machbarkeit und strukturierte die Idee:
- Tageszyklus Tag → Abend → Nacht
- „Papers, Please“-Mechanik als Abgleich von Aussagen mit einem Protokoll
- Erkennungsmerkmale des Wesens, angelehnt an die Psychopathie-Forschung (Hare PCL-R)
- Falsche Fährten: Unschuldige, die ebenfalls „off“ wirken
- Vorschlag eines dritten, „grauen“ Endes
- Hinweis, dass „Skinwalker“ aus einer Navajo-Überlieferung stammt
- Rückfragen zu Personenzahl, Rolle des Spielers und Hintergrund

**Meine Entscheidung:** Siehe Eintrag 4.

**Prompt-Technik:**
- **Referenzen als Beispiele:** *Papers, Please* und *Werwolf* beschreiben mit zwei Wörtern ganze Spielmechaniken
- **Präzise Regeln als Rahmen:** Tötungsregel, feste Reihenfolge, Spielende
- **Ton und Wirkung beschrieben:** psychologisch, düster, selbstreflektierend

Je genauer die Vision, desto passender die Strukturvorschläge.

---

## Eintrag 4 – Twist und Festlegungen

**Prompt:**
> Der Twist: Der Skinwalker lügt nicht. Seine Aussagen können stimmig sein, während Aussagen von Unschuldigen unpassend sein können. Das ist das moralische Dilemma. Wer gut sucht, findet vereinzelt kryptische Hinweise darauf, dass so etwas existiert. Es soll ein psychologischer Horror im Stil vom Anime *Monster* werden: Man ist Teil des Spiels des Wesens. Anfangs gleicht man Aussagen ab, später Persönlichkeiten mit einem Wesen, das wie eine KI mit kalter Logik den perfekten Menschen kopiert. Es ist „lebendig leblos“.
> Die Erkennungsmerkmale und falschen Fährten übernehme ich, das neutrale Ende auch. 6 Personen, ein Nachahmer, der Spieler ist ein Bunkerarzt mit Militärvergangenheit. Die Menschen wurden per Notfallalarm aufgefordert, Schutz zu suchen. Am Anfang lässt man diese Personen in seinen Bunker.

**Ergebnis:** Claude erstellte daraus die erste Version von **`readme.md`** (Konzept, Personen mit Wirkung und Wahrheit, Räume, Enden) und **`features.md`** (31 nummerierte Features, eingeteilt in Kern, Erweitert und Optional).

**Meine Entscheidung:** Als Grundlage übernommen und im Folgeschritt händisch überarbeitet.

**Prompt-Technik:**
- **Gezieltes Feedback:** Jeden Vorschlag der KI ausdrücklich bewertet (Erkennungsmerkmale, falsche Fährten, neutrales Ende übernommen)
- **Persona-Referenz:** Johan Liebert aus *Monster* als Vorbild für den Charakter
- **Festlegungen auf Rückfragen:** Personenzahl, Rolle, Hintergrund

---

## Eintrag 5 – Überarbeitung von Personen und Ablauf

**Prompt:**
> Füge zwei Charaktere hinzu. Einen echten Sonnenschein, den man wegen seines aufrichtigen, offenen Wesens mag und der recht spät stirbt, so eine Art Tanjiro, weiblich. Dazu einen harten Einzelgänger, der früher spielsüchtig war und Leute lesen kann. Er wirkt anfangs nicht vertrauenswürdig, die Fährte soll zu ihm führen. Wer sich öfter an ihn heranwagt, erfährt, dass er Tiefe und Intellekt hat. Am letztmöglichen Abend vor seinem Tod hinterlässt er einen Hinweis, den er vom Pokern kennt.
> Der aggressive Charakter darf nicht nur auf den Nachahmer fixiert sein, sondern muss reihum alle beschuldigen. Passe die Opferreihenfolge an.
> Zum Ablauf: Tag 1 ist entspannt, niemand weiß von der Gefahr. Ab Tag 2 beginnen die Untersuchungen, ab Tag 3 zunehmend Anspielungen durch Spuren, kryptische Botschaften und Hinterlassenschaften der Opfer. In den späten Tagen kommen eindeutigere Hinweise wie Funksprüche. Es gibt kein altes Tagebuch: Der Bunker gehört dem Spieler, und die Bedrohung ist neu und unberechenbar.

**Ergebnis:** Überarbeitete `readme.md` und `features.md` (41 Features). Claude schlug dazu vor:
- einen Vertrauenszähler, damit sich der Einzelgänger erst nach mehreren Gesprächen öffnet
- dass sein Hinweis umso deutlicher ist, je mehr Vertrauen aufgebaut wurde
- dass der Nachahmer nach dem Tod des Sonnenscheins ihre Redewendungen übernimmt
- eine neue Opferreihenfolge mit Begründung

**Meine Entscheidung:** Übernommen.

**Prompt-Technik:**
- **Iterative Verfeinerung:** Bestehendes Ergebnis gezielt überarbeiten lassen statt neu zu beginnen
- **Charakter-Referenz:** Tanjiro als Beispiel für das gewünschte Wesen
- **Negativ-Vorgaben:** „darf nicht nur auf … fixiert sein“, „kein altes Tagebuch“

---

## Eintrag 6 – Titel, Kuckuck und Projekt-Memory

**Prompt 1:**
> Namensideen, vielleicht etwas Lateinisches oder eine Anspielung auf alte Sagen und Mythen, die zu diesem psychologischen Horror passen.

**Ergebnis:** Vorschläge mit Erklärung, u. a. Dolos (Äsop-Fabel), Larva, *Larvatus prodeo*, Persona, Imago, Nemo, Echo, Wechselbalg und der Kuckuck als Bild aus der Natur.

**Prompt 2:**
> Ich möchte, dass einer der ersten Hinweise ein Sachtext über Kuckucke ist. Was hältst du von dem Namen „Larvatus Nemo“, also „maskiert tritt niemand hervor“? Erstelle außerdem eine Memory-Datei für einen späteren Agenten, die alles bisher zusammenfasst und bei neuen Details aktualisiert wird.

**Ergebnis:** Claude korrigierte die Übersetzung („der maskierte Niemand“; für einen ganzen Satz wäre ein Verb nötig) und zeigte die Doppeldeutigkeit des Titels auf. Der Kuckuck-Sachtext wurde als Tag-1-Hinweis eingebaut. Neu war **`memory.md`** als kompakte Projektzusammenfassung für Agenten.

**Meine Entscheidung:** Titel „Larvatus Nemo“ festgelegt. Den Namen Nemo habe ich später auch für das Wesen selbst übernommen.

**Prompt-Technik:**
- **Rahmen für kreative Vorschläge:** Latein und Mythologie, passend zum Genre
- **Eigener Vorschlag zur Prüfung vorgelegt**
- **Kontextdatei (`memory.md`) angelegt:** Damit spätere KI-Sitzungen nicht bei null anfangen

---

## Eintrag 7 – agents.md

**Prompt:**
> Kannst du mir die agents.md erstellen und mir den Inhalt übersichtlich erklären?

**Ergebnis:** Erste Version von **`agents.md`** mit Startroutine (zuerst memory.md und features.md lesen), der Vorgabe der LV, Erlaubt- und Verboten-Listen, Code-Stil, Arbeitsweise (ein Feature pro Schritt, erklären statt nur liefern) und den inhaltlichen Spielregeln (z. B. „Der Nachahmer lügt nie“).

**Meine Entscheidung:** Übernommen. Präzisiert in Eintrag 9 und 10.

**Prompt-Technik:** Aufgabe mit Bezug auf vorhandenes Material (Konzept und Features) statt einer allgemeinen Anfrage. Dadurch sind die Regeln projektspezifisch, z. B. inhaltliche Spielregeln.

---

## Eintrag 8 – Eigene Überarbeitung ohne KI

Im Repository habe ich `README.md` und `features.md` selbst überarbeitet:
- **Namen** aller Personen individualisiert.
- Das Wesen heißt jetzt **Nemo**, passend zum Titel
- Der Alarm ist **weltweit** statt nur städtisch
- Tag 0 heißt **„Orientierungsphase“**
- Zwei Erkennungsmerkmale **abgeschwächt**: Der Nachahmer kann bei Bedarf Stressreaktionen imitieren und handelt „kaum“ statt „nie“ nach seiner Angst. Damit ist er schwerer zu durchschauen.
- Ein Beispielsatz des Nachahmers entfernt, weil er zu viel verraten hätte
- „Graues Ende“ umbenannt in **„Neutrales Ende“**
- *No, I'm Not a Human* als weitere Inspiration ergänzt

---

## Eintrag 9 – Unterlagen der LV einbezogen

**Prompt:**
> Gefunden für den agent habe ich folgendes: "The project should use structured programming in Java including records or simple classes. No abstractions, inheritance, Collections or other higher level Java features may be used." Anbei sind weitere Inhalte der LV. Vielleicht ist das wichtig, um festzulegen, was weiters erlaubt und was verboten ist.

(Upload: Übungssammlung der LV und Aufgabenbeschreibungen aus Moodle)

**Ergebnis:** Claude passte die Erlaubt-Liste in `agents.md` an die Übungsthemen an: Ein-/Ausgabe, Verzweigungen, Schleifen, Arrays, mehrdimensionale Arrays, `switch`-Menüs, `Random`. Ergänzt wurden:
- Records und `String`-Methoden sparsam einsetzen, weil sie in den Übungen nicht vorkommen
- auf dem Niveau des Autors bleiben und bei Fehlern zuerst Hinweise geben
- die kommenden Abgaben (Woche 8: manual.md und Debugging-Screenshot; Woche 12: 5 fertige Features und Video)

**Meine Entscheidung:** Übernommen.

**Prompt-Technik:** **Grounding.** Die KI arbeitet mit echtem Referenzmaterial statt mit Annahmen. Vorher hatte sie die Erlaubt-Liste nur aus der allgemeinen Vorgabe abgeleitet.

---

## Eintrag 10 – Machbarkeitsprüfung

**Prompt:**
> Ist das Konzept mit den Features technisch weiterhin umsetzbar? Nimm zuerst die aktuelle Version von README und features aus meinem Repo und überarbeite sie dann nach unseren neuen Abmachungen. Aktualisiere auch die memory.md.

**Ergebnis:** Claude bestätigte, dass alles umsetzbar ist, und fand vier Stellen, die angepasst werden mussten:
1. **Steuerung:** Freie Textbefehle (`gehe funkraum`) bräuchten `String.split` und Fehlerbehandlung bei Tippfehlern. Stattdessen **nummerierte Menüs** mit `nextInt()` und `switch`. Das ist einfacher, robuster und entspricht dem Stoff der LV.
2. **Records sind unveränderlich:** Ein `record Person` kann z. B. „lebt“ oder „Vertrauen“ nicht ändern. Lösung: Records nur für feste Daten, der veränderliche Zustand liegt in Arrays mit einem Eintrag pro Person (`boolean[] lebt`, `int[] vertrauen`). Das Bunkerprotokoll wird zum 2D-Array `int[tag][person]`.
3. **Notizbuch:** Freitext-Notizen sind mit `Scanner` fehleranfällig (`nextInt`/`nextLine`-Problem). Stattdessen sammelt das Notizbuch gefundene Hinweise automatisch.
4. **Schreibmaschinen-Effekt:** braucht `Thread.sleep`, daher nur nach Rücksprache mit der LV.

Außerdem wies Claude darauf hin, dass das größte Risiko die **Textmenge** ist (8 Personen × mehrere Tage × Vertrauensstufen), nicht die Technik. Deshalb gibt es jetzt eine **Umsetzungsreihenfolge** in `features.md`, damit früh eine spielbare Version existiert (nach Stufe 3).

**Meine Entscheidung:** Alle vier Änderungen übernommen. `features.md`, `README.md`, `agents.md` und `memory.md` wurden angepasst.

**Prompt-Technik:**
- **Reihenfolge der Arbeitsschritte vorgegeben:** erst aktuellen Stand laden, dann prüfen, dann überarbeiten
- **Aktuelle Quelle (Repo) genannt:** Meine manuellen Änderungen gehen dadurch nicht verloren

---

## Übersicht: Wie die Projektdateien entstanden sind

| Datei | Entstehung |
|---|---|
| `README.md` | Von Claude aus meinen Konzeptvorgaben formuliert (Einträge 4–6), danach von mir überarbeitet (Eintrag 8) |
| `features.md` | Von Claude aus dem gemeinsamen Konzept abgeleitet und nummeriert (Einträge 4–6, 10), Anpassungen von mir (Eintrag 8) |
| `memory.md` | Auf meinen Wunsch von Claude erstellt und laufend aktualisiert (Einträge 6, 10) |
| `agents.md` | Von Claude erstellt (Eintrag 7) und mit den LV-Unterlagen präzisiert (Einträge 9, 10) |
| `prompt_diary.md` | Mit Claude aus dem Chatverlauf zusammengefasst, von mir geprüft |

## Übersicht: Wer welche Idee eingebracht hat

| Bereich | Von mir | Von Claude | Gemeinsam |
|---|---|---|---|
| Grundidee | Bunker, Nachahmer, *Papers Please*/*Werwolf*-Mischung, *Monster*-Stimmung, „lebendig leblos“ | Gliederung in Tag/Abend/Nacht | – |
| Kern-Twist | Nachahmer lügt nie, Unschuldige widersprechen sich, zwei Analysephasen (Features 17, 18) | Spiegeln von Formulierungen (19) | – |
| Spielregeln | Tötungsregel, feste Reihenfolge, Spielende (22–24), gutes und schlechtes Ende (37, 39) | Begrenzte Aktionen pro Tag (21), Morgenbericht (25) | Neutrales Ende (38): Vorschlag von Claude, von mir übernommen und umbenannt |
| Ablauf und Hinweise | Ruhiger Tag 1 (9), Steigerung der Hinweise (26), Hinterlassenschaften, kryptische Botschaften, Funksprüche (28–30), kein altes Tagebuch | Spuren in Räumen (27), Zufallsfunde (31), Notschacht (32) | Kuckuck-Sachtext (10): Bild von Claude, von mir als Hinweis festgelegt |
| Personen | Sonnenschein (Nora), Einzelgänger (Vincent) mit Poker-Hinweis (34–36), Pablo beschuldigt alle (20), alle Namen | Johan, Daria, Tobias, Marvin, Anna als Rollen; falsche Fährten | Vertrauenszähler (33): Mechanik von Claude für meine Idee „öfter heranwagen“ |
| Einlass und Untersuchung | Einlass am Anfang, Rolle Militärarzt | Einlassfragen, Vitalwerte, Protokoll, Notizbuch, Verdachtsskala (7, 8, 12–16) | Erstuntersuchung (6–8) |
| Technik | – | Nummerierte Menüs, Datenmodell mit Arrays, Umsetzungsreihenfolge | – |
| Titel | „Larvatus Nemo“, Nemo als Name des Wesens | Namensliste, Übersetzungskorrektur | – |
