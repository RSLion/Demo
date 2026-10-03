package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Temperatur in Celsius:");
        String Celsius = bufferedReader.readLine();
        double C = Double.parseDouble(Celsius);

        double Fahrenheit = C * 1.8 + 32;

        System.out.println("Temperatur in Celsius:" + C);
        System.out.println( C + " Grad Celsius sind " + Fahrenheit + " Grad Fahrenheit");
    }
}
