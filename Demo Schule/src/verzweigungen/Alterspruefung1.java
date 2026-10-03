package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung1 {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie alt bist du?");
        String Zahl = bufferedReader.readLine();
        int Z1 = Integer.parseInt(Zahl);


        if (Z1 < 18) {
            System.out.println("Du bist noch minderjährig!");
        } else {
            System.out.println("Du bist schon volljährig!");
        }
    }
}
