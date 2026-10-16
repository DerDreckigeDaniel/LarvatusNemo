# Features – Larvatus Nemo

**Autor:** Daniel Redl

Status: alle Features sind geplant, Raum für eventuelle Anpassungen bleibt bestehen (Konzeptphase).
Legende: **[Kern]** = notwendig für ein spielbares Spiel · **[Erweitert]** = vertieft das Spielerlebnis · **[Optional]** = falls Zeit bleibt · ✅ = umgesetzt

## Grundsystem
1. **[Kern]** Startbildschirm mit Titel, Intro-Text (der weltweite Alarm) und Hauptmenü (Spiel starten, Anleitung, Beenden)
2. **[Kern]** Steuerung über nummerierte Menüs: Der Spieler wählt jede Aktion per Zahl (z. B. `1) Raum wechseln`, `2) Mit jemandem sprechen`, `3) Jemanden untersuchen`, `4) Raum durchsuchen`, `5) Notizbuch`)
3. **[Kern]** Anleitung im Hauptmenü, die Spielziel, Tagesablauf und Menüs erklärt
4. **[Kern]** Bewegung zwischen den 10 Räumen des Bunkers
5. **[Kern]** Raumbeschreibung beim Betreten, mit den Personen, die gerade anwesend sind

## Einlass (Tag 0)
6. **[Kern]** Einlass-Sequenz: Die acht Personen treffen nacheinander an der Schleuse ein
7. **[Kern]** Einlassfragen an jede Person (Auswahl aus nummerierten Fragen)
8. **[Kern]** Ärztliche Erstuntersuchung: Puls, Pupillen, Temperatur, Atmung werden als Ausgangswerte gespeichert

## Tag 1: Die Ruhe
9. **[Kern]** Entspannter erster Tag ohne Ermittlungsfunktionen: Gespräche, Kennenlernen, kleine Konflikte
10. **[Kern]** Kuckuck-Sachtext im Gemeinschaftsraum (lesbar mit `lies buch`) als einer der ersten, harmlos getarnten Hinweise
11. **[Erweitert]** Unauffällige Unstimmigkeiten am ersten Tag, die erst im Nachhinein Bedeutung bekommen

## Untersuchung & Analyse (ab Tag 2)
12. **[Kern]** Gespräche mit Personen über nummerierte Dialogoptionen
13. **[Kern]** Erneute Untersuchung und Vergleich mit den Ausgangswerten (der Nachahmer bleibt „zu perfekt“)
14. **[Kern]** Tägliches Bunkerprotokoll (wer war wann wo) zum Abgleich mit den Aussagen
15. **[Kern]** Notizbuch: Gefundene Hinweise und wichtige Aussagen werden automatisch pro Person gesammelt und können jederzeit angezeigt werden
16. **[Erweitert]** Verdachtsskala pro Person (0–10), die der Spieler selbst setzt
17. **[Erweitert]** Zwei Analysephasen: erst Aussagen abgleichen, in den späten Tagen neue Dialoge, die Persönlichkeit und Verhalten in den Vordergrund stellen
18. **[Erweitert]** Der Nachahmer lügt nie: Alle seine Aussagen sind wahr, aber mehrdeutig formuliert
19. **[Erweitert]** Spiegeln: Der Nachahmer übernimmt Formulierungen anderer, auch von bereits Verstorbenen
20. **[Erweitert]** Pablo beschuldigt reihum verschiedene Personen, darunter berechtigt, aber unauffällig auch Johan

## Tag-/Nacht-Zyklus
21. **[Kern]** Tageszyklus mit begrenzten Aktionen pro Tag (jede Aktion kostet Zeit)
22. **[Kern]** Abendentscheidung ab Tag 2: Der Spieler kann freiwillig eine Person töten oder niemanden
23. **[Kern]** Nachtphase: Der Nachahmer tötet nach fester Reihenfolge (Marvin → Daria → Pablo → Vincent → Tobias → Nora)
24. **[Kern]** Hat der Spieler die nächste Zielperson selbst getötet, stirbt in dieser Nacht niemand
25. **[Kern]** Morgenbericht: Wer ist gestorben, wo wurde die Leiche gefunden

