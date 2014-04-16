/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Realiser {
    Activite_Complementaire activite_Complementaire;
    Visiteur visiteur;
    Float realisation_MttFrais;

    public Realiser(Activite_Complementaire activite_Complementaire, Visiteur Visiteur, Float Realisation_MttFrais) {
        this.activite_Complementaire = activite_Complementaire;
        this.visiteur = Visiteur;
        this.realisation_MttFrais = Realisation_MttFrais;
    }

    @Override
    public String toString() {
        return "Realiser{" + "activite_Complementaire=" + activite_Complementaire + ", visiteur=" + visiteur + ", realisation_MttFrais=" + realisation_MttFrais + '}';
    }

    public Activite_Complementaire getActivite_Complementaire() {
        return activite_Complementaire;
    }

    public void setActivite_Complementaire(Activite_Complementaire Activite_Complementaire) {
        this.activite_Complementaire = Activite_Complementaire;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur Visiteur) {
        this.visiteur = Visiteur;
    }

    public Float getRealisation_MttFrais() {
        return realisation_MttFrais;
    }

    public void setRealisation_MttFrais(Float Realisation_MttFrais) {
        this.realisation_MttFrais = Realisation_MttFrais;
    }
    
    
    
}
