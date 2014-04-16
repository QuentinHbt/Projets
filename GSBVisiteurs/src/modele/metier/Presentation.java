/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Presentation {
    String presentation_Code;
    String presentation_Libelle;

    public Presentation(String Presentation_Code, String Presentation_Libelle) {
        this.presentation_Code = Presentation_Code;
        this.presentation_Libelle = Presentation_Libelle;
    }

    @Override
    public String toString() {
        return "Presentation{" + "Code=" + presentation_Code + ", Libelle=" + presentation_Libelle + '}';
    }

    public String getPresentation_Code() {
        return presentation_Code;
    }

    public void setPresentation_Code(String Presentation_Code) {
        this.presentation_Code = Presentation_Code;
    }

    public String getPresentation_Libelle() {
        return presentation_Libelle;
    }

    public void setPresentation_Libelle(String Presentation_Libelle) {
        this.presentation_Libelle = Presentation_Libelle;
    }
    
    
    
}
