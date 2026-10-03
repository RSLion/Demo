package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zaehlmass {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie die Anzahl ein:");
        String Zahl = bufferedReader.readLine();
        int Z1 = Integer.parseInt(Zahl);

        int Gros = Z1 / 144;
        int Gros1 = Z1 % 144;
        int Schock = Gros1 / 60;
        int Schock1 = Gros1 % 60;
        int Dutzend = Schock1 / 12;
        int Dutzend1 = Schock1 % 12;
        int Einzelstücke = Dutzend1;

        System.out.println("Geben Sie die Anzahl ein:" + Z1);
        System.out.println(Gros + " Gros");
        System.out.println(Schock + " Schock");
        System.out.println(Dutzend + " Dutzend");
        System.out.println(Einzelstücke + " Stück");

    }
}