## Hinweise & Steigerung
26. **[Kern]** Steigernde Hinweisstufen: Tag 1 harmlose Hinweise, Tag 2 Untersuchungen, ab Tag 3 Anspielungen, späte Tage eindeutigere Hinweise
27. **[Erweitert]** Spuren in Räumen (z. B. unberührte Essensration, Kratzspuren), die untersucht werden können
28. **[Erweitert]** Letzte Hinterlassenschaften der Opfer (halbe Notizen, umklammerte Gegenstände), die bei der Leiche oder am Schlafplatz gefunden werden
29. **[Erweitert]** Kryptische Botschaften, deren Bedeutung sich erst später erschließt
30. **[Erweitert]** Funkraum: In den späten Tagen bruchstückhafte Funksprüche anderer Schutzräume, die zunehmend eindeutiger werden
31. **[Optional]** Zufällig gefundene Hinweise: Beim Durchsuchen eines Raums gibt es eine Chance auf einen Zusatzfund
32. **[Optional]** Verschlossener Notschacht, der sich erst mit einem gefundenen Gegenstand öffnet

## Vertrauen & Vincents Hinweis
33. **[Erweitert]** Vertrauenszähler pro Person: Wiederholte Gespräche schalten neue Dialoge und Hintergrundgeschichten frei
34. **[Erweitert]** Vincent öffnet sich erst nach mehreren Gesprächen und zeigt seinen Intellekt und seine Vergangenheit
35. **[Erweitert]** Am Abend vor seiner Todesnacht hinterlässt Vincent einen Hinweis (Spielkarte mit Notiz); je höher das Vertrauen, desto deutlicher der Hinweis
36. **[Erweitert]** Wird Vincent vorher getötet, geht sein Hinweis verloren

## Enden
37. **[Kern]** Gutes Ende: Nachahmer getötet, kein Unschuldiger getötet
38. **[Kern]** Neutrales Ende: Nachahmer getötet, aber zuvor Unschuldige getötet
39. **[Kern]** Schlechtes Ende: Nur noch der Spieler, der Nachahmer und ein Mensch leben; der Nachahmer lässt die Maske fallen
40. **[Erweitert]** Schlussbilanz: Übersicht, wen der Spieler wann getötet hat und was die Wahrheit über diese Person war

## Optionales
41. **[Optional]** Textausgabe mit Verzögerung (Schreibmaschinen-Effekt) für mehr Atmosphäre – benötigt `Thread.sleep`, nur nach Rücksprache mit der LV
42. **[Optional]** Zufällige Auswahl des Nachahmers aus mehreren Kandidaten für mehr Wiederspielwert – erfordert, dass alle Tells und Dialoge pro Kandidat geschrieben werden

## Umsetzungsreihenfolge

Damit jederzeit eine lauffähige Version existiert, wird in dieser Reihenfolge gebaut:

| Stufe | Features | Ergebnis |
|---|---|---|
| 1 | 1, 2, 3, 4, 5 | Hauptmenü und Bewegung durch den Bunker |
| 2 | 21, 22, 23, 24, 25 | Spielbarer Tag-/Nacht-Zyklus mit Tötungsregel |
| 3 | 37, 38, 39 | Alle drei Enden erreichbar → **erste komplett spielbare Version** |
| 4 | 6, 7, 8, 12, 13 | Einlass, Gespräche, Untersuchungen |
| 5 | 9, 10, 14, 15, 26 – 30 | Hinweise, Protokoll, Notizbuch, Steigerung |
| 6 | 33 – 36, 16 – 20 | Vertrauen, Vincents Hinweis, psychologische Feinheiten |
| 7 | 11, 31, 32, 40 – 42 | Feinschliff und Optionales |
