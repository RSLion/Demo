package eindimensionaleArrays;

import kürzel.Input;

import java.io.IOException;

public class Summen {
    static void main() throws IOException {
    int[] zahlen = new int[3];
    System.out.println("Bitte geben sie einen Array bestehend aus 3 Kommazahlen ein. ");
    System.out.println("Wert 1 eingeben: ");
    zahlen[0] = Input.integerIn();

    System.out.println("Wert 2 eingeben: ");
    zahlen[1] = Input.integerIn();

    System.out.println("Wert 3 eingeben: ");
    zahlen[2] = Input.integerIn();

    int[] geteilteZahlen = new int[3];


    System.out.println();

    for (int i = 0; i < zahlen.length; i ++){
        geteilteZahlen[i] = zahlen[i] % 2;
    }

    }
}
