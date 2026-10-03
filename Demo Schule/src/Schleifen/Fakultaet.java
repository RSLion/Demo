package Schleifen;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultaet {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nenne n für n!");
        String n = bufferedReader.readLine();
        int wertN = Integer.parseInt(n);

        if (wertN == 0 ) {
            System.out.println("Ihr Ergebnis ist 1 ");
        }

        else {
            int ergebnis = 1;
            for (int i = 1; i <= wertN; i = i + 1)
            {

                 ergebnis *= i;
                System.out.println("Zwischenstand " + ergebnis);
            }

            System.out.println("Fakultät " + ergebnis);
        }

    }
}
