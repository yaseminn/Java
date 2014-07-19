/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class ConvertNumbersToTr {

    public static final String[] number = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
    public static final String[] numberTens = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş",
        "seksen", "doksan"};

    public static final String hundred = "-yüz-";
    public static final String thousand = "-bin-";
    public static final String million = "-milyon-";
    
    public static String hundrends(int n) {
        return hundred + numberTens[(n % 100) / 10] + number[(n % 100) % 10];
    }

    public static String thousands(int num1) {
        return thousand + trio(num1 % 1000);
    }
    
    public static String trio(int n) {

        if (n < 100) {
            return numberTens[n / 10] + number[n % 10];
        } else if (n < 1000) {
            if (n / 100 == 1) {
                return hundrends(n);
            } else {
                return number[n / 100] + hundrends(n);
            }
        }
        return "hadiii";
    }

    public static int splitTrio(int num) {
        return num / 1000;
    }

    public static String convertTo(int num) {

        int num1 = num;

        if (num > 999 && num < 1000000) {
            while (num > 1000) {
                num = splitTrio(num);
            }
            if (num1 / 1000 == 1) {
                return thousands(num1);
            } else {
                return trio(num) + thousands(num1);
            }

        } 
        
        else if (num >= 1000000 && num < 1000000000) {
            while (num > 1000) {
                num = splitTrio(num);
            }
            if (splitTrio(num1) % 1000 == 0) {
                return trio(num) + million + trio(num1 % 1000);
            }
            return trio(num) + million + trio(splitTrio(num1) % 1000) + thousand + trio(num1 % 1000);
        }

        return trio(num);
    }

    public static String miniTest(int num) {

        if (num < 0) {
            return "eksi-" + convertTo(Math.abs(num));
        } else if (num == 0) {
            return "sıfır";
        } else {
            return convertTo(num);
        }

    }
}
