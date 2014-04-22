/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;

/**
 *
 * @author btssio
 */
public class Visiteur {
    String matricule;
    String nom;
    String prenom;
    String adresse;
    String cp;
    String ville;
    Date dateEmbauche;
    Labo labo;
    Secteur secteur;

    public Visiteur(String Matricule, String Nom, String Prenom, String Adresse, String Cp, String Ville, Date DateEmbauche, Labo Labo, Secteur Secteur) {
        this.matricule = Matricule;
        this.nom = Nom;
        this.prenom = Prenom;
        this.adresse = Adresse;
        this.cp = Cp;
        this.ville = Ville;
        this.dateEmbauche = DateEmbauche;
        this.labo = Labo;
        this.secteur = Secteur;
    }

    @Override
    public String toString() {
        return matricule +" "+ nom +" "+ prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String Prenom) {
        this.prenom = Prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String Adresse) {
        this.adresse = Adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String Cp) {
        this.cp = Cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String Ville) {
        this.ville = Ville;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date DateEmbauche) {
        this.dateEmbauche = DateEmbauche;
    }

    public Labo getLabo() {
        return labo;
    }

    public void setLabo(Labo Labo) {
        this.labo = Labo;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur Secteur) {
        this.secteur = Secteur;
    }
    
    
}
