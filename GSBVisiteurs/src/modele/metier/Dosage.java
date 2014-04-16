/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Dosage {
    String dosage_Code;
    String dosage_Quantite;
    String dosage_Unite;

    public Dosage(String dosage_Code, String dosage_Quantite, String dosage_Unite) {
        this.dosage_Code = dosage_Code;
        this.dosage_Quantite = dosage_Quantite;
        this.dosage_Unite = dosage_Unite;
    }

    @Override
    public String toString() {
        return "Dosage{" + "Code=" + dosage_Code + ", Quantite=" + dosage_Quantite + ", Unite=" + dosage_Unite + '}';
    }

    public String getDosage_Code() {
        return dosage_Code;
    }

    public void setDosage_Code(String dosage_Code) {
        this.dosage_Code = dosage_Code;
    }

    public String getDosage_Quantite() {
        return dosage_Quantite;
    }

    public void setDosage_Quantite(String dosage_Quantite) {
        this.dosage_Quantite = dosage_Quantite;
    }

    public String getDosage_Unite() {
        return dosage_Unite;
    }

    public void setDosage_Unite(String dosage_Unite) {
        this.dosage_Unite = dosage_Unite;
    }
    
    
    
}
