/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class ExercisesTest {
    
    public ExercisesTest() {
    }
    

   
    /**
     * Test of insertionSort method, of class Exercises.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        int[] s = {2,6,9,0,45,30};
        int[] result = {0,2,6,9,30,45};
        Exercises.insertionSort(result);

    }
}