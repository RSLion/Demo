package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gesamtwiderstand {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nenne mir bitte den R1 Widerstand:");
        String widerstand1 = bufferedReader.readLine();
        double R1 = Double.parseDouble(widerstand1);

        System.out.println("Nenne mir bitte den R2 Widerstand:");
        String widerstand2 = bufferedReader.readLine();
        double R2 = Double.parseDouble(widerstand2);

        System.out.println("Gebe p für Parallelschaltung und r für Reihenschaltung ein");
        String widerstandsArt = bufferedReader.readLine();

        if (widerstandsArt.equals("p") ) {

           double parallelschaltung = (R1 + R2 )/(R1 + R2);
            System.out.println("Gesamtwiderstand ist " + parallelschaltung);

        } else if (widerstandsArt.equals("r") ){

            double reihenschaltung = R1 + R2;
            System.out.println("Gesamtwiderstand ist " + reihenschaltung);

        }

        else {
            System.out.println("Error");
        }
    }
}
