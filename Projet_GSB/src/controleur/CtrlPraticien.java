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
import vue.VuePraticien;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlPraticien extends CtrlAbstrait {
    
   private DaoPraticien daoPraticien = new DaoPraticien();


    public CtrlPraticien(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VuePraticien(this);
        actualiser();
    }

    public final void actualiser() {
        try {
            chargerListePraticien();
          praticienSelectionner();
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlPraticien - actualiser - " + ex.getMessage(), "Saisie des Médicaments", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * presenceEnregistrer réaction au clic sur le bouton VALIDER de la vue
     * VuePresences
     */
    public void praticienSelectionner(){
               int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
         // Lire et contrôler les données du formulaire
        Praticien praticienSelect =(Praticien) getVue().getCbChercher().getSelectedItem();
    if (praticienSelect ==null){
        //Saisie incomplète
     
            msg = "Saisie incomplète";
            typeMsg = JOptionPane.WARNING_MESSAGE;
        } else {
        getVue().getTxtAdresse().setText(praticienSelect.getPraticien_Adresse());
        getVue().getTxtCodePostal().setText(praticienSelect.getPraticien_Cp());
        getVue().getTxtCoeffNotoriete().setText(praticienSelect.getPraticien_CoefNotoriete().toString());
        getVue().getTxtLieuExercice().setText(praticienSelect.getType_Practicien().getLieu());
        getVue().getTxtNom().setText(praticienSelect.getPraticien_Nom());
        getVue().getTxtNumero().setText(String.valueOf(praticienSelect.getPraticien_Num()));
        getVue().getTxtPrenom().setText(praticienSelect.getPra_Prenom());
        getVue().getTxtVille().setText(praticienSelect.getPraticien_Ville());
             
    }
    }
    /**
     *
     */
    public void suivant(){
         int index = getVue().getCbChercher().getSelectedIndex()+1; //méthode attribuant à la variable index l'id du praticien sélectionné incrémenté de 1
         if(index== getVue().getCbChercher().getItemCount()) index=0; //si index est égale à l'id max de la liste des praticiens celui-ci redevient 0 afin de revenir au début de la liste
         getVue().getCbChercher().setSelectedIndex(index); //
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
    public void praticienQuitter() {
        this.getCtrlPrincipal().action(EnumAction.PRATICIEN_QUITTER);
    }
    
    /**
     * chargerListeEquipiers renseigner le modèle du composant jComboBoxEquipier
     * à partir de la base de données
     *
     * @throws DaoException
     */
    /* */
    private void chargerListePraticien() throws DaoException {
        List<Praticien> lesPraticiens = daoPraticien.getAll();
        getVue().getMcbChercher().removeAllElements();
        for (Praticien unPraticien : lesPraticiens) {
            getVue().getMcbChercher().addElement(unPraticien);
        }
    }

    @Override
    public VuePraticien getVue() {
        return (VuePraticien) vue;
    }
    
}
