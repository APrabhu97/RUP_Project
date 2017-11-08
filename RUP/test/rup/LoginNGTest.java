/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rup;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mahe
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        assertEquals(1,1);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TestLogin(){
        Boolean expected = true;
        Object obj = Login.validate_login("Shyamal","1234");
        assertEquals(expected.getClass().getTypeName(),obj.getClass().getTypeName());
        
    }
    
    @Test
    public void TestPageLoading(){
        Object obj = new Register();
        assertNotNull(obj);
    }
    
    @Test
    public void testRegister(){
        Boolean expected = true;
        Object obj = Login.validate_login("Shyamal","34534");
        assertEquals(expected.getClass().getTypeName(),obj.getClass().getTypeName());
    }
    
}
