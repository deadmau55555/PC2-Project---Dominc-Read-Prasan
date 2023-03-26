/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.prog2.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author domre
 */
public class StaffTest {
    
    public StaffTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of get method, of class Staff.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Object expResult = null;
        Object result = Staff.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Staff.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Staff staff = null;
        Staff.add(staff);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuty method, of class Staff.
     */
    @Test
    public void testGetDuty() {
        System.out.println("getDuty");
        Staff instance = null;
        String expResult = "";
        String result = instance.getDuty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkload method, of class Staff.
     */
    @Test
    public void testGetWorkload() {
        System.out.println("getWorkload");
        Staff instance = null;
        int expResult = 0;
        int result = instance.getWorkload();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Staff.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Staff instance = null;
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Staff.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Staff instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Staff.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Staff instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Staff.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Staff instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Staff.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Staff instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
