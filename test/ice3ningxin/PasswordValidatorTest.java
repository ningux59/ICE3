/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice3ningxin;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NingxinGu 991624189
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }

    /**
     * Test of getPassword method, of class PasswordValidator.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        PasswordValidator instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class PasswordValidator.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "happy";
        PasswordValidator instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method, of class PasswordValidator.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        PasswordValidator instance = null;
        boolean expResult = false;
        boolean result = instance.isValidPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
