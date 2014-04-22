/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Type_Praticien {
    String code;
    String libelle;
    String lieu;

    public Type_Praticien(String Code, String Libelle, String Lieu) {
        this.code = Code;
        this.libelle = Libelle;
        this.lieu = Lieu;
    }

    @Override
    public String toString() {
        return "Type_Practicien{" + "typ_Code=" + code + ", typ_Libelle=" + libelle + ", typ_Lieu=" + lieu + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String Libelle) {
        this.libelle = Libelle;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String Lieu) {
        this.lieu = Lieu;
    }
    
    
    
}
