/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Type_Individu {
    String code;
    String libelle;

    public Type_Individu(String Code, String Libelle) {
        this.code = Code;
        this.libelle = Libelle;
    }

    @Override
    public String toString() {
        return "Type_Individu{" + "Code=" + code + ", Libelle=" + libelle + '}';
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
