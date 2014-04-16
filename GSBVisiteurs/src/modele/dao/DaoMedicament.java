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
public class DaoMedicament implements DaoInterface<Medicament, Integer> {

    /**
     * Create - non implémentée
     * 
     * @param unMedicament
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Medicament unMedicament) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param idMedicament métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
        public Medicament getOne(String idMedicament) throws DaoException {
        Medicament result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM MEDICAMENT"
                + " INNER JOIN FAMILLE ON MEDICAMENT.FAM_CODE = FAMILLE.FAM_CODE"
                + " WHERE MED_DEPOTLEGAL=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, idMedicament);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoMedicament::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * GetAll - Retourne la liste des médicaments d'une famille
     * 
     * @return
     * @throws DaoException 
     */
    @Override
    public ArrayList<Medicament> getAll() throws DaoException {
        ArrayList<Medicament> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM MEDICAMENT"
                + " LEFT JOIN FAMILLE ON FAMILLE.FAM_CODE=MEDICAMENT.FAM_CODE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Medicament unMedicament = chargerUnEnregistrement(rs);
                result.add(unMedicament);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoMedicament::getAll : erreur requete SELECT : " + ex.getMessage());
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
    public int update(Integer idMetier, Medicament objetMetier) throws Exception {
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
     * chargerUnEnregistrement - charge un enregistrement de médicament
     * @param rs
     * @return
     * @throws DaoException 
     */
    private Medicament chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Medicament medicament = new Medicament(null,null,null,null,null,null,null);
           
            
         medicament.setMedicament_DepotLegal(rs.getString("MED_DEPOTLEGAL"));
         medicament.setMedicament_NomCommercial(rs.getString("MED_NOMCOMMERCIAL"));
          if(rs.getString("FAM_CODE")!=null){
              Famille famille = new Famille(null,null);
               famille.setFamille_Code(rs.getString("FAM_CODE"));
               famille.setFamille_Libelle(rs.getString("FAM_LIBELLE"));
               medicament.setFamille(famille);
          }
           medicament.setMedicament_Composition(rs.getString("MED_COMPOSITION"));
           medicament.setMedicament_Effets(rs.getString("MED_EFFETS"));
            medicament.setMedicament_ContreIndic(rs.getString("MED_CONTREINDIC")); 
           medicament.setMedicament_PricEchantillon(rs.getFloat("MED_PRIXECHANTILLON"));
            return medicament;
        } catch (SQLException ex) {
            throw new DaoException("DaoMedicament - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
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
    public Medicament getOne(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
