package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Wurzeln {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie einen Anfangswert ein:");
        String aWert = bufferedReader.readLine();
        int anfangsWert = Integer.parseInt(aWert);

        System.out.println("Geben sie einen Endwert ein:");
        String eWert = bufferedReader.readLine();
        int endWert = Integer.parseInt(eWert);

        for (int i = anfangsWert; i <= endWert; i = i + 1)
        {
            System.out.println(i);
            int wurzel = (int) Math.sqrt(i);
            
            System.out.println("Quadrat " + wurzel);
        }


    }
}
