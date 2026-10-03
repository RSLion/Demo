package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {
    static void main() throws IOException {
        System.out.print("Wie ist dein Vorname?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String vorname = bufferedReader.readLine();

        System.out.print("Wie ist dein Nachname?");

        String nachname = bufferedReader.readLine();
        System.out.println("Hallo " + vorname + " " + nachname + ".");

    }
}
