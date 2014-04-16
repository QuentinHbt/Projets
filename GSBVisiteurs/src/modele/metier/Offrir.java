/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Offrir {
    Visiteur visiteur;
    Rapport_Visite rapport_visite;
    Medicament medicament;
    int offrir_Qte;

    public Offrir(Visiteur visiteur, Rapport_Visite rapport_visite, Medicament medicament, int offrir_Qte) {
        this.visiteur = visiteur;
        this.rapport_visite = rapport_visite;
        this.medicament = medicament;
        this.offrir_Qte = offrir_Qte;
    }

    @Override
    public String toString() {
        return "Offrir{" + "visiteur=" + visiteur + ", rapport_visite=" + rapport_visite + ", medicament=" + medicament + ", Qte=" + offrir_Qte + '}';
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Rapport_Visite getRapport_visite() {
        return rapport_visite;
    }

    public void setRapport_visite(Rapport_Visite rapport_visite) {
        this.rapport_visite = rapport_visite;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public int getOffrir_Qte() {
        return offrir_Qte;
    }

    public void setOffrir_Qte(int offrir_Qte) {
        this.offrir_Qte = offrir_Qte;
    }
       
}
