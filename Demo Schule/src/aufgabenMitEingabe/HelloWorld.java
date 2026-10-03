package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    static void main() throws IOException {
        int zahl = 5;

        System.out.println("Hello World");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        System.out.println("Eingabe war:" + text);
    }
}
