package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede1 {static void main() throws IOException {
    System.out.print("Wie ist dein Vorname?");

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String vorname = bufferedReader.readLine();

    System.out.print("Wie ist dein Nachname?");

    String nachname = bufferedReader.readLine();

    System.out.println("Bitte geben sie ihre Geschlecht an. m für Mann, w für Frau, d für divers");
    String geschlecht = bufferedReader.readLine();

    if (geschlecht.equals("m") ) {
        System.out.println("Hallo Herr " + vorname + " " + nachname + "!");
    }
    else if (geschlecht.equals("w")){
        System.out.println("Hallo Frau " + vorname + " " + nachname + "!");
    }
    else {
        System.out.println("Hallo " + vorname + " " + nachname + ".");
    }




}
}
