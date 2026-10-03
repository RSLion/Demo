package Schleifen;

import runden.Mathe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Sparvertrag {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte Kapital eingeben: ");
        String k = bufferedReader.readLine();
        double kapital = Double.parseDouble(k);

        System.out.print("Bitte den Zinssatz eingeben: ");
        String zs = bufferedReader.readLine();
        double zinssatz = Double.parseDouble(zs);

        System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
        String lJ = bufferedReader.readLine();
        double laufzeitInJahren = Double.parseDouble(lJ);



        System.out.println("Jahr\t Anfangskapitel\t\t Zinsbetrag\t\t Jahresendbetrag\t\t");

        for (int i = 1; i <= laufzeitInJahren; i ++)
        {
          /*  DecimalFormat df = new DecimalFormat("#,##0.00"); */

            double zinsbetrag = (kapital * zinssatz) / 100;
            double jahresbetrag = kapital + zinsbetrag;

            double anzahlDern = 2;
            Mathe z = new Mathe();

           /* System.out.println(i + "\t\t " + df.format(kapital) + "\t\t\t " + df.format(zinsbetrag) + "\t\t\t " + df.format(jahresbetrag) ); */

            System.out.println(i + "\t\t " + z.runden(kapital,anzahlDern) + "\t\t\t " + z.runden(zinsbetrag,anzahlDern) + "\t\t\t " + z.runden(jahresbetrag, anzahlDern) );


            kapital = jahresbetrag;
        }
        System.out.println("Weiteren Sparplan berechnen?");

    }
}
