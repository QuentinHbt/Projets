/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.dao;

import modele.metier.*;
import modele.jdbc.Jdbc;
import java.sql.*;
import java.util.*;

/**
 * Classe DAO pour la classe Labo
 * @author Benoit
 */
public class DaoLabo implements DaoInterface<Labo, Integer> {

    /**
     * Create - non implémentée
     * 
     * @param unLabo
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Labo unLabo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * GetOne - Lire un enregistrement d'après son identifiant
     *
     * @param idLabo métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
        public Labo getOne(String idLabo) throws DaoException {
        Labo result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM LABO"
                                + " WHERE LAB_CODE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, idLabo);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoLabo::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences d'equipiers de la table
     * EQUIPIER
     */
    @Override
    public ArrayList<Labo> getAll() throws DaoException {
        ArrayList<Labo> result = new ArrayList<Labo>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM LABO";
        
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Labo unLabo = chargerUnEnregistrement(rs);
                result.add(unLabo);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoLabo::getAll : erreur requete SELECT : " + ex.getMessage());
        }
        return result;
    }

    /**
     * Update - non implémentée
     * 
     * @param idMetier
     * @param objetMetier
     * @return
     * @throws Exception 
     */
    @Override
    public int update(Integer idMetier, Labo objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Delete - non implémentée
     * 
     * @param idMetier
     * @return
     * @throws Exception 
     */
    @Override
    public int delete(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrement Instancie un objet labo avec les valeurs lues
     * dans la BDD avec la table Labo
     * @param rs
     * @return
     * @throws DaoException 
     */
    private Labo chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            
                Labo labo = new Labo(null,null,null);
                labo.setLabo_Code(rs.getString("LAB_CODE"));
                labo.setLabo_ChefVente(rs.getString("LAB_CHEFVENTE"));
                labo.setLabo_Nom(rs.getString("LAB_NOM"));
  
            return labo;
        } catch (SQLException ex) {
            throw new DaoException("DaoLabo - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    } 

    /**
     * GetOne - non implémentée
     * 
     * @param idMetier
     * @return
     * @throws Exception 
     */
    @Override
    public Labo getOne(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
