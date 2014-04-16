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
import vue.VueMedicament;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlMedicament extends CtrlAbstrait {
    
    private DaoMedicament daoMedicament = new DaoMedicament();

    /**
     * Constructeur de CtrlPrincipal
     * 
     * @param ctrlPrincipal 
     */
    public CtrlMedicament(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueMedicament(this);
        actualiser();
    }

    /**
     * Permet d'actualiser les médicaments
     */
    public final void actualiser() {
        try {
            chargerListeMedicament();
            medicamentSelectionner();
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlMedicament - actualiser - " + ex.getMessage(), "Saisie des Médicaments", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * presenceEnregistrer réaction au clic sur le bouton VALIDER de la vue
     * VuePresences
     */
    public void medicamentSelectionner(){
        int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
         // Lire et contrôler les données du formulaire
        Medicament medicamentSelect =(Medicament) getVue().getCbNomCommercial().getSelectedItem();
        if (medicamentSelect ==null){
            //Saisie incomplète
     
            msg = "Saisie incomplète";
            typeMsg = JOptionPane.WARNING_MESSAGE;
        } else {
            getVue().getTxtCode().setText(medicamentSelect.getMedicament_DepotLegal());
            getVue().getTxtComposition().setText(medicamentSelect.getMedicament_Composition());
            getVue().getTxtContreIndications().setText(medicamentSelect.getMedicament_ContreIndic());
            getVue().getTxtEffetsIndesirables().setText(medicamentSelect.getMedicament_Effets());
            getVue().getTxtFamille().setText(medicamentSelect.getFamille().getFamille_Libelle());
            getVue().getTxtPrixEchantillon().setText(medicamentSelect.getMedicament_PricEchantillon().toString());
        }
    }
    
    /**
     * Méthode pour afficher les médicaments suivants
     */
    public void suivant(){
        int index = getVue().getCbNomCommercial().getSelectedIndex()+1;
        if(index== getVue().getCbNomCommercial().getItemCount()) index=0;
            getVue().getCbNomCommercial().setSelectedIndex(index);
        // combo.hidePopup();
    }
    
    /**
     * Méthode pour afficher les médicaments précédants
     */
    public void precedant(){
        int index = getVue().getCbNomCommercial().getSelectedIndex()-1;
        if(index== -1) index=getVue().getCbNomCommercial().getItemCount()-1;
        getVue().getCbNomCommercial().setSelectedIndex(index);
        // combo.hidePopup();
    }
      
    /**
     * Renvoi au CtrlPrincipal pour quitter l'application
     */
    public void medicamentQuitter() {
        this.getCtrlPrincipal().action(EnumAction.MEDICAMENT_QUITTER);
    }
    
    /**
     * chargerListeMedicament renseigner le modèle du composant jComboBoxEquipier
     * à partir de la base de données
     *
     * @throws DaoException
     */
    /* */
    private void chargerListeMedicament() throws DaoException {
        List<Medicament> lesMedicaments = daoMedicament.getAll();
        getVue().getMcbNomCommercial().removeAllElements();
        for (Medicament unMedicament : lesMedicaments) {
            getVue().getMcbNomCommercial().addElement(unMedicament);
        }
    }

    /**
     * Permet de récupérer la vue
     * @return 
     */
    @Override
    public VueMedicament getVue() {
        return (VueMedicament) vue;
    }
    
}
