/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class Test {
    public static void main(String[] args) {
        Tri dict = new Tri();       
        //dict.insert("are");
        dict.insert("area");
        dict.insert("base");
        dict.insert("cat");
        dict.insert("cater");       
        dict.insert("basement");
         
        String input = "are";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));             
 
        /*
        input = "basement";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));                     
         
        input = "are";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));             
 
        input = "arex";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));             
 
        input = "basemexz";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));                     
         
        input = "xyz";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));   */                  
    }
}
