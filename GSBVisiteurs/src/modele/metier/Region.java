/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Region {
    String code;
    String nom;
    Secteur secteur;

    public Region(String Region_Code, String Region_Nom, Secteur Secteur) {
        this.code = Region_Code;
        this.nom = Region_Nom;
        this.secteur = Secteur;
    }

    @Override
    public String toString() {
        return "Region{" + "Code=" + code + ", Nom=" + nom + ", Secteur=" + secteur + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur Secteur) {
        this.secteur = Secteur;
    }
    
}
