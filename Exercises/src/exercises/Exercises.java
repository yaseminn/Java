/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author asus
 */
public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int array1[] = {2, 5, 9, 10, 12, 13, 18, 20, 25};
        int array2[] = {0, 1, 3, 4, 5};
        int array3[] = {0, 1, 2, 3, 4, 5};
        int a[] = {4, 6, 7, 9};
        int b[] = {1, 8, -3, -2, -10};
        int c[] = {0, 1, 2, 3, 5};

        // [1,3,4,6,7,8,9,15]

        /*
         * System.out.println("Element found : " + binarySearch(array1, 12));
         System.out.println("Element found : " + binarySearchRec(array1, 0, array1.length - 1, 12)); 
         * System.out.println(Arrays.toString(RandomizeArray(array3)));
         System.out.println(Arrays.toString(shuffleArray(array3)));

         System.out.println(countOnes(0xFFFFFFFF));
         System.out.println(findMissingElement2(array2));
         System.out.println(findMissingElement(array2,5));
         * 
         */

        /*System.out.println(convertLittleToBigEndian(0xCAFEBABE));
         System.out.println(Arrays.toString(oddEven(c)));
         //quicky(c);
         partition(c,0,c.length-1);
         System.out.println(set(0xb, 2));
         System.out.println(reset(0xf, 2));*/

        /*
         partition(c, 0, c.length - 1);
         System.out.println(maxSubArray(b));
         //findDuplicates("yasemin kayaaa bir birdir");
         findDuplicates2("yaseminyyyyyy kayaaa bir birdir");
         dictionaryHash("Hello you are fine");
         System.out.println("------------------------------");
         dictionaryTree("Hello you are fine");
         System.out.println("------------------------------");
         dictionaryLink("Hello you are fine");*/
        //System.out.println(Arrays.toString(mergeArray(a, b)));
        //FisherShuffle(array3);
        //System.out.println(isAcrosh("yasemin kaya", "yk"));
        /*     
         * String s = "kaya";
         String[] w = {"elma", "armut", "yaka", "ayak"};

         System.out.println(isAnagram(s, w));
         System.out.println(isAnagramHashMap(s, w));
         System.out.println(isPalindrome("Koyma vahit teyp yetti havam yok"));
         */
        /*
         String[] cal = {"2", "1", "+", "3", "*"};
         System.out.println("The result is : " + reservePolishNotation(cal));

         System.out.println(longestPalindrome("adbnmm okvmvm koyma vahit teyp yetti havam yok yanem jnnfjv kabak"));
         System.out.println(sumOf2(a, 200));
         System.out.println((sumOf2Hash(a, 10)));
         System.out.println((reserveString(" ")));
         String[] ya = {"yasemin", "kaya"};
         System.out.println(Arrays.toString(sorter(ya)));

         String[] karma = {"ya", "11", "30", "bebe", "26", "5"};
         System.out.println(isNumeric(karma[1]));
         System.out.println(sortArray(karma));*/
        System.out.println(stringToInt("92"));

        System.out.println(re(76));
    }

    /**
     *
     * @param array
     * @param x
     * @return
     *
     * O(log n )
     */
    public static int binarySearch(int[] array, int x) {

        int begin = 0;
        int finish = array.length - 1;
        int mid;
        while (begin <= finish) {

            mid = (begin + finish) / 2;
            if (array[mid] < x) {
                begin = mid + 1;
            } else if (array[mid] > x) {
                finish = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearchRec(int[] array, int begin, int finish, int x) {
        if (begin <= finish) {
            int mid = (begin + finish) / 2;
            if (array[mid] < x) {
                binarySearchRec(array, mid + 1, finish, x);
            } else if (array[mid] > x) {
                binarySearchRec(array, begin, mid - 1, x);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findMissingElement(int[] array, int n) {

        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i <= array.length - 1; ++i) {
            sum -= array[i];
        }
        return sum;
    }

    public static int findMissingElement2(int[] array) {

        int result = 0;

        for (int i = 0; i <= array.length - 2; ++i) {
            for (int j = 1; j < array.length - 1; ++j) {
                if (array[j] - array[i] == 2) {
                    result = array[i] + 1;
                }
            }
        }

        return result;
    }

    public static int[] RandomizeArray(int[] array) {
        Random rgen = new Random();  // Random number generator			

        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }

    public static int[] shuffleArray(int[] array) {

        int begin = 0;
        int finish = array.length;
        int mid = (begin + finish) / 2;

        for (int i = begin; i < mid - 1; ++i) {
            swap(array, 0, mid + i);
        }

        return array;

    }

    public static String[] getStringsByPrefix(String[] array, String str) {



        return array;

    }

    public static int countOnes(int num) {

        int total_ones = 0;
        while (num != 0) {
            num = num & (num - 1);
            total_ones++;
        }
        return total_ones;
    }

    public static int resetNumber(int num) {

        num = num & 0;
        return num;
    }

    public static String convertLittleToBigEndian(int num) {

        int x = (((num & 0xFF000000) >>> 24) | ((num & 0x00FF0000) >> 8))
                | (((num & 0x000000FF) << 24) | ((num & 0x0000FF00) << 8));

        return Integer.toHexString(x);
    }

    public static int[] mergeArray(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                answer[k++] = a[i++];
            } else {
                answer[k++] = b[j++];
            }
        }
        while (i < a.length) {
            answer[k++] = a[i++];
        }

        while (j < b.length) {
            answer[k++] = b[j++];
        }
        return answer;
    }

    public static void FisherShuffle(int[] array) {
        Random gen = new Random();
        int n = array.length;

        while (n > 1) {
            int k = gen.nextInt(n--);
            int temp = array[n];
            array[n] = array[k];
            array[k] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] oddEven(int[] array) {

        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 1) {
                newArray[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }

    public static void quicky(int[] array) {

        int begin = 0;
        int finish = array.length - 1;

        int mid = (begin + finish) / 2;

        while (begin <= finish) {
            while (array[begin] < array[mid]) {
                begin++;
            }

            while (array[finish] > array[mid]) {
                finish--;
            }

            if (begin <= finish) {
                int temp = array[begin];
                array[begin] = array[finish];
                array[finish] = temp;
                begin++;
                finish--;
            }

        }

        System.out.println(Arrays.toString(array));
    }

    // 1 ile or
    public static String set(int num, int chosenBit) {

        num = num | (1 << chosenBit);
        return Integer.toHexString(num);
    }

    // 0 ile and
    public static String reset(int num, int chosenBit) {

        num = num & ~(1 << chosenBit);
        return Integer.toHexString(num);

    }

    public static int maxSubArray(int[] array) {

        int maxSoFar = array[0];
        int maxEndHere = array[0];

        for (int i = 1; i < array.length; ++i) {
            if (maxEndHere < 0) {
                maxEndHere = array[i];
            } else {
                maxEndHere += array[i];
            }

            if (maxEndHere >= maxSoFar) {
                maxSoFar = maxEndHere;
            }
        }

        return maxSoFar;
    }

    public static void findDuplicates(String s) throws IOException {

        s = s.replaceAll("\\s+", "");
        StringReader r = new StringReader(s);

        Map<Character, Integer> histogram = new TreeMap<Character, Integer>();
        int c;
        while ((c = r.read()) != -1) {
            Integer count = histogram.get((char) c);
            if (count == null) {
                count = 0;
            }
            histogram.put((char) c, count + 1);
        }
        r.close();
        for (Entry<Character, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }

    public static void findDuplicates2(String s) throws IOException {

        s = s.replaceAll("\\s+", "");
        StringReader r = new StringReader(s);

        Map<Character, Integer> histogram = new HashMap<Character, Integer>();
        int c;
        int max = 0;
        char maxChar = ' ';
        while ((c = r.read()) != -1) {
            Integer count = histogram.get((char) c);
            if (count == null) {
                count = 0;
            }
            histogram.put((char) c, count + 1);

            if (count + 1 > max) {
                max = count + 1;
                maxChar = (char) c;
            }
        }
        r.close();

        for (Entry<Character, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }

        System.out.println(maxChar + " :" + max);

        System.out.println(Collections.max(histogram.values()));
    }

    //http://en.wikipedia.org/wiki/Quicksort
    public static void partition(int[] array, int left, int right) {


        int pivotIndex = left + (right - left) / 2;
        int pivotValue = array[pivotIndex];

        swap(array, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right - 1; ++i) {
            if (array[i] < pivotValue) {
                swap(array, i, storeIndex);
                storeIndex++;
                swap(array, storeIndex, right);
            }

        }

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void dictionaryHash(String str) {

        str = str.toLowerCase();
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("hello", "merhaba");
        dictionary.put("how", "nasıl");
        dictionary.put("are", "olmak");
        dictionary.put("you", "sen");

        String[] transStr = str.split(" ");

        for (int i = 0; i < transStr.length; ++i) {
            if (dictionary.containsKey(transStr[i])) {
                System.out.println(dictionary.get(transStr[i]));
            } else {
                System.out.println("There is no word like this");
            }
        }

        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }

        dictionary.remove("hello");
        System.out.println("------------ removedddddddddd ----------------");
        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }

    }

    public static void dictionaryTree(String str) {

        str = str.toLowerCase();
        Map<String, String> dictionary = new TreeMap<String, String>();

        dictionary.put("hello", "merhaba");
        dictionary.put("how", "nasıl");
        dictionary.put("are", "olmak");
        dictionary.put("you", "sen");

        String[] transStr = str.split(" ");

        for (int i = 0; i < transStr.length; ++i) {
            if (dictionary.containsKey(transStr[i])) {
                System.out.println(dictionary.get(transStr[i]));
            } else {
                System.out.println("There is no word like this");
            }
        }

        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }

        dictionary.remove("hello");
        System.out.println("------------ removedddddddddd ----------------");
        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }
    }

    public static void dictionaryLink(String str) {

        str = str.toLowerCase();
        Map<String, String> dictionary = new LinkedHashMap<String, String>();

        dictionary.put("hello", "merhaba");
        dictionary.put("how", "nasıl");
        dictionary.put("are", "olmak");
        dictionary.put("you", "sen");

        String[] transStr = str.split(" ");

        for (int i = 0; i < transStr.length; ++i) {
            if (dictionary.containsKey(transStr[i])) {
                System.out.println(dictionary.get(transStr[i]));
            } else {
                System.out.println("There is no word like this");
            }
        }

        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }

        dictionary.remove("hello");
        System.out.println("------------ removedddddddddd ----------------");
        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " means " + entry.getValue());
        }
    }

    public static boolean isAcrosh(String w, String s) {
        w = w.toLowerCase().trim();
        s = s.toLowerCase();

        List<String> myList = new ArrayList<String>(Arrays.asList(w.split(" ")));
        boolean result = false;

        for (int i = 0; i < s.length(); ++i) {
            if (myList.get(i).charAt(0) == s.charAt(i)) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }

    public static List<String> isAnagram(String s, String[] w) {

        List<String> result = new ArrayList<String>();

        char[] sChar = s.toLowerCase().toCharArray();
        Arrays.sort(sChar);

        for (int i = 0; i < w.length; ++i) {
            String word = w[i].toLowerCase();

            if (s.length() != word.length()) {
                System.out.println("The length of " + w[i] + " words is not equal");
            }

            char[] sortedChar = word.toCharArray();
            Arrays.sort(sortedChar);
            if (Arrays.equals(sChar, sortedChar)) {
                result.add(w[i]);
            }
        }
        return result;

    }

    public static ArrayList<String> isAnagramHashMap(String s, String[] w) {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < w.length; ++i) {
            if (s.length() == w[i].length()) {
                if (frequencyMap(s).equals(frequencyMap(w[i]))) {
                    result.add(w[i]);
                }
            }
        }

        return result;
    }

    public static Map<Character, Integer> frequencyMap(String str) {

        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (char c : str.toLowerCase().toCharArray()) {
            Integer fre = freqMap.get(c);
            if (fre == null) {
                fre = 0;
            }
            freqMap.put((char) c, fre + 1);
        }

        return freqMap;
    }

    public static boolean isPalindrome(String str) {

        boolean result = false;
        StringBuilder reserveString = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        str = str.toLowerCase().replaceAll("\\s+", "");

        for (int i = 0; i < str.length(); ++i) {
            stack.push(str.charAt(i));
        }

        while (!stack.empty()) {
            reserveString.append(stack.pop());
        }

        if (str.equalsIgnoreCase(reserveString.toString())) {
            result = true;
        }

        return result;
    }

    public static int reservePolishNotation(String[] str) {

        String operator = "+-/*";

        Stack<String> notation = new Stack<String>();

        for (String s : str) {
            if (!operator.contains(s)) {
                notation.push(s);
            } else {
                int num1 = Integer.valueOf(notation.pop());
                int num2 = Integer.valueOf(notation.pop());

                switch (s) {
                    case "+":
                        notation.push(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        notation.push(String.valueOf(num2 - num1));
                        break;
                    case "*":
                        notation.push(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        notation.push(String.valueOf(num2 / num1));
                        break;
                }

            }

        }
        return Integer.valueOf(notation.pop());

    }

    //O(n^2)
    public static String longestPalindrome(String str) {

        if (str.isEmpty()) {
            return null;
        }

        if (str.length() == 1) {
            return str;
        }

        str = str.toLowerCase().replaceAll("\\s+", "");

        String longest = str.substring(0, 1);
        for (int i = 0; i < str.length(); ++i) {
            String temp = helper(str, i, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }

            temp = helper(str, i, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }

        return longest;
    }

    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            end++;
            begin--;
        }

        return s.substring(begin + 1, end);

    }

    public static boolean wordBreak(String str, Set<String> dict, int start) {

        if (str.length() == start) {
            return true;
        }

        for (String a : dict) {
            int len = a.length();
            int end = len + start;

            if (end > str.length()) {
                continue;
            }

            if (str.subSequence(start, len + start).equals(a)) {
                if (wordBreak(str, dict, start + len)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void insertionSort(int[] s) {
        int i, j, moved;

        for (i = 1; i < s.length; ++i) {
            j = i;
            moved = s[i];
            while (j > 0 && s[j - 1] > moved) {
                s[j] = s[j - 1];
                j--;
            }
            s[j] = moved;
        }
    }

    public static List<Integer> sumOf2(int[] s, int target) {

        List<Integer> sum = new ArrayList<Integer>();
        for (int i = 0; i < s.length - 1; ++i) {
            for (int j = i + 1; j < s.length; ++j) {
                if (s[i] + s[j] == target) {
                    sum.add(i + 1);
                    sum.add(j + 1);
                }
            }
        }

        return sum;
    }

    public static List<Integer> sumOf2Hash(int[] s, int target) {

        List<Integer> sum = new ArrayList<Integer>();
        Map<Integer, Integer> sumOf = new HashMap<Integer, Integer>();

        for (int i = 0; i < s.length; ++i) {
            if (sumOf.containsKey(s[i])) {
                int index = sumOf.get(s[i]);
                sum.add(index + 1);
                sum.add(i + 1);
            }
            sumOf.put(target - s[i], i);
        }
        return sum;
    }

    public static String reserveString(String str) {

        if (str == null || str.length() == 0 || str.isEmpty()) {
            return "";
        }

        String[] splitStr = str.split(" ");
        String resultStr = "";

        for (int i = splitStr.length - 1; i >= 0; --i) {
            resultStr += splitStr[i] + " ";
            //resultStr = resultStr.concat(splitStr[i] + " ");
        }

        return resultStr;
    }

    public static String[] sorter(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void sortArray(String[] str) {
        List<String> resultChar = new ArrayList();
        List<Integer> resultNum = new ArrayList();

        int j = 0;
        for (int i = 0; i < str.length; ++i) {
            if (!isNumeric(str[i])) {
                resultChar.add(str[i]);
            } else {
                resultNum.add(Integer.parseInt(str[i]));
            }
        }

        Collections.sort(resultChar);
        Collections.sort(resultNum);
        int strCount = 0;
        int numCount = 0;

        for (int i = 0; i < str.length; ++i) {
            if (!isNumeric(str[i])) {
                str[i] = resultChar.get(strCount);
                strCount++;
            } else {
                str[i] = resultNum.get(numCount).toString();
                numCount++;
            }
        }
    }

    public static int stringToInt(String str) {

        char[] s = str.toCharArray();
        int result = 0;
        int pow = 1;

        for (int i = s.length - 1; i >= 0; --i) {
            if (s[i] < '0' || s[i] > '9') {
                result = -1;
            } else {
                result += (s[i] - '0') * pow;
                pow *= 10;
            }
        }
        return result;
    }

    public static int re(long s) {

        return (int) (s);
    }

 
}// end of the class
