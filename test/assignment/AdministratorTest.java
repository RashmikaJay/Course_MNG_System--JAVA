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
public class AdministratorTest {
    
    public AdministratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAdmin method, of class Administrator.
     */
    @Test
    public void testGetAdmin() {
        System.out.println("getAdmin");
        Administrator instance = new Administrator();
        String expResult = "";
        String result = instance.getAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCourse method, of class Administrator.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        String code = "";
        String courseName = "";
        Administrator instance = new Administrator();
        instance.addCourse(code, courseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCourse method, of class Administrator.
     */
    @Test
    public void testEditCourse() {
        System.out.println("editCourse");
        Administrator instance = new Administrator();
        instance.editCourse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelCourse method, of class Administrator.
     */
    @Test
    public void testCancelCourse() {
        System.out.println("cancelCourse");
        Administrator instance = new Administrator();
        instance.cancelCourse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class Administrator.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        int moduleNo = 0;
        String moduleName = "";
        Administrator instance = new Administrator();
        instance.addModule(moduleNo, moduleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editModule method, of class Administrator.
     */
    @Test
    public void testEditModule() {
        System.out.println("editModule");
        int moduleNo = 0;
        String moduleName = "";
        Administrator instance = new Administrator();
        instance.editModule(moduleNo, moduleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateGrade method, of class Administrator.
     */
    @Test
    public void testGenerateGrade() {
        System.out.println("generateGrade");
        Administrator instance = new Administrator();
        int expResult = 0;
        int result = instance.generateGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pass_fail method, of class Administrator.
     */
    @Test
    public void testPass_fail() throws Exception {
        System.out.println("pass_fail");
        String stdid = "";
        Administrator instance = new Administrator();
        instance.pass_fail(stdid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
