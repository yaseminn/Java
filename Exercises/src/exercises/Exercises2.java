/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author asus
 */
public class Exercises2 {

    public static void main(String[] arg) {
        int i;
        long[] test = {14, 17};
        long v;
        String s;
        String[] a = {"foo", "bar", "foo", "baz", "box", "bar", "bar"};

        //System.err.println(hexStringtoLong("FF"));
        //System.out.println(frequencyMap2(a));
        //System.out.println(add2Numbers("09", "23"));
        System.out.println(Arrays.toString(sieve1(20)));
        System.out.println(sieve2(20));
        System.out.println(sieve3(20));
    }

    /**
     * @param str string input to be converted to an integer. This method
     * assumes string contains ascii numbers.
     * @return integer value of String.
     * @throws java.lang.IllegalArgumentException If input contains a non digit
     * character
     */
    public static int stringToInt(String str) {

        int result = 0;
        int pow = 1;

        for (int i = str.length() - 1; i >= 0; --i) {
            int c = str.charAt(i); // No need to create a new char array by calling toCharArray, it is ok, I just used this to show the alternative.
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Input contains non digit character: " + (char) c);
            } else {
                result += (c - '0') * pow;
                pow *= 10;
            }
        }

        try {
            int i = stringToInt("123a");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            // Or display error msg etc.
        }

        return result;
    }
    public static String[] birler = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static String intToString(int num) {

        String strResult = "";
        if (num == 0) {
            return birler[0];
        }

        while (num != 0) {
            int result = num % 10;
            num = num / 10;
            strResult += birler[result];
        }

        return new StringBuffer(strResult).reverse().toString();
    }
    private final static String[] HEX = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F"};

    public static String longToHexString(long num) {

        String strResult = "";
        if (num == 0) {
            return birler[0];
        }

        while (num != 0) {
            int c = (int) (num);
            strResult += HEX[c];
            num = num >> 4;
        }
        return new StringBuffer(strResult).reverse().toString();
    }

    public static long hexStringtoLong(String hexadecimal) throws NumberFormatException {

        char c;
        long value = 0;


        if (hexadecimal == null) {
            throw new NullPointerException("Input parameter is null");
        }

        char[] chars = hexadecimal.toUpperCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if (c >= '0' && c <= '9') {
                value = ((value << 4) | ((c - '0')));
            } else if (c >= 'A' && c <= 'F') {
                value = ((value << 4) | ((c - 'A' + 10)));
            }
        }

        return value;
    }
    private final static char[] EX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F'};

    public static String fromLong(long value) {
        char[] hexs;

        hexs = new char[16];
        for (int i = 0; i < 16; i++) {
            int c = (int) (value & 0xf);
            hexs[16 - i - 1] = EX[c];
            value = value >> 4;
        }
        return new String(hexs);
    }

    /**
     * @param s This method assumes string contains lowercase strings.
     * @return list of elements that occurs more than once
     */
    public static List<String> frequencyMap(String[] s) {

        Map<String, Integer> freqMap = new HashMap<String, Integer>();
        List<String> listAr = new ArrayList<String>();

        for (String c : s) {
            Integer fre = freqMap.get(c);
            if (fre == null) {
                fre = 0;
            }
            freqMap.put(c, fre + 1);
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                listAr.add(entry.getKey());
            }
        }
        return listAr;
    }

    public static Set<String> frequencyMap2(String[] s) {

        Map<String, Integer> freqMap = new HashMap<String, Integer>();

        for (String c : s) {
            Integer fre = freqMap.get(c);
            if (fre == null) {
                fre = 0;
            }
            freqMap.put(c, fre + 1);
        }

        Iterator<Map.Entry<String, Integer>> iter = freqMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() < 2) {
                iter.remove();
            }
        }
        return freqMap.keySet();
    }

    /*
     * @params num1, num2 should have same lenght
     * ex add2Numbers(09, 23)
     */
    public static String add2Numbers(String num1, String num2) {

        String result = "";
        int carry = 0;

        for (int i = num1.length() - 1; i > -1; --i) {
            int n1 = Character.getNumericValue(num1.charAt(i));
            int n2 = Character.getNumericValue(num2.charAt(i));
            int results = n1 + n2 + carry;
            result += (Integer.toString(results % 10));
            carry = 0;
            if (results > 9) {
                carry = 1;
            }
            if ((i == 0) && (results > 9)) {
                result += (Integer.toString(1));
            }
        }
        return new StringBuffer(result).reverse().toString();
    }

    public static int[] sieve1(int n) {

        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = i;
        }

        for (int i = 2; i < result.length; ++i) {
            // Su anda bulundugum rakam onceden silinmis mi?
            if (result[i] == 0) {
                continue;
            }
            int katlar = i * 2;
            // Silinmemis, o zaman bu rakamin tum katlarini sifirla
            while (katlar < result.length) {
                result[katlar] = 0;
                katlar += i;
            }
        }
        return result;
    }

    public static List<Integer> sieve2(int n) {
        byte[] result = new byte[n + 1];
        for (int i = 2; i <= n; i++) {
            result[i] = 1;
        }

        for (int i = 2; i < result.length; ++i) {
            // Su anda bulundugum rakam onceden silinmis mi?
            if (result[i] == 0) {
                continue;
            }
            int katlar = i * 2;
            // Silinmemis, o zaman bu rakamin tum katlarini sifirla
            while (katlar < result.length) {
                result[katlar] = 0;
                katlar += i;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (result[i] == 1) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static List<Integer> sieve3(int n) {
        BitSet bs = new BitSet(n + 1);
        bs.set(2, n);

        for (int i = 2; i < Math.sqrt(n); ++i) {
            // Su anda bulundugum rakam onceden silinmis mi?
            if (bs.get(i) == false) {
                continue;
            }
            int katlar = i * 2;
            // Silinmemis, o zaman bu rakamin tum katlarini sifirla
            while (katlar < bs.size()) {
                bs.set(katlar, false);
                katlar += i;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (bs.get(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    
    
}
