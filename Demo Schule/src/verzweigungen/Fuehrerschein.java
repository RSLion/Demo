package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuehrerschein {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie alt bist du?");
        String alter = bufferedReader.readLine();
        int alterFuehrerschein = Integer.parseInt(alter);
        
        if (alterFuehrerschein < 14 ) {

            System.out.println("Du darfst Bobby-Car oder Fahrrad fahren.");
            
        }
        else if (alterFuehrerschein <17 &&  alterFuehrerschein >13) {

            System.out.println("Du darfst schon 50er fahren.");

        }
        else if (alterFuehrerschein <19 && alterFuehrerschein >15) {

            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");

        }
        else  {

            System.out.println("Du darfst jetzt auch Auto fahren.");

        }

    }
}
