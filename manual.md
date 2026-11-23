# Bedienungsanleitung – Larvatus Nemo

**Autor:** Daniel Redl
**Stand:** Version 0.1 (Hauptmenü und Anleitung)

## Starten

### In IntelliJ
1. Projektordner öffnen.
2. `Main.java` öffnen.
3. Auf den grünen Pfeil neben `public static void main` klicken.
4. Das Spiel läuft unten im Run-Fenster (Konsole). Dort werden auch die Eingaben gemacht.

### Im Terminal
```
javac -encoding UTF-8 -d out *.java
java -cp out Main
```

## Steuerung

Das Spiel wird nur über **Zahlen** gesteuert. Jede Auswahl hat eine Nummer davor:
Zahl eintippen und mit **Enter** bestätigen.

Ungültige Eingaben (Buchstaben oder Zahlen außerhalb der Auswahl) werden abgefangen.
Das Spiel fragt dann einfach noch einmal.

## Hauptmenü

Nach dem Start erscheint der Titel und dieses Menü:

```
1) Spiel starten
2) Anleitung
3) Beenden
```

| Eingabe | Was passiert |
|---|---|
| `1` | Zeigt das Intro (der weltweite Alarm und die acht Menschen vor der Schleuse). Danach geht es zurück ins Hauptmenü. |
| `2` | Zeigt die Anleitung: Spielziel, Tagesablauf und Steuerung. |
| `3` | Beendet das Programm. |

## Beispiel

```
1) Spiel starten
2) Anleitung
3) Beenden

Auswahl: abc
Bitte eine Zahl von 1 bis 3 eingeben.
Auswahl: 2

--- ANLEITUNG ---
...
```

## Noch nicht spielbar

Das eigentliche Spiel (Räume, Gespräche, Tag-/Nacht-Zyklus) ist in Arbeit.
Welche Features fertig sind, steht mit ✅ in `features.md`.
Diese Anleitung wird mit jedem neuen Feature erweitert.
