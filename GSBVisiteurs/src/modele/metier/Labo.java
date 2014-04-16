/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Labo {
    String labo_Code;
    String labo_Nom;
    String labo_ChefVente;

    public Labo(String labo_Code, String labo_Nom, String labo_ChefVente) {
        this.labo_Code = labo_Code;
        this.labo_Nom = labo_Nom;
        this.labo_ChefVente = labo_ChefVente;
    }

    @Override
    public String toString() {
        return "Labo{" + "code=" +labo_Code + ", nom=" + labo_Nom + ", chefVente=" + labo_Nom;
    }

    public String getLabo_Code() {
        return labo_Code;
    }

    public void setLabo_Code(String labo_Code) {
        this.labo_Code = labo_Code;
    }

    public String getLabo_Nom() {
        return labo_Nom;
    }

    public void setLabo_Nom(String labo_Nom) {
        this.labo_Nom = labo_Nom;
    }

    public String getLabo_ChefVente() {
        return labo_ChefVente;
    }

    public void setLabo_ChefVente(String labo_ChefVente) {
        this.labo_ChefVente = labo_ChefVente;
    }
    
    
}
