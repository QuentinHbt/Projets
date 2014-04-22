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
 * Classe DAO pour la classe Rapport
 */
public class DaoRapport implements DaoInterface<Rapport_Visite, Integer> {

    private DaoVisiteur daoVisiteur = new DaoVisiteur();
    private DaoPraticien daoPraticien = new DaoPraticien();

    /**
     * create - A MODIFIER !!!!!!!!!!!!!!!! TODO
     * 
     * @param rapport
     * @return
     * @throws Exception 
     */
    @Override
    public int create(Rapport_Visite rapport) throws Exception {
      
        ResultSet rsGK = null; // ResultSet devant contenir le dernier ID généré ou vide
        int nb;
        boolean ok = true;
        int cle = 0;
        java.sql.Date datesql = new java.sql.Date(rapport.getRapport_Date().getTime());
        // préparer la requête
        String requete = "INSERT INTO RAPPORT_VISITE (VIS_MATRICULE,  PRA_NUM, RAP_DATE,  RAP_BILAN, RAP_MOTIF) VALUES (?, ? , ? , ?, ?)";
        try {
                    Jdbc.getInstance().getConnexion().setAutoCommit(false);
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);

            ps.setString(1, rapport.getVisiteur().getMatricule());
            //     ps.setInt(2,rapport.getRap_Num());
            ps.setInt(2, rapport.getPracticien().getPraticien_Num());
            ps.setDate(3, datesql);
            ps.setString(4, rapport.getRapport_Bilan());
            ps.setString(5, rapport.getRapport_Motif());
            nb = ps.executeUpdate();
            /*   rsGK = ps.getGeneratedKeys();
             if (rsGK.next()){
               
             cle = rsGK.getInt(1);
             }*/
            cle = getCleMax();
                     Jdbc.getInstance().getConnexion().commit();
            Jdbc.getInstance().getConnexion().setAutoCommit(true);
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapport::create : erreur requete INSERT : " + ex.getMessage());
        }
        return cle;
    }

    /**
     * getOne - Lire un enregistrement d'après son identifiant
     *
     * @param idRapport métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws DaoException
     */
    @Override
    public Rapport_Visite getOne(Integer idRapport) throws DaoException {
        Rapport_Visite result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE"
                + " WHERE RAP_NUM=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idRapport);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
            ps.close();
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapport::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    /**
     * getAll - retourne une liste de toutes les occurences de rapport_visite
     * 
     * @return
     * @throws DaoException 
     */
    @Override
    public ArrayList<Rapport_Visite> getAll() throws DaoException {
        ArrayList<Rapport_Visite> result = new ArrayList<Rapport_Visite>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Rapport_Visite unRapport = chargerUnEnregistrement(rs);
                result.add(unRapport);
            }
            ps.close();
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapport::getAll : erreur requete SELECT : " + ex.getMessage());
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
    public int update(Integer idMetier, Rapport_Visite objetMetier) throws Exception {
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
     * ajouter - requete d'insertion d'un rapport
     * @param rapport
     * @return
     * @throws DaoException 
     */
    public int ajouter(Rapport_Visite rapport) throws DaoException {
        ResultSet rsGK = null; // ResultSet devant contenir le dernier ID généré ou vide
        int nb;
        boolean ok = true;
        int cle = 0;
        java.sql.Date datesql = new java.sql.Date(rapport.getRapport_Date().getTime());
        // préparer la requête
        String requete = "INSERT INTO RAPPORT_VISITE (VIS_MATRICULE,  PRA_NUM, RAP_DATE,  RAP_BILAN, RAP_MOTIF) VALUES (?, ? , ? , ?, ?)";
        try {
            Jdbc.getInstance().getConnexion().setAutoCommit(false);
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);

            ps.setString(1, rapport.getVisiteur().getMatricule());
            //     ps.setInt(2,rapport.getRap_Num());
            ps.setInt(2, rapport.getPracticien().getPraticien_Num());
            ps.setDate(3, datesql);
            ps.setString(4, rapport.getRapport_Bilan());
            ps.setString(5, rapport.getRapport_Motif());
            nb = ps.executeUpdate();
            /*    rsGK = ps.getGeneratedKeys();
             if (rsGK.next()){
               
             cle = rsGK.getInt(1);
             }
             */
            cle = getCleMax();
            Jdbc.getInstance().getConnexion().commit();
            Jdbc.getInstance().getConnexion().setAutoCommit(true);
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapport::ajouter : erreur requete INSERT : " + ex.getMessage());
        }
        return cle;
    }

    /**
     * getCleMax - retourne le dernier rapport ?????
     * @return
     * @throws DaoException 
     */
    public int getCleMax() throws DaoException {
        int result = 0;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT MAX(RAP_NUM) AS CLE FROM RAPPORT_VISITE";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);

            rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getInt("CLE");
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapport::getCleMax : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrement - charge un rapport
     * @param rs
     * @return
     * @throws DaoException 
     */
    private Rapport_Visite chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Rapport_Visite rapport = new Rapport_Visite(null, 0, null, null, null, null);
            rapport.setRapport_Bilan(rs.getString("RAP_BILAN"));
            rapport.setRapport_Date(rs.getDate("RAP_DATE"));
            rapport.setRapport_Motif(rs.getString("RAP_MOTIF"));
            rapport.setRapport_Num(rs.getInt("RAP_NUM"));
            rapport.setVisiteur(daoVisiteur.getOne(rs.getString("VIS_MATRICULE")));
            rapport.setPracticien(daoPraticien.getOne(rs.getInt("PRA_NUM")));

            return rapport;
        } catch (SQLException ex) {
            throw new DaoException("DaoRapport - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
    
}
