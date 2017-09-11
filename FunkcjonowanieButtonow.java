package KołkoIKrzyzyk;

/**
 * Created by Racibór on 2017-08-07.
 */
public class FunkcjonowanieButtonow {


    static String wynik(int nKlikniec) {
        String krzyzyk = "X";
        String kolko = "O";

        if (nKlikniec % 2 == 0) {
            return krzyzyk;
        } else {
            return kolko;
        }
    }
}