/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dao.*;
import vue.VueConnexion;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlConnexion extends CtrlAbstrait {
    
    private DaoVisiteur daoVisiteur = new DaoVisiteur();
    private SimpleDateFormat formatFr = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Constructeur de CtrlConnexion
     * 
     * @param ctrlPrincipal 
     */
    public CtrlConnexion(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueConnexion(this);
    }
    
    /**
     * Méthode appelé lors du click sur connecter
     */
    public void seConnecter() {
        // Déclarations de variables locales
        int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
        String login = null;
        //String passwordTxt =null;
        //Date password = new Date((Date)getVue().getTxtPassword().getValue());
        //Récupération des valeur du formulaire
        login = getVue().getTxtLogin().getText();
        //password = getVue().getTxtPassword().getValue();
        try{
        Date password = formatFr.parse(getVue().getTxtPassword().getText());
            
            try {
                if(!daoVisiteur.verification(login, password)){
                 msg = "mauvais login ou mot de passe";
                   typeMsg = JOptionPane.WARNING_MESSAGE;
                } else {
                 this.getCtrlPrincipal().action(EnumAction.CONNEXION);
                }
            } catch (DaoException ex) {
                msg = "CtrlConnexion - seConnecter() - " + ex.getMessage();
                typeMsg = JOptionPane.ERROR_MESSAGE;
            } 
     
        }catch (ParseException ex) { 
            msg = "le format du mot de passe est mauvais";
            typeMsg = JOptionPane.ERROR_MESSAGE;
        } 
        if(!msg.isEmpty()){
            JOptionPane.showMessageDialog(getVue(), msg, "Connexion", typeMsg);
        }
    }

    /**
     * Renvoi au CtrlPrincipal pour fermer la fenêtre
     */
    public void connexionQuitter() {
        this.getCtrlPrincipal().action(EnumAction.MENU_FICHIER_QUITTER);
    }
    
    /**
     * Renvoi au CtrlPrincipal pour fermer la fenêtre, Après confirmation
     */
    public void fichierQuitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "Ambulances", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            this.getCtrlPrincipal().action(EnumAction.MENU_FICHIER_QUITTER);
        }
    }

    /*
    * Permet de récupérer la vue
    */
    @Override
    public VueConnexion getVue() {
        return (VueConnexion) vue;
    }
    
}
