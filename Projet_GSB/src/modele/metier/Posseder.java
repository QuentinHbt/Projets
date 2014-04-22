/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Posseder {
    Praticien practicien;
    Specialiste specialite;
    String posseder_Diplome;
    Float posseder_CoefPrescription;

    public Posseder(Praticien practicien, Specialiste specialite, String posseder_Diplome, Float posseder_CoefPrescription) {
        this.practicien = practicien;
        this.specialite = specialite;
        this.posseder_Diplome = posseder_Diplome;
        this.posseder_CoefPrescription = posseder_CoefPrescription;
    }

    @Override
    public String toString() {
        return "Posseder{" + "practicien=" + practicien + ", specialite=" + specialite + ", Diplome=" + posseder_Diplome + ", CoefPrescription=" + posseder_CoefPrescription + '}';
    }

    public Praticien getPracticien() {
        return practicien;
    }

    public void setPracticien(Praticien practicien) {
        this.practicien = practicien;
    }

    public Specialiste getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialiste specialite) {
        this.specialite = specialite;
    }

    public String getPosseder_Diplome() {
        return posseder_Diplome;
    }

    public void setPosseder_Diplome(String posseder_Diplome) {
        this.posseder_Diplome = posseder_Diplome;
    }

    public Float getPosseder_CoefPrescription() {
        return posseder_CoefPrescription;
    }

    public void setPosseder_CoefPrescription(Float posseder_CoefPrescription) {
        this.posseder_CoefPrescription = posseder_CoefPrescription;
    }
    
    
    
}
