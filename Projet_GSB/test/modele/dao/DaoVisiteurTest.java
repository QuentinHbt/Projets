/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.util.ArrayList;
import java.util.Date;
import modele.metier.Visiteur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author btssio
 */
public class DaoVisiteurTest {
    
    public DaoVisiteurTest() {
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
     * Test of create method, of class DaoVisiteur.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Visiteur unVisiteur = null;
        DaoVisiteur instance = new DaoVisiteur();
        int expResult = 0;
        int result = instance.create(unVisiteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class DaoVisiteur.
     */
    @Test
    public void testGetOne_String() throws Exception {
        System.out.println("getOne");
        String idVisiteur = "";
        DaoVisiteur instance = new DaoVisiteur();
        Visiteur expResult = null;
        Visiteur result = instance.getOne(idVisiteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class DaoVisiteur.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        DaoVisiteur instance = new DaoVisiteur();
        ArrayList expResult = null;
        ArrayList result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DaoVisiteur.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Integer idMetier = null;
        Visiteur objetMetier = null;
        DaoVisiteur instance = new DaoVisiteur();
        int expResult = 0;
        int result = instance.update(idMetier, objetMetier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DaoVisiteur.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Integer idMetier = null;
        DaoVisiteur instance = new DaoVisiteur();
        int expResult = 0;
        int result = instance.delete(idMetier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verification method, of class DaoVisiteur.
     */
    @Test
    public void testVerification() throws Exception {
        System.out.println("verification");
        String login = "";
        Date password = null;
        DaoVisiteur instance = new DaoVisiteur();
        boolean expResult = false;
        boolean result = instance.verification(login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class DaoVisiteur.
     */
    @Test
    public void testGetOne_Integer() throws Exception {
        System.out.println("getOne");
        Integer idMetier = null;
        DaoVisiteur instance = new DaoVisiteur();
        Visiteur expResult = null;
        Visiteur result = instance.getOne(idMetier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}