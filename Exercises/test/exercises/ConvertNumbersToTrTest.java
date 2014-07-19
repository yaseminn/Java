/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

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
public class ConvertNumbersToTrTest {
    
 
    
    @Test
    public void testMiniTest8() {
        System.out.println("miniTest");
        int num = 199;
        String expResult = "-yüz-doksandokuz";
        String result = ConvertNumbersToTr.miniTest(num);
        assertEquals(expResult, result);

    }
}