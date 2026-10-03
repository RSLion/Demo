package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welche Note hast du in LF01?:");
        String LF1 = bufferedReader.readLine();
        double N1 = Double.parseDouble(LF1);

        System.out.println("Welche Note hast du in LF02?:");
        String LF2 = bufferedReader.readLine();
        double N2 = Double.parseDouble(LF2);

        System.out.println("Welche Note hast du in LF03?:");
        String LF3 = bufferedReader.readLine();
        double N3 = Double.parseDouble(LF1);

        System.out.println("Welche Note hast du in LF04?:");
        String LF4 = bufferedReader.readLine();
        double N4 = Double.parseDouble(LF4);

        System.out.println("Welche Note hast du in LF05?:");
        String LF5 = bufferedReader.readLine();
        double N5 = Double.parseDouble(LF1);

        double Ergebnis = (N1 + N2 + N3 + N4 + N5)/5;

        System.out.println("Welche Note hast du in LF01?:" + N1);
        System.out.println("Welche Note hast du in LF02?:" + N2);
        System.out.println("Welche Note hast du in LF03?:" + N3);
        System.out.println("Welche Note hast du in LF04?:" + N4);
        System.out.println("Welche Note hast du in LF05?:" + N5);
        System.out.println("Durchschnittsnote =" + Ergebnis);


    }
}
