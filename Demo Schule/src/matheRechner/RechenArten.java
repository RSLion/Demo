package matheRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RechenArten {
    public static void addition () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die erste Zahl eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);

        System.out.print("Bitte die zweite Zahl eingeben: ");
        String z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(z2);

        double ergebnis = zahl1 + zahl2;
        System.out.println("Summe von " + zahl1 + " + " + zahl2 + " = " + ergebnis);
    }


    public static void subtraktion () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die erste Zahl eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);

        System.out.print("Bitte die zweite Zahl eingeben: ");
        String z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(z2);

        double ergebnis = zahl1 - zahl2;
        System.out.println("Das Ergebnis von " + zahl1 + " - " + zahl2 + " = " + ergebnis);
    }


    public static void multiplikation () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die erste Zahl eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);

        System.out.print("Bitte die zweite Zahl eingeben: ");
        String z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(z2);

        double ergebnis = zahl1 * zahl2;
        System.out.println("Das Ergebnis von " + zahl1 + " * " + zahl2 + " = " + ergebnis);
    }


    public static void division () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die erste Zahl eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);

        System.out.print("Bitte die zweite Zahl eingeben: ");
        String z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(z2);

        double ergebnis = zahl1 / zahl2;
        System.out.println("Das Ergebnis von " + zahl1 + " / " + zahl2 + " = " + ergebnis);
    }


    public static void potenzieren () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die Basis eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);

        System.out.print("Bitte den Exponenten eingeben: ");
        String z2 = bufferedReader.readLine();
        double zahl2 = Double.parseDouble(z2);

        double ergebnis = Math.pow(zahl1,zahl2);
        System.out.println("Das Ergebnis von der Basis " + zahl1 + " zum Exponenten  " + zahl2 + " = " + ergebnis);
    }


    public static void wurzelZiehen () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte die Basis der Quadratwurzel eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);


        double ergebnis = Math.sqrt(zahl1);
        System.out.println("Das Ergebnis von der Basis " + zahl1 + " = " + ergebnis);
    }
}
