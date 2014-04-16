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
 * Classe DAO pour la Classe Famille
 * @author Benoit
 */
public class DaoFamille implements DaoInterface<Famille, Integer> {

    /**
     * Create - non implémentée
     * 
     * @param uneFamille
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Famille uneFamille) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * GetOne - Lire un enregistrement d'après son identifiant
     *
     * @param idFamille métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
        public Famille getOne(String idFamille) throws DaoException {
        Famille result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM FAMILLE WHERE FAM_CODE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, idFamille);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoFamille::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * GetAll
     *
     * @return ArrayList de l'ensemble des occurences d'equipiers de la table
     * EQUIPIER
     */
    @Override
    public ArrayList<Famille> getAll() throws DaoException {
        ArrayList<Famille> result = new ArrayList<Famille>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM FAMILLE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Famille uneFamille = chargerUnEnregistrement(rs);
                result.add(uneFamille);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoFamille::getAll : erreur requete SELECT : " + ex.getMessage());
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
    public int update(Integer idMetier, Famille objetMetier) throws Exception {
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
     * chargerUnEnregistrement Instancie un objet famille avec les
     * valeurs lues dans la base de données 
     *
     * @param rs enregistrement de la table Famille courant
     * @return un objet famille
     * @throws DaoException
     */
    private Famille chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Famille famille = new Famille(null,null);
            famille.setFamille_Code(rs.getString("FAM_CODE"));
            famille.setFamille_Libelle(rs.getString("FAM_LIBELLE"));
            
            return famille;
        } catch (SQLException ex) {
            throw new DaoException("DaoFamille - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    } 

    
    @Override
    public Famille getOne(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
