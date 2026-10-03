package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
    static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie groß bist du in cm?");
        String größe = bufferedReader.readLine();
        double größeInCM = Double.parseDouble(größe);
        double größeInM = größeInCM / 100;


        System.out.println("Wie schwer bist du in kg?");
        String gewicht = bufferedReader.readLine();
        double gewichtInKG = Double.parseDouble(gewicht);

        double bmi = gewichtInKG / (größeInM * größeInM);

        System.out.println("Drücke w für weiblich und m für männlich");
        String geschlecht = bufferedReader.readLine();

       if (geschlecht.equals("w")) {
           if (bmi < 19) {

               System.out.println("Untergewicht");

           } else if (bmi >= 19 && bmi < 24) {

               System.out.println("Normalgewicht");

           } else if (bmi >=24 && bmi < 30) {

               System.out.println("Übergewicht");

           } else if (bmi >=30 && bmi <=39) {

               System.out.println("Adipositatas");
           }else {

               System.out.println("Starke Adipositas");

           }
       }

       else if (geschlecht.equals("m")){
           if (bmi < 20) {

               System.out.println("Untergewicht");

           } else if (bmi >= 20 && bmi < 25) {

               System.out.println("Normalgewicht");

           } else if (bmi >=25 && bmi < 30) {

               System.out.println("Übergewicht");

           } else if (bmi >=30 && bmi <=39) {

               System.out.println("Adipositatas");
           }else {

               System.out.println("Starke Adipositas");

           }
       }
    }
}
