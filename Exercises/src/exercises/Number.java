/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class Number {
    
    static final String[] numbers={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
    static final String[] numbers2 = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş",
    "seksen","doksan"};
    static final String[] numbers3={"","-yüz-","-bin-","-milyon-","-milyar-","-trilyon-","-katrilyar-"};
    
    
    public static String convertTo(int n){
        if(n<100){
            return numbers2[n/10] + numbers[n%10];
        }
        else if(n<1000){
            return numbers[n/100]+numbers3[1] + numbers2[(n%100)/10] + numbers[(n%100)%10]; 
        }
        else if(n<10000){
            return numbers[n/1000]+ numbers3[2]+numbers[(n%1000)/100]+numbers3[1]+numbers2[((n%1000)%100)/10]+
                    numbers[((n%1000)%100)%10];
        }
        else if(n<100000){
            return numbers2[n/10000]+numbers[(n%10000)/1000]+numbers3[2] +numbers[((n%1000)%1000)/100]+ 
                    numbers3[1]+numbers2[(((n%1000)%1000)%100)/10] + numbers[(((n%1000)%1000)%100)%10]; 
        }
        else if(n<1000000){
            return numbers[n/100000]+numbers3[1]+numbers2[(n%100000)/10000]+numbers[((n%100000)%10000)/1000]+numbers3[2]+
                    numbers[(((n%100000)%10000)%1000)/100]+numbers3[1]+numbers2[((((n%100000)%10000)%1000)%100)/10] + 
                    numbers[((((n%100000)%10000)%1000)%100)%10];
        }
        else if(n<100000000){
            return numbers2[n/10000000]+numbers[(n%10000000)/1000000]+numbers3[3]+numbers[((n%10000000)%1000000)/100000]+
                    numbers3[1]+numbers2[(((n%10000000)%1000000)%100000)/10000]+numbers[((((n%10000000)%1000000)%100000)%10000)/1000]+
                    numbers3[2]+numbers[(((((n%10000000)%1000000)%100000)%10000)%1000)/100]+numbers3[1]+
                    numbers2[((((((n%10000000)%1000000)%100000)%10000)%1000)%100)/10] +
                    numbers[((((((n%10000000)%1000000)%100000)%10000)%1000)%100)%10];
        }
        
        else if(n<1000000000){
            return numbers[n/100000000]+numbers3[1]+numbers2[(n%100000000)/10000000]+numbers[((n%100000000)%10000000)/1000000]+
                    numbers3[3]+numbers[(((n%100000000)%10000000)%10000000)/1000000]+numbers3[1]+
                    numbers2[((((n%100000000)%10000000)%10000000)%1000000)/100000]+
                    numbers[(((((n%100000000)%10000000)%10000000)%1000000)%100000)/10000]+
                    numbers3[2]+numbers[((((((n%100000000)%10000000)%10000000)%1000000)%100000)%10000)/1000] + numbers3[1]+
                    numbers2[(((((((n%100000000)%10000000)%10000000)%1000000)%100000)%10000)%1000)/100]+
                    numbers[((((((((n%100000000)%10000000)%10000000)%1000000)%100000)%10000)%1000)%100)/10];
        }
        
       return "amannnnn";
        
        
    }
    
    public static void main(final String[] args) {
    
        int num = 223;
        System.out.println(convertTo(num));
    
    }
}
