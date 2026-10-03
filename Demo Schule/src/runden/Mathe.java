package runden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathe {
     public static float runden (double zahl, double anzahlDerNachkommastellen) throws IOException {


        double hochZahl = Math.pow(10, anzahlDerNachkommastellen);

        double hin = zahl * hochZahl;

        float gerundet = Math.round(hin );

        double zurueck = gerundet/ hochZahl;
        float z = (float) zurueck;

        return z;


    }
}
