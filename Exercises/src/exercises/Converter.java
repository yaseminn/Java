/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class Converter {

    public static String[] birler = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
    public static String[] onlar = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş",
        "seksen", "doksan"};
    public static String[] binler = {"", "Bin", "Milyon", "Milyar", "Trilyon", "Katrilyon"};
    final static String SIFIR = "sifir";
    final static String YUZ = "yüz";

    public static String read3(int n) {
        String res = "";
        int n1 = n / 100;
        if (n1 > 0) {
            res = n1 == 1 ? YUZ : birler[n1] + YUZ;
        }
        return res + onlar[(n % 100) / 10] + birler[n % 10];
    }

    public static String toTurkish(long n) {
        if (n == 0) {
            return SIFIR;
        }
        String res = "";
        List<Integer> ucluler = new ArrayList<Integer>();

        while (n > 0) {
            int m = (int) (n % 1000);
            ucluler.add(m);
            n = n / 1000;
        }

        for (int i = ucluler.size() - 1; i >= 0; i--) {
            String uclu = read3(ucluler.get(i));
            if (ucluler.get(i) == 1 && i == 1) {
                uclu = "";
            }
            String bi = ucluler.get(i) == 0 ? "" : binler[i];
            res += uclu + bi;
        }
        return res;
    }

    public static void main(String[] args) {
        long n = 2000000000000002L;
        System.out.println(toTurkish(n));
    }
}
