/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class Tri {
    
    private TrieNode root;   
     // Constructor
    public Tri()   {     root = new TrieNode((char)0);       }   
   
    // Method to insert a new word to Tri
    public void insert(String word)  {
           
        // Find length of the given word
        int length = word.length();       
        TrieNode crawl = root;
           
        // Traverse through all characters of given word
        for( int level = 0; level < length; level++)
        {
            HashMap<Character,TrieNode> child = crawl.getChildren();           
            char ch = word.charAt(level);
               
            // If there is already a child for current character of given word
            if( child.containsKey(ch))
                crawl = child.get(ch);
            else   // Else create a child
            {             
                TrieNode temp = new TrieNode(ch);
                child.put( ch, temp );
                crawl = temp;
            }
        }
           
        // Set bIsEnd true for last character
        crawl.setIsEnd(true);
    }
       
    // The main method that finds out the longest string 'input'
    public String getMatchingPrefix(String input)  {
        String result = ""; // Initialize resultant string
        int length = input.length();  // Find length of the input string      
           
        // Initialize reference to traverse through Tri
        TrieNode crawl = root;  
          
        // Iterate through all characters of input string 'str' and traverse
        // down the Tri
        int level, prevMatch = 0;
        for( level = 0 ; level < length; level++ ){   
            // Find current character of str
            char ch = input.charAt(level);   
              
            // HashMap of current Tri node to traverse down
            HashMap<Character,TrieNode> child = crawl.getChildren();                       
             
            // See if there is a Tri edge for the current character
            if( child.containsKey(ch) )
            {
               result += ch;          //Update result
               crawl = child.get(ch); //Update crawl to move down in Tri
                 
               // If this is end of a word, then update prevMatch
               if( crawl.isEnd() )
                    prevMatch = level + 1;
            }           
            //else  break;
        }
          
        // If the last processed character did not match end of a word,
        // return the previously matching prefix
        if( !crawl.isEnd() )
                return result.substring(0, prevMatch);       
         
        else return result;
    }
       
    
}
