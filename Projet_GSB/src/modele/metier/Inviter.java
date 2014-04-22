/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Inviter {
    Activite_Complementaire activite_Complementaire;
    Praticien praticien;
    boolean specialisteON;

    public Inviter(Activite_Complementaire activite_Complementaire, Praticien praticien, boolean specialisteON) {
        this.activite_Complementaire = activite_Complementaire;
        this.praticien = praticien;
        this.specialisteON = specialisteON;
    }

    @Override
    public String toString() {
        return "Inviter{" + "activite_Compl=" + activite_Complementaire + ", praticien=" + praticien + ", specialisteON=" + specialisteON + '}';
    }

    public Activite_Complementaire getActivite_Complementaire() {
        return activite_Complementaire;
    }

    public void setActivite_Complementaire(Activite_Complementaire activite_Complementaire) {
        this.activite_Complementaire = activite_Complementaire;
    }

    public Praticien getPraticien() {
        return praticien;
    }

    public void setPraticien(Praticien praticien) {
        this.praticien = praticien;
    }

    public boolean isSpecialisteON() {
        return specialisteON;
    }

    public void setSpecialisteON(boolean specialisteON) {
        this.specialisteON = specialisteON;
    }
    
    
    
}
