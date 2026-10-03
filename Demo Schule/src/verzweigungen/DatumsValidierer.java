/* package verzweigungen;

public class DatumsValidierer {
    public static boolean validiereDatum(int tag, int monat, int jahr)
    {
        if (monat == 4 || monat == 6 || monat ==9 || monat ==11 ) {


            if (tag <= 32 && tag >= 0) {
                return true;
            }
            else {
                return false;
            }
        }

        if (monat == 1 || monat == 3 || monat ==5 || monat ==7  || monat ==8 || monat ==10 || monat ==12 ) {

            if (tag <= 31 && tag >= 0) {
                return true;
            }
            else {
                return false;
            }
        }

        if (monat == 2) {

            if (tag <= 29 && tag >= 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

}
*/