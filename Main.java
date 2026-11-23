import java.util.Scanner;

/**
 * Larvatus Nemo – ein psychologisches Text-Horror-Adventure.
 * Startpunkt des Programms: zeigt Titel und Hauptmenü (Feature 1)
 * und die Anleitung (Feature 3).
 *
 * Autor: Daniel Redl
 */
public class Main {

    // Menüpunkte als Konstanten, damit im switch keine "magischen Zahlen" stehen
    static final int MENUE_SPIEL_STARTEN = 1;
    static final int MENUE_ANLEITUNG = 2;
    static final int MENUE_BEENDEN = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Texte.TITEL);

        boolean laeuft = true;
        while (laeuft) {
            System.out.println(Texte.HAUPTMENUE);
            int auswahl = leseZahl(sc, "Auswahl: ", 1, 3);

            switch (auswahl) {
                case MENUE_SPIEL_STARTEN:
                    starteSpiel(sc);
                    break;
                case MENUE_ANLEITUNG:
                    System.out.println(Texte.ANLEITUNG);
                    break;
                case MENUE_BEENDEN:
                    System.out.println(Texte.ABSCHIED);
                    laeuft = false;
                    break;
            }
        }

        sc.close();
    }

    /**
     * Startet ein neues Spiel.
     * Vorerst nur das Intro – die Spielschleife folgt mit Feature 2, 4 und 5.
     */
    static void starteSpiel(Scanner sc) {
        System.out.println(Texte.INTRO);
        System.out.println("(Das Spiel ist noch im Aufbau.)");
    }

    /**
     * Liest eine ganze Zahl zwischen min und max ein.
     * Fragt so lange nach, bis die Eingabe gültig ist.
     * Damit stürzt das Programm nicht ab, wenn jemand Buchstaben eintippt.
     */
    static int leseZahl(Scanner sc, String frage, int min, int max) {
        while (true) {
            System.out.print(frage);

            if (sc.hasNextInt()) {
                int zahl = sc.nextInt();
                if (zahl >= min && zahl <= max) {
                    return zahl;
                }
            } else {
                sc.next(); // ungültige Eingabe (z. B. "abc") verwerfen
            }

            System.out.printf("Bitte eine Zahl von %d bis %d eingeben.%n", min, max);
        }
    }
}
