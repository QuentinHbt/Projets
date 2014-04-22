/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.util.ArrayList;
import modele.metier.Rapport_Visite;
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
public class DaoRapportTest {
    
    public DaoRapportTest() {
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
     * Test of create method, of class DaoRapport.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Rapport_Visite unRapport = null;
        DaoRapport instance = new DaoRapport();
        int expResult = 0;
        int result = instance.create(unRapport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class DaoRapport.
     */
    @Test
    public void testGetOne() throws Exception {
        System.out.println("getOne");
        Integer idRapport = null;
        DaoRapport instance = new DaoRapport();
        Rapport_Visite expResult = null;
        Rapport_Visite result = instance.getOne(idRapport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class DaoRapport.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        DaoRapport instance = new DaoRapport();
        ArrayList expResult = null;
        ArrayList result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DaoRapport.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Integer idMetier = null;
        Rapport_Visite objetMetier = null;
        DaoRapport instance = new DaoRapport();
        int expResult = 0;
        int result = instance.update(idMetier, objetMetier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DaoRapport.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Integer idMetier = null;
        DaoRapport instance = new DaoRapport();
        int expResult = 0;
        int result = instance.delete(idMetier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  

    /**
     * Test of getCleMax method, of class DaoRapport.
     */
    @Test
    public void testGetCleMax() throws Exception {
        System.out.println("getCleMax");
        DaoRapport instance = new DaoRapport();
        int expResult = 0;
        int result = instance.getCleMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}