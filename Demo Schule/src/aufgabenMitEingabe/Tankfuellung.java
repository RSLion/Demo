package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tankfuellung {
    static void main() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Getankte Liter :");
            String getankteLiter = bufferedReader.readLine();
            double gT = Double.parseDouble(getankteLiter);

        System.out.println("Nettopreis je Liter:");
        String NettopreisJeLiter = bufferedReader.readLine();
        double nL = Double.parseDouble(NettopreisJeLiter);

        double nettoBetrag = gT * nL;
        double bruttoBetrag = nettoBetrag * 1.19;
        double mehrwertsteuer = nettoBetrag * 0.19;


        String formatiert = String.format("%.2f", nettoBetrag);
        String formatiert2 = String.format("%.2f", bruttoBetrag);
        String formatiert3 = String.format("%.2f",mehrwertsteuer);

        System.out.println("Getankte Liter :" + getankteLiter);
        System.out.println("Nettopreis je Liter:" + nL);
        System.out.println("Nettobetrag :" + formatiert);
        System.out.println("Mehrwertsteuer:" + formatiert3);
        System.out.println("Bruttobetrag :" + formatiert2);
    }
}
