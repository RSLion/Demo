package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsummen {
    static void main() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Nenne n als Endzahl des Quadrierens");
    String n = bufferedReader.readLine();
    int wertN = Integer.parseInt(n);



        for (int i = 1; i <= wertN; i = i + 1)
        {

            int ergebnis = i * i;
            System.out.println("Quadrahtzahl von " + i + " ist " + ergebnis);
        }

    }

}

