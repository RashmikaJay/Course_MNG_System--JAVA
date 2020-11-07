/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ps
 */
public class StudentTest {
    
    Student JUnit = new Student();
    
    @Test
    public void testGetstID() {
        System.out.println("getstID");
        
        int result = JUnit.getstID(5);
        assertEquals(5, result);
       
    }

    @Test
    public void testGetLevel() {
        System.out.println("getstLevel");
        
        String result = JUnit.getLevel("6");
        assertEquals("6", result);
    }
    
  
}
