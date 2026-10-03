package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bestellung {
    static void main() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double schrauben = 0.05;
        double muttern = 0.03;
        double unterlegscheiben = 0.01;

        System.out.println("Wie viele Schrauben möchten Sie kaufen?");
        String s = bufferedReader.readLine();
        double anzahlSchrauben = Double.parseDouble(s);

        double betragSchrauben = schrauben * anzahlSchrauben;


        System.out.println("Wie viele Muttern möchten Sie kaufen?");
        String m = bufferedReader.readLine();
        double anzahlMuttern = Double.parseDouble(m);

        double betragMuttern = muttern * anzahlMuttern;


        System.out.println("Wie viele Unterlegscheiben möchten Sie kaufen?");
        String u = bufferedReader.readLine();
        double anzahlUnterlegschrauben = Double.parseDouble(u);

        double betragUnterlegscheiben = unterlegscheiben * anzahlUnterlegschrauben;


        double ergebnis = betragMuttern + betragSchrauben + betragUnterlegscheiben;
        System.out.println("Zu Zahlen " + ergebnis + " Euro");

        if ( anzahlMuttern == anzahlSchrauben){
            System.out.println("Super alle ihre Schrauben haben Muttern! ");
        }
        else {
            System.out.println("Warnung! Sie haben nicht die gleiche Anzahl Schrauben, wie Muttern bestellt! Bitte prüfen sie ihre Bestellung!");
        }

    }
}
