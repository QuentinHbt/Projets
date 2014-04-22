/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;
import vue.Fenetre;


/**
 *
 * @author btssio
 */
public class CtrlPrincipal {
    

    private Fenetre fenetre =  new Fenetre();
    private CtrlMedicament ctrlMedicament = null;
    private CtrlPraticien ctrlPraticien = null;
    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlMenu ctrlMenu = null;
    private CtrlConnexion ctrlConnexion = null;
    private CtrlRapport ctrlRapport = null;
    

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        fenetre.setEnabled(true);
        fenetre.setContentPane(ctrlConnexion.getVue());
        fenetre.setVisible(true);
    }

    public void action(EnumAction action) {
        switch (action) {
            case MENU_MEDICAMENT: // activation de vueMedicament depuis vueMenu
                menuMedicament();
                break;
            case MEDICAMENT_QUITTER:    // retour à vueMenu depuis la vueMedicament
                medicamentQuitter();
                break;
            case MENU_PRATICIEN: 
                menuPraticien();
                break;
            case PRATICIEN_QUITTER:   
                medicamentQuitter();
                break;
           case MENU_VISITEUR: 
                menuVisiteur();
                break;
            case VISITEUR_QUITTER:   
                visiteurQuitter();
                break;
             case MENU_RAPPORT: 
                menuRapport();
                break;
            case RAPPORT_QUITTER:   
                rapportQuitter();
                break;
             case CONNEXION:   
                connexionQuitter();
                break;
            case MENU_FICHIER_QUITTER: // fin de l'application depuis vueMenu
                menuFichierQuitter();
                break;
        }

    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    private void menuFichierQuitter() {
        try {
            Jdbc.getInstance().deconnecter();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "CtrlPrincipal - fermeture connexion BD", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0);
        }
    }

    /**
     * Transition vueMenu / vuePresence
     */
    private void menuMedicament() {
        if (ctrlMedicament == null) {
            ctrlMedicament = new CtrlMedicament(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlMedicament.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMedicament.getVue());
        fenetre.setVisible(true);
       
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void medicamentQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
    }
    private void menuPraticien() {
        if (ctrlPraticien == null) {
            ctrlPraticien = new CtrlPraticien(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlPraticien.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlPraticien.getVue());
        fenetre.setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void PraticienQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
    }
     private void menuVisiteur() {
        if (ctrlVisiteur == null) {
            ctrlVisiteur = new CtrlVisiteur(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlVisiteur.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlVisiteur.getVue());
        fenetre.setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void visiteurQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
    }
        private void connexionQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
    }
        private void menuRapport() {
        if (ctrlRapport == null) {
            ctrlRapport = new CtrlRapport(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlRapport.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlRapport.getVue());
        fenetre.setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void rapportQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        fenetre.setVisible(false);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
    }
    
}

