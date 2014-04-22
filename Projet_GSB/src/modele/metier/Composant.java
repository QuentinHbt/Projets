/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Composant {
    String composant_Code;
    String composant_Libelle;

    public Composant(String composant_Code, String composant_Libelle) {
        this.composant_Code = composant_Code;
        this.composant_Libelle = composant_Libelle;
    }

    @Override
    public String toString() {
        return "Composant{" + "Code=" + composant_Code + ", Libelle=" + composant_Libelle + '}';
    }

    public String getComposant_Code() {
        return composant_Code;
    }

    public void setComposant_Code(String composant_Code) {
        this.composant_Code = composant_Code;
    }

    public String getComposant_Libelle() {
        return composant_Libelle;
    }

    public void setComposant_Libelle(String composant_Libelle) {
        this.composant_Libelle = composant_Libelle;
    }
    
    
    
}
