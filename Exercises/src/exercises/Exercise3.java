/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class Exercise3 {

    public String countLetter(String input) {
          int count = 0;
        String result = "";
        
        if (input == null) {
            throw new NullPointerException("Input parameter is null");
        }
      
        char same = input.charAt(0);
        for (int i = 0; i < input.length(); ++i) {
            if (same == input.charAt(i)) {
                count++;
            } else {
                result += Integer.toString(count) + same;
                same = input.charAt(i);
                count = 1;
            }
        }
        result += Integer.toString(count) + same;
        return result;
    }

    public static void main(String[] arg) {

        String is = null;
        Exercise3 ex = new Exercise3();
        System.out.println(ex.countLetter(is));
    }
}
