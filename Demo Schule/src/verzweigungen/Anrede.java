package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {
    static void main() throws IOException {
        System.out.print("Wie ist dein Vorname?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String vorname = bufferedReader.readLine();

        System.out.print("Wie ist dein Nachname?");

        String nachname = bufferedReader.readLine();

        System.out.println("Bitte geben sie ihre Geschlecht an. 1 für Mann, 2 für Frau, 3 für divers");
        String geschlecht = bufferedReader.readLine();
        int gMFD = Integer.parseInt(geschlecht);

        switch (gMFD) {

            case 1:
                System.out.println("Hallo Herr " + vorname + " " + nachname + "!");
                break;

            case 2:
                System.out.println("Hallo Frau " + vorname + " " + nachname + "!");
                break;

            default:
                System.out.println("Hallo " + vorname + " " + nachname + ".");
        }


    }
}
