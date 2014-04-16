/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Specialiste {
    String code;
    String libelle;

    public Specialiste(String Specialiste_Code, String Specialiste_Libelle) {
        this.code = Specialiste_Code;
        this.libelle = Specialiste_Libelle;
    }

    @Override
    public String toString() {
        return "Specialiste{" + "Code=" + code + ", Libelle=" + libelle + '}';
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
      
}
