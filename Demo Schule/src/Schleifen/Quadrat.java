package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrat {static void main() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Wie groß soll das Quadrat sein?");
    String n = bufferedReader.readLine();
    int wertN = Integer.parseInt(n);

    int wertW = wertN-1;
    int wertL = wertN-2;

    for (int i = 1; i <= wertN; i = i + 1)
    {
        if (i<= wertW)
        {
            System.out.print("*");
        }
        else {
            System.out.println("*");
        }
        }

    for (int b = 1; b <= wertL; b = b + 1)
    {
        System.out.print("*");
        for (int a = 1; a <= wertL; a = a + 1)
        {System.out.print(" ");
        }
        System.out.println("*");
    }
    for (int i = 1; i <= wertN; i = i + 1)
    {
            System.out.print("*");
        }
}
}
