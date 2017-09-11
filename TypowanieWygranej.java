package KołkoIKrzyzyk;

/**
 * Created by Racibór on 2017-08-09.
 */
public class TypowanieWygranej {


    public static int wygrana(String przycisk0, String przyciskPoziomy1, String przyciskPoziomy2,
                              String przyciskPionowy1, String przyciskPionowy2,
                              String przyciskPoSkosie1, String przyciskPoSkosie2,
                              String przyciskPoSkosie3, String przyciskPoSkosie4) {
        if (przycisk0.equals(przyciskPionowy1) & przyciskPionowy1.equals(przyciskPionowy2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoziomy1) & przyciskPoziomy1.equals(przyciskPoziomy2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoSkosie1) & przyciskPoSkosie1.equals(przyciskPoSkosie2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoSkosie3) & przyciskPoSkosie3.equals(przyciskPoSkosie4)) {
            return 1;
        } else {
            return 0;
        }
    }

    static int wygrana(String przycisk0, String przyciskPoziomy1, String przyciskPoziomy2,
                              String przyciskPionowy1, String przyciskPionowy2,
                              String przyciskPoSkosie1, String przyciskPoSkosie2) {
        if (przycisk0.equals(przyciskPionowy1) & przyciskPionowy1.equals(przyciskPionowy2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoziomy1) & przyciskPoziomy1.equals(przyciskPoziomy2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoSkosie1) & przyciskPoSkosie1.equals(przyciskPoSkosie2)) {
            return 1;
        } else {
            return 0;
        }
    }

    static int wygrana(String przycisk0, String przyciskPoziomy1, String przyciskPoziomy2,
                       String przyciskPionowy1, String przyciskPionowy2) {
        if (przycisk0.equals(przyciskPionowy1) & przyciskPionowy1.equals(przyciskPionowy2)) {
            return 1;
        } else if (przycisk0.equals(przyciskPoziomy1) & przyciskPoziomy1.equals(przyciskPoziomy2)) {
            return 1;
        } else {
            return 0;
        }
    }
}