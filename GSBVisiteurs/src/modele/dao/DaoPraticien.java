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
 * Classe DAO pour la classe Visiteur
 */
public class DaoPraticien implements DaoInterface<Praticien, Integer> {

    /**
     * Create - non implémentée
     * 
     * @param unPraticien
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Praticien unPraticien) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * getOne - Lire un enregistrement d'après son identifiant
     *
     * @param idPraticien métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
    @Override
    public Praticien getOne(Integer idPraticien) throws DaoException {
        Praticien result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN"
                + " LEFT JOIN TYPE_PRATICIEN ON PRATICIEN.TYP_CODE=TYPE_PRATICIEN.TYP_CODE"
                + " WHERE PRA_NUM=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idPraticien);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoPraticien::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * getAll - renvoi une liste des occurences de Praticien
     * 
     * @return
     * @throws DaoException 
     */
    @Override
    public ArrayList<Praticien> getAll() throws DaoException {
        ArrayList<Praticien> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN"
                + " LEFT JOIN TYPE_PRATICIEN ON PRATICIEN.TYP_CODE=TYPE_PRATICIEN.TYP_CODE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Praticien unPraticien = chargerUnEnregistrement(rs);
                result.add(unPraticien);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoPraticien::getAll : erreur requete SELECT : " + ex.getMessage());
        }
        return result;
    }

    /**
     * update - non implémentée
     * 
     * @param idMetier
     * @param objetMetier
     * @return
     * @throws Exception 
     */
    @Override
    public int update(Integer idMetier, Praticien objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * delete - non implémentée
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
     * chargerUnEnregistrement permet de charger un praticien
     * 
     * @param rs
     * @return
     * @throws DaoException 
     */
    private Praticien chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Praticien praticien = new Praticien(0,null,null,null,null,null,null,null);
            praticien.setPraticien_Num(rs.getInt("PRA_NUM"));
            praticien.setPraticien_Nom(rs.getString("PRA_NOM"));
            praticien.setPra_Prenom(rs.getString("PRA_PRENOM"));
            praticien.setPraticien_Adresse(rs.getString("PRA_ADRESSE"));
            praticien.setPraticien_Cp(rs.getString("PRA_CP"));
            praticien.setPraticien_Ville(rs.getString("PRA_VILLE"));
            praticien.setPraticien_CoefNotoriete(rs.getFloat("PRA_COEFNOTORIETE"));
            if(rs.getString("TYP_CODE")!=null){
                Type_Praticien typePraticien = new Type_Praticien(null,null,null);
                typePraticien.setCode(rs.getString("TYP_CODE"));
                typePraticien.setLibelle(rs.getString("TYP_LIBELLE"));
                typePraticien.setLieu(rs.getString("TYP_LIEU"));
                praticien.setType_Practicien(typePraticien);
            }
                     
            return praticien;
        } catch (SQLException ex) {
            throw new DaoException("DaoPraticien - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    } 
    
}
