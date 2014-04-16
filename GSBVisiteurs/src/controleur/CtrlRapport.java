/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modele.dao.*;
import modele.metier.*;
import vue.VueAbstraite;
import vue.VueAjoutEch;
import vue.VueRapportVisite;
import vue.VueVisiteur;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlRapport extends CtrlAbstrait {

    private DaoRapport daoRapport = new DaoRapport();
    private DaoPraticien daoPraticien = new DaoPraticien();
    private DaoOffrir daoOffrir = new DaoOffrir();
    private DaoVisiteur daoVisiteur = new DaoVisiteur();
    private DaoMedicament daoMedicament = new DaoMedicament();
    private SimpleDateFormat formatFr = new SimpleDateFormat("dd/MM/yyyy");


    //private VueAbstraite vueAjoutEch = new  VueAjoutEch(this);
    public CtrlRapport(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueRapportVisite(this);
        actualiser();
    }

    public final void actualiser() {
        getVue().getBtnAjouter().setVisible(false);
        getVue().getBtnAjouterEch().setVisible(false);

        getVue().getCbRapport().setVisible(true);
        getVue().getBtnPrecedent().setVisible(true);
        getVue().getBtnSuivant().setVisible(true);
        getVue().getBtnNouveau().setVisible(true);
        getVue().getLbRapport().setVisible(true);
        try {
            chargerListeRapport();
            rapportSelectionner();

        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlVisiteur - actualiser - " + ex.getMessage(), "Saisie des Médicaments", JOptionPane.ERROR_MESSAGE);
        }
    }

    public final void menuEch() {
        ArrayList<Medicament> lesMedicaments = new ArrayList<Medicament>();
        try {
            lesMedicaments = daoMedicament.getAll();
        } catch (DaoException ex) {
            Logger.getLogger(CtrlRapport.class.getName()).log(Level.SEVERE, null, ex);
        }

        VueAjoutEch vueAjoutEch = new VueAjoutEch();
        vueAjoutEch.getMcbMedicament().removeAllElements();
        for (Medicament unMedicament : lesMedicaments) {
            vueAjoutEch.getMcbMedicament().addElement(unMedicament);
        }
        int selection = JOptionPane.showConfirmDialog(null, vueAjoutEch, "Ajout d'un medicament",
                JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
          if (selection == JOptionPane.OK_OPTION)
                {
                    Medicament unMedicament = (Medicament) vueAjoutEch.getCbMedicament().getSelectedItem();
                    int qte = (int) vueAjoutEch.getsQte().getValue();
                   getVue().getMtEchantillon().addRow(new Object[]{unMedicament, qte});
                }
  
    }

    public final void nouveau() {
        effacer();
        try {
            chargerListeVisiteur();
            chargerListePraticien();
        } catch (DaoException ex) {
        }
        getVue().getBtnAjouter().setVisible(true);
        getVue().getBtnAjouterEch().setVisible(true);

        getVue().getCbRapport().setVisible(false);
        getVue().getBtnPrecedent().setVisible(false);
        getVue().getBtnSuivant().setVisible(false);
        getVue().getBtnNouveau().setVisible(false);
        getVue().getLbRapport().setVisible(false);

    }

    private final void effacer() {
        getVue().getTxtBilan().setText("");
        getVue().getTxtDateRapport().setText("");
        getVue().getTxtMotifVisite().setText("");
        getVue().getMtEchantillon().setRowCount(0);
    }

    public final void ajouter()   {
            String msg = "ajout du rapport réussi"; // message à afficher à l'issue de la mise à jour
        int typeMsg = JOptionPane.INFORMATION_MESSAGE;
                  
        int cle = 0;
        Visiteur unVisiteur = (Visiteur) getVue().getCbVisiteur().getSelectedItem();
        Praticien unPraticien = (Praticien) getVue().getCbPraticien().getSelectedItem();
        String bilan = getVue().getTxtBilan().getText();
        String motif = getVue().getTxtMotifVisite().getText();
        Date date;
        try {
            date = formatFr.parse(getVue().getTxtDateRapport().getText());
  
        Rapport_Visite unRapport = new Rapport_Visite(unVisiteur, 0, unPraticien, date, bilan, motif);
        

     
 
        //Ajout du rapport
        try {
            cle = daoRapport.create(unRapport);
           // cle = daoRapport.getCleMax();

        if (cle>0){
        unRapport.setRapport_Num(cle);
        
        
        //Ajout des echantillons
      
        List<Offrir> lesEchantillon =null;
        int nbLigne =  getVue().getMtEchantillon().getRowCount();
        int i;
        try {
        for(i=0;i<nbLigne;i++){
             daoOffrir.ajouter(new Offrir(unVisiteur,unRapport,(Medicament) getVue().getTbEchantillons().getValueAt(i, 0),(int) getVue().getTbEchantillons().getValueAt(i, 1) ));
        }
          } catch (DaoException ex) {
           msg = "erreur à l'ajout d'un échantillon";
                typeMsg = JOptionPane.ERROR_MESSAGE;
        }
        
        
        }else{
            msg = "impossible de trouver l'identifiant du rapport";
                typeMsg = JOptionPane.ERROR_MESSAGE;
        }
                } catch (DaoException ex) {
                     msg = "erreur à l'ajout du rapport";
                typeMsg = JOptionPane.ERROR_MESSAGE;
        }       catch (Exception ex) {
                    Logger.getLogger(CtrlRapport.class.getName()).log(Level.SEVERE, null, ex);
                }
              } catch (ParseException ex) {
             msg = "impossible de convertir la date";
                typeMsg = JOptionPane.ERROR_MESSAGE;
        }
     
       JOptionPane.showMessageDialog(getVue(), msg, "Ajout rapport", typeMsg);
       
        actualiser();
    }

    public void rapportSelectionner() {
        int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
        // Lire et contrôler les données du formulaire
        Rapport_Visite rapportSelect = (Rapport_Visite) getVue().getCbRapport().getSelectedItem();
        if (rapportSelect == null) {
            //Saisie incomplète

            msg = "Saisie incomplète";
            typeMsg = JOptionPane.WARNING_MESSAGE;
        } else {
            getVue().getTxtBilan().setText(rapportSelect.getRapport_Bilan());
            if(rapportSelect.getRapport_Date()!=null){
            getVue().getTxtDateRapport().setText(formatFr.format(rapportSelect.getRapport_Date()));
            }
            getVue().getTxtMotifVisite().setText(rapportSelect.getRapport_Motif());
            getVue().getMcbPraticien().setSelectedItem(rapportSelect.getPracticien());
            getVue().getMcbVisiteur().setSelectedItem(rapportSelect.getVisiteur());
            try {
                chargerListeEchantillon(rapportSelect.getRapport_Num());
            } catch (DaoException ex) {
                Logger.getLogger(CtrlRapport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     */
    public void suivant() {
        int index = getVue().getCbRapport().getSelectedIndex() + 1;
        if (index == getVue().getCbRapport().getItemCount()) {
            index = 0;
        }
        getVue().getCbRapport().setSelectedIndex(index);
        // combo.hidePopup();
    }

    public void precedant() {
        int index = getVue().getCbRapport().getSelectedIndex() - 1;
        if (index == -1) {
            index = getVue().getCbRapport().getItemCount() - 1;
        }
        getVue().getCbRapport().setSelectedIndex(index);
        // combo.hidePopup();
    }

    /**
     * presenceAnnuler réaction au clic sur le bouton ANNULER de la vue Le
     * contrôle est rendu au contrôleur frontal
     */
    public void rapportQuitter() {
        this.getCtrlPrincipal().action(EnumAction.RAPPORT_QUITTER);
    }

    /**
     * chargerListeEquipiers renseigner le modèle du composant jComboBoxEquipier
     * à partir de la base de données
     *
     * @throws DaoException
     */
    /* */
    private void chargerListeRapport() throws DaoException {
        List<Rapport_Visite> lesRapports = daoRapport.getAll();
        getVue().getMcbRapport().removeAllElements();
        for (Rapport_Visite unRapport : lesRapports) {
            getVue().getMcbRapport().addElement(unRapport);
        }
    }

    private void chargerListePraticien() throws DaoException {
        List<Praticien> lesPraticiens = daoPraticien.getAll();
        getVue().getMcbPraticien().removeAllElements();
        for (Praticien unPraticien : lesPraticiens) {
            getVue().getMcbPraticien().addElement(unPraticien);
        }
    }

    private void chargerListeVisiteur() throws DaoException {
        List<Visiteur> lesVisiteurs = daoVisiteur.getAll();
        getVue().getMcbVisiteur().removeAllElements();
        for (Visiteur unVisiteur : lesVisiteurs) {
            getVue().getMcbVisiteur().addElement(unVisiteur);
        }
    }
    /*
     private void chargerListeMedicament() throws DaoException {
     List<Medicament> lesMedicaments = daoMedicament.getAll();

     vueAjoutEch.getMcbMedicament().removeAllElements();
     for (Medicament unMedicament : lesMedicaments) {
     vueAjoutEch.getMcbMedicament().addElement(unMedicament);
     }
     }
     */

    private void chargerListeEchantillon(int rapNum) throws DaoException {
        List<Offrir> lesEchantillons = daoOffrir.getRapport(rapNum);
        //   getVue().getMtEchantillon().setRowCount(1);
        //getVue().getTbEchantillons().remove
        getVue().getMtEchantillon().setColumnCount(2);
        getVue().getMtEchantillon().setRowCount(0);


        //   int i =0;
        for (Offrir unEchantillon : lesEchantillons) {
            getVue().getMtEchantillon().addRow(new String[]{unEchantillon.getMedicament().getMedicament_NomCommercial(), Integer.toString(unEchantillon.getOffrir_Qte())});
            //    getVue().getMtEchantillon().setRowCount(i+2);
            //     getVue().getTbEchantillons().setValueAt(unEchantillon.getMedicament().getMed_NomCommercial(), i, 0);
            //      getVue().getTbEchantillons().setValueAt(unEchantillon.getOff_Qte(), i, 1);
            //     i++;
        }
    }

    @Override
    public VueRapportVisite getVue() {
        return (VueRapportVisite) vue;
    }
}
