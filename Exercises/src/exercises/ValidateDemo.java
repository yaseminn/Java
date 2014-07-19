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
public class ValidateDemo {

    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("123-45-6789");
        input.add("41 79 9124983");
        input.add("987-65-4321 (attack)");
        input.add("+41 79 912 49 85");
        input.add("0041799124983");

        phoneNumberDetection(input);
    }

    /*
     * @param list of strings contains that "+41 79 912 49 85" or 
     * "0041799124983" or "41 79 9124983"
     */
    public static void phoneNumberDetection(List<String> input) {

        for (String phone : input) {
            if (phone.matches("^([0]{2}\\d{11})$")) {
                System.out.println("Found phone number: " + phone);
            }
            if (phone.matches("^(\\d{2}\\s\\d{2}\\s\\d{7})$")) {
                System.out.println("Found phone number: " + phone);
            }
            if (phone.matches("^.?(\\d{2}\\s\\d{2}\\s\\d{3}\\s\\d{2}\\s\\d{2})$")) {
                System.out.println("Found phone number: " + phone);
            }
        }

    }

    public static void dateDetection(List<String> input) {

        for (String date : input) {
            if (date.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)")) {
                System.out.println("Found date: " + date);
            }
        }
    }
}
