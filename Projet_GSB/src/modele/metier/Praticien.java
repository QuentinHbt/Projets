/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Praticien {
    int praticien_Num;
    String praticien_Nom;
    String praticien_Prenom;
    String praticien_Adresse;
    String praticien_Cp;
    String praticien_Ville;
    Float praticien_CoefNotoriete;
    Type_Praticien type_Practicien;

    public Praticien(int praticien_Num, String praticien_Nom, String praticien_Prenom, String praticien_Adresse, String praticien_Cp, String praticien_Ville, Float praticien_CoefNotoriete, Type_Praticien type_Practicien) {
        this.praticien_Num = praticien_Num;
        this.praticien_Nom = praticien_Nom;
        this.praticien_Prenom = praticien_Prenom;
        this.praticien_Adresse = praticien_Adresse;
        this.praticien_Cp = praticien_Cp;
        this.praticien_Ville = praticien_Ville;
        this.praticien_CoefNotoriete = praticien_CoefNotoriete;
        this.type_Practicien = type_Practicien;
    }

    @Override
    public String toString() {
        return  praticien_Num + " " + praticien_Nom + " " + praticien_Prenom;
    }

    public int getPraticien_Num() {
        return praticien_Num;
    }

    public void setPraticien_Num(int praticien_Num) {
        this.praticien_Num = praticien_Num;
    }

    public String getPraticien_Nom() {
        return praticien_Nom;
    }

    public void setPraticien_Nom(String praticien_Nom) {
        this.praticien_Nom = praticien_Nom;
    }

    public String getPra_Prenom() {
        return praticien_Prenom;
    }

    public void setPra_Prenom(String pra_Prenom) {
        this.praticien_Prenom = pra_Prenom;
    }

    public String getPraticien_Adresse() {
        return praticien_Adresse;
    }

    public void setPraticien_Adresse(String praticien_Adresse) {
        this.praticien_Adresse = praticien_Adresse;
    }

    public String getPraticien_Cp() {
        return praticien_Cp;
    }

    public void setPraticien_Cp(String praticien_Cp) {
        this.praticien_Cp = praticien_Cp;
    }

    public String getPraticien_Ville() {
        return praticien_Ville;
    }

    public void setPraticien_Ville(String praticien_Ville) {
        this.praticien_Ville = praticien_Ville;
    }

    public Float getPraticien_CoefNotoriete() {
        return praticien_CoefNotoriete;
    }

    public void setPraticien_CoefNotoriete(Float praticien_CoefNotoriete) {
        this.praticien_CoefNotoriete = praticien_CoefNotoriete;
    }

    public Type_Praticien getType_Practicien() {
        return type_Practicien;
    }

    public void setType_Practicien(Type_Praticien type_Practicien) {
        this.type_Practicien = type_Practicien;
    }
    
    
}
