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
public class DaoVisiteur implements DaoInterface<Visiteur, Integer> {
     private DaoLabo daoLabo = new DaoLabo();
     
    /**
     * create - non implémentée
     * 
     * @param unVisiteur
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Visiteur unVisiteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * getOne - Lire un enregistrement d'après son identifiant
     *
     * @param idVisiteur métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
        public Visiteur getOne(String idVisiteur) throws DaoException {
        Visiteur result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR"
                + " LEFT OUTER JOIN SECTEUR ON SECTEUR.SEC_CODE=VISITEUR.SEC_CODE"
                + " WHERE VIS_MATRICULE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, idVisiteur);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoVisiteur::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * getAll - retourne la liste de tous les visiteurs
     * 
     * @return
     * @throws DaoException 
     */
    @Override
    public ArrayList<Visiteur> getAll() throws DaoException {
        ArrayList<Visiteur> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR"
                + " LEFT OUTER JOIN SECTEUR ON VISITEUR.SEC_CODE=SECTEUR.SEC_CODE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Visiteur unVisiteur = chargerUnEnregistrement(rs);
                result.add(unVisiteur);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoVisiteur::getAll : erreur requete SELECT : " + ex.getMessage());
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
    public int update(Integer idMetier, Visiteur objetMetier) throws Exception {
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
    
    /**
     * verification - retourne booleen pour verifier login et mdp
     * 
     * @param login
     * @param password
     * @return
     * @throws DaoException 
     */
    public boolean verification(String login, java.util.Date password) throws DaoException{
        boolean result = false;
        ResultSet rs = null;
        java.sql.Date passwordSql = new java.sql.Date(password.getTime());
      
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR WHERE VIS_NOM=? AND VIS_DATEEMBAUCHE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, login);
            ps.setDate(2, passwordSql);
            rs = ps.executeQuery();
            if (rs.next()) {
                result=true;
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoVisiteur::verification : erreur requete SELECT : " + ex.getMessage());
        }
        
        return result;
    }
    
    

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrement - permet de charger un visiteur
     * 
     * @param rs
     * @return
     * @throws DaoException 
     */
    private Visiteur chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Visiteur visiteur = new Visiteur(null,null,null,null,null,null,null,null,null);
        //    java.util.Date dateEmbauche = new java.util.Date(rs.getDate("VIS_DATEEMBAUCHE").getTime());
       
   
            visiteur.setMatricule(rs.getString("VIS_MATRICULE"));
            visiteur.setNom(rs.getString("VIS_NOM"));
            visiteur.setPrenom(rs.getString("VIS_PRENOM"));
            visiteur.setAdresse(rs.getString("VIS_ADRESSE"));
            visiteur.setCp(rs.getString("VIS_CP"));
            visiteur.setVille(rs.getString("VIS_VILLE"));
            visiteur.setDateEmbauche(rs.getDate("VIS_DATEEMBAUCHE"));
            visiteur.setLabo(daoLabo.getOne(rs.getString("LAB_CODE")));
            
            if(rs.getString("SEC_CODE")!=null){
                Secteur secteur = new Secteur(null,null);
                secteur.setCode(rs.getString("SEC_CODE"));
                secteur.setSecteur_Libelle(rs.getString("SEC_LIBELLE"));
                visiteur.setSecteur(secteur);
            }
            /*
            if(rs.getString("LAB_CODE")!=null){
                Labo labo = new Labo(null,null,null);
                labo.setLab_Code(rs.getString("LAB_CODE"));
                labo.setLab_ChefVente(rs.getString("LAB_CHEFVENTE"));
                labo.setLab_Nom(rs.getString("LAB_NOM"));
                visiteur.setLabo(labo);
    
            
            }*/
            
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DaoVisiteur - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    } 

    /**
     * getOne - non implémentée
     * 
     * @param idMetier
     * @return
     * @throws Exception 
     */
    @Override
    public Visiteur getOne(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
