package eindimensionaleArrays;

import kürzel.Input;

import java.io.IOException;

public class Verdoppeln {
    static void main() throws IOException {
        double[] zahlen = new double[3];
        System.out.println("Bitte geben sie einen Array bestehend aus 3 Kommazahlen ein. ");
        System.out.println("Wert 1 eingeben: ");
        zahlen[0] = Input.doubleIn();

        System.out.println("Wert 2 eingeben: ");
        zahlen[1] = Input.doubleIn();

        System.out.println("Wert 3 eingeben: ");
        zahlen[2] = Input.doubleIn();

        double[] verdoppeteZahlen = new double[3];

        for (int i = 0; i < zahlen.length; i ++){
            System.out.print(zahlen[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < zahlen.length; i ++){
            verdoppeteZahlen[i] = zahlen[i] * 2;
            System.out.print(verdoppeteZahlen[i] + " ");
            }
    }
}
