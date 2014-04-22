/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Famille {
    String famille_Code;
    String famille_Libelle;

    public Famille(String famille_Code, String famille_Libelle) {
        this.famille_Code = famille_Code;
        this.famille_Libelle = famille_Libelle;
    }

    @Override
    public String toString() {
        return "Famille{" + "Code=" + famille_Code + ", Libelle=" + famille_Libelle + '}';
    }

    public String getFamille_Code() {
        return famille_Code;
    }

    public void setFamille_Code(String famille_Code) {
        this.famille_Code = famille_Code;
    }

    public String getFamille_Libelle() {
        return famille_Libelle;
    }

    public void setFamille_Libelle(String famille_Libelle) {
        this.famille_Libelle = famille_Libelle;
    }
    
    
}
