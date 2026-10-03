package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {static void main() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Nenne n ");
    String n = bufferedReader.readLine();
    int wertN = Integer.parseInt(n);


float ergebnis = 0;
    for (int i = 1; i <= wertN; i = i + 1)
    {

        ergebnis  += (float)(1 / Math.pow(2, i));

    }
    System.out.println("Geometrische Reihe bis " + n + " ist gleich " +  ergebnis);
}
}
