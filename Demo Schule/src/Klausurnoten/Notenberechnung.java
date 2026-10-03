package Klausurnoten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Notenberechnung {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viele Punkte können erreicht werden?");
        String gesamtPunktzahl = bufferedReader.readLine();
        double gPunktzahl = Double.parseDouble(gesamtPunktzahl);

        System.out.println("Wie viele Punkte hast du erreicht?");
        String erreichtePunktzahl = bufferedReader.readLine();
        double ePunktzahl = Double.parseDouble(erreichtePunktzahl);

        double ergebnis = (ePunktzahl / gPunktzahl) * 100;

        DecimalFormat df = new DecimalFormat("#,###.##");


        if (ergebnis >=92) {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 1 erreicht.");

        } else if (ergebnis >= 81 && ergebnis < 92) {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 2 erreicht.");

        } else if (ergebnis >=67 && ergebnis < 81) {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 3 erreicht.");

        } else if (ergebnis >=50 && ergebnis <67) {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 4 erreicht.");

        }else if (ergebnis >=30 && ergebnis <50) {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 5 erreicht.");
        }else {

            System.out.println("Du hast " + df.format(ergebnis) + "% und damit die Note 6 erreicht.");

        }

    }
}
