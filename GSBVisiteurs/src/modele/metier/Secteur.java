/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Secteur {
    String code;
    String secteur_Libelle;

    public Secteur(String Secteur_Code, String Secteur_Libelle) {
        this.code = Secteur_Code;
        this.secteur_Libelle = Secteur_Libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getSecteur_Libelle() {
        return secteur_Libelle;
    }

    public void setSecteur_Libelle(String Secteur_Libelle) {
        this.secteur_Libelle = Secteur_Libelle;
    }
   
}
