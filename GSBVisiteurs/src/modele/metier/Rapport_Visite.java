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
public class Rapport_Visite {
    Visiteur visiteur;
    int rapport_Num;
    Praticien practicien;
    Date rapport_Date;
    String rapport_Bilan;
    String rapport_Motif;

    public Rapport_Visite(Visiteur Visiteur, int Rapport_Num, Praticien Practicien, Date Rapport_Date, String Rapport_Bilan, String Rapport_Motif) {
        this.visiteur = Visiteur;
        this.rapport_Num = Rapport_Num;
        this.practicien = Practicien;
        this.rapport_Date = Rapport_Date;
        this.rapport_Bilan = Rapport_Bilan;
        this.rapport_Motif = Rapport_Motif;
    }

    @Override
    public String toString() {
        return "Rapport De Visite N " + rapport_Num;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur Visiteur) {
        this.visiteur = Visiteur;
    }

    public int getRapport_Num() {
        return rapport_Num;
    }

    public void setRapport_Num(int Rapport_Num) {
        this.rapport_Num = Rapport_Num;
    }

    public Praticien getPracticien() {
        return practicien;
    }

    public void setPracticien(Praticien Practicien) {
        this.practicien = Practicien;
    }

    public Date getRapport_Date() {
        return rapport_Date;
    }

    public void setRapport_Date(Date Rapport_Date) {
        this.rapport_Date = Rapport_Date;
    }

    public String getRapport_Bilan() {
        return rapport_Bilan;
    }

    public void setRapport_Bilan(String Rapport_Bilan) {
        this.rapport_Bilan = Rapport_Bilan;
    }

    public String getRapport_Motif() {
        return rapport_Motif;
    }

    public void setRapport_Motif(String Rapport_Motif) {
        this.rapport_Motif = Rapport_Motif;
    }
    
    
    
}
