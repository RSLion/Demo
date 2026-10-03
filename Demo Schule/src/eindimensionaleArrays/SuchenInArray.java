package eindimensionaleArrays;

import kürzel.Input;

import java.io.IOException;

public class SuchenInArray {
    static void main() throws IOException {
        double[] zahlen = new double[5];
        System.out.println("Bitte geben sie einen Array bestehend aus 5 Kommazahlen ein. ");
        System.out.println("Wert 1 eingeben: ");
        zahlen[0] = Input.doubleIn();

        System.out.println("Wert 2 eingeben: ");
        zahlen[1] = Input.doubleIn();

        System.out.println("Wert 3 eingeben: ");
        zahlen[2] = Input.doubleIn();

        System.out.println("Wert 4 eingeben: ");
        zahlen[3] = Input.doubleIn();

        System.out.println("Wert 5 eingeben: ");
        zahlen[4] = Input.doubleIn();

        System.out.println("Nach welcher Zahl wollen sie suchen?");
        double suchZahl = Input.doubleIn();

        for (int i = 0; i < zahlen.length; i ++){
            boolean b = zahlen[i] == suchZahl;
            if (b){
                System.out.println("Treffer");
            }
            else if (!b){
                System.out.println("Niete");
            }
        }

    }
}
