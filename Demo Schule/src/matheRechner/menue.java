package matheRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menue {
    public static String schreibeMenue () throws IOException {
        System.out.println("Folgende rechen Operationen stehen zur Auswahl:\n [+] für Addition \n [-] für Subtraktion \n [*] für Multiplikation \n [/] für Division \n [p] für Potenzieren \n [w] für Wurzelziehen");

        System.out.print("Deine Auswahl: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String auswahl = bufferedReader.readLine();
        return auswahl;
    }
    public static String schreibeMenueEnde () throws IOException {
        System.out.println("Wollen sie eine weitere Rechnung durchführen drücken sie [J]");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nochmal = bufferedReader.readLine();
        return nochmal;
    }
}
