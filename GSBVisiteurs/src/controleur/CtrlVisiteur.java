/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.*;
import modele.metier.*;
import vue.VueVisiteur;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlVisiteur extends CtrlAbstrait {
    
   private DaoVisiteur daoVisiteur = new DaoVisiteur();
   private DaoLabo daoLabo = new DaoLabo();


    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueVisiteur(this);
        actualiser();
    }

    public final void actualiser() {
        try {
            chargerListeVisiteur();
          chargerListeLabo();
          visiteurSelectionner();
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlVisiteur - actualiser - " + ex.getMessage(), "Saisie des Médicaments", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * presenceEnregistrer réaction au clic sur le bouton VALIDER de la vue
     * VuePresences
     */
    public void visiteurSelectionner(){
               int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
         // Lire et contrôler les données du formulaire
        Visiteur visiteurSelect =(Visiteur) getVue().getCbChercher().getSelectedItem();
    if (visiteurSelect ==null){
        //Saisie incomplète
     
            msg = "Saisie incomplète";
            typeMsg = JOptionPane.WARNING_MESSAGE;
        } else {
      
        getVue().getTxtAdresse().setText(visiteurSelect.getAdresse());
        getVue().getTxtCodePostal().setText(visiteurSelect.getCp());
        getVue().getTxtNom().setText(visiteurSelect.getNom());
        getVue().getTxtPrenom().setText(visiteurSelect.getPrenom());
        getVue().getTxtVille().setText(visiteurSelect.getVille());
        if(visiteurSelect.getSecteur()!=null){
        getVue().getTxtSecteur().setText(visiteurSelect.getSecteur().getSecteur_Libelle());
        }else{
            getVue().getTxtSecteur().setText("pas de secteur");
        }
        if(visiteurSelect.getLabo()!=null){
        getVue().getMcbLabo().setSelectedItem(visiteurSelect.getLabo());
        }
    }
    }
    /**
     *
     */
    public void suivant(){
         int index = getVue().getCbChercher().getSelectedIndex()+1;
         if(index== getVue().getCbChercher().getItemCount()) index=0;
         getVue().getCbChercher().setSelectedIndex(index);
        // combo.hidePopup();
    }
     public void precedant(){
         int index = getVue().getCbChercher().getSelectedIndex()-1;
         if(index== -1) index=getVue().getCbChercher().getItemCount()-1;
         getVue().getCbChercher().setSelectedIndex(index);
        // combo.hidePopup();
    }
      
 
    /**
     * presenceAnnuler réaction au clic sur le bouton ANNULER de la vue Le
     * contrôle est rendu au contrôleur frontal
     */
    public void visiteurQuitter() {
        this.getCtrlPrincipal().action(EnumAction.VISITEUR_QUITTER);
    }
    
    /**
     * chargerListeEquipiers renseigner le modèle du composant jComboBoxEquipier
     * à partir de la base de données
     *
     * @throws DaoException
     */
    /* */
    private void chargerListeVisiteur() throws DaoException {
        List<Visiteur> lesVisiteurs = daoVisiteur.getAll();
        getVue().getMcbChercher().removeAllElements();
        for (Visiteur unVisiteur : lesVisiteurs) {
            getVue().getMcbChercher().addElement(unVisiteur);
        }
    }
    
    private void chargerListeLabo() throws DaoException {
        List<Labo> lesLabos = daoLabo.getAll();
        getVue().getMcbLabo().removeAllElements();
        for (Labo unLabo : lesLabos) {
            getVue().getMcbLabo().addElement(unLabo);
        }
    }

    @Override
    public VueVisiteur getVue() {
        return (VueVisiteur) vue;
    }
    
}
