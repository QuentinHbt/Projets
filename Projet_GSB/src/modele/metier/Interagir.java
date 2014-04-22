/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Interagir {
    Medicament medicament_Perturbateur;
    Medicament medicament_Perturber;

    public Interagir(Medicament medicament_Perturbateur, Medicament medicament_Perturbe) {
        this.medicament_Perturbateur = medicament_Perturbateur;
        this.medicament_Perturber = medicament_Perturbe;
    }

    @Override
    public String toString() {
        return "Interagir{" + "medicament_Perturbateur=" + medicament_Perturbateur + ", medicament_Perturbe=" + medicament_Perturber + '}';
    }

    public Medicament getMedicament_Perturbateur() {
        return medicament_Perturbateur;
    }

    public void setMedicament_Perturbateur(Medicament medicament_Perturbateur) {
        this.medicament_Perturbateur = medicament_Perturbateur;
    }

    public Medicament getMedicament_Perturber() {
        return medicament_Perturber;
    }

    public void setMedicament_Perturber(Medicament medicament_Perturber) {
        this.medicament_Perturber = medicament_Perturber;
    }
    
    
    
}
