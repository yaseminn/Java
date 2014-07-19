/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *
 * @author asus
 */
public class MyStack {
    
    private List<Integer> data;
    
    public MyStack(){
        data = new ArrayList<Integer>();
    }
    
    public boolean empty(){
        return data.isEmpty();
    }
    
    public int peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return data.get(data.size()-1);
    }
    
    public int pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        
        return data.remove(data.size()-1);
    }
    
    public int push(int element){
        data.add(element);
        return element;
    }
    
    public int max(){
       int max  = data.get(0);
       
       for(int i =1; i<data.size(); ++i){   
           if(max < data.get(i)){
               max = data.get(i);
           }
       }
       
       return max;
    }
}
