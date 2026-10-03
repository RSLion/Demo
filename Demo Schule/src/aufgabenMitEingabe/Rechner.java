package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rechner {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gebe die erste Zahl ein:");
        String Z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(Z1);

        System.out.println("Gebe die zweite Zahl ein:");
        String Z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(Z2);

        double Ergebnis = zahl1 + zahl2;


        double Ergebnis1 = zahl1 - zahl2;

        double Ergebnis2 = zahl1 * zahl2;
        double Ergebnis3 = zahl1 / zahl2;

        double Ergebnis4 =Math.pow(zahl1, zahl2);


        System.out.println(zahl1 + "+" + zahl2 + "=" + Ergebnis);
        System.out.println(zahl1 + "-" + zahl2 + "=" + Ergebnis1);
        System.out.println(zahl1 + "*" + zahl2 + "=" + Ergebnis2);
        System.out.println(zahl1 + "/" + zahl2 + "=" + Ergebnis3);
        System.out.println(zahl1 + " hoch " + zahl2 + "=" + Ergebnis4);




    }
}
