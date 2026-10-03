package matheRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatheSoftware {
    static void main() throws IOException {
      int i = 0;
      do {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

          String auswahl = menue.schreibeMenue();


        /*.out.print("Bitte die Zahl eingeben: ");
        String z1 = bufferedReader.readLine();
        double zahl1 = Double.parseDouble(z1);*/

          if (auswahl.equals("+")) {

              RechenArten.addition();

          } else if (auswahl.equals("-")) {

              RechenArten.subtraktion();

          } else if (auswahl.equals("*")) {

              RechenArten.multiplikation();

          } else if (auswahl.equals("/")) {

              RechenArten.division();

          } else if (auswahl.equals("p")) {

              RechenArten.potenzieren();

          } else if (auswahl.equals("w")) {

              RechenArten.wurzelZiehen();

          } else {
              System.out.println("Error, please try again and choose a legitamet option");
          }


          String nochmal = menue.schreibeMenueEnde();
          if (nochmal.equals("j")){
              System.out.println("Nochmal.");
          }else {
              i = i + 1;
          }


      } while (i <= 1);
      }
}
