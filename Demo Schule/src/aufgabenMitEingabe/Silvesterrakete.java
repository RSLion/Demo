package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Silvesterrakete {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie viel Zeit benötigt der Raketenkörper?");
        String Zahl = bufferedReader.readLine();
        double Z1 = Double.parseDouble(Zahl);

        double ms = Z1 * 9.81;
        double kmh = ms * 3.6;

        DecimalFormat df = new DecimalFormat("#,###.##");;

        System.out.println("Wie viel Zeit benötigt der Raketenkörper?" + Z1);
        System.out.println(df.format(ms) + " m/s");
        System.out.println(df.format(kmh) + " km/h");

    }
}
