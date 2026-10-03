package kürzel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static int integerIn () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        int wertN = Integer.parseInt(n);
        return wertN;
    }

    public static double doubleIn () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        double wertN = Double.parseDouble(n);
        return wertN;
    }

    public static String stringIn () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        return n;
    }

    public static float floatIn () throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String n = bufferedReader.readLine();
      float wertN = Float.parseFloat(n);
      return wertN;
    }
}
