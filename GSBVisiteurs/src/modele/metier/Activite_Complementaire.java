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
public class Activite_Complementaire {
    private String activite_Num;
    private Date activite_Date;
    private String activite_Lieu;
    private String activite_Theme;
    private String activite_Motif;

    public Activite_Complementaire(String activite_Num, Date activite_Date, String activite_Lieu, String activite_Theme, String activite_Motif) {
        this.activite_Num = activite_Num;
        this.activite_Date = activite_Date;
        this.activite_Lieu = activite_Lieu;
        this.activite_Theme = activite_Theme;
        this.activite_Motif = activite_Motif;
    }

    @Override
    public String toString() {
        return "Activite_Compl{" + "Num=" + activite_Num + ", Date=" + activite_Date + ", Lieu=" + activite_Lieu + ", Theme=" + activite_Theme + ", Motif=" + activite_Motif + '}';
    }
    

    public String getActivite_Num() {
        return activite_Num;
    }

    public void setActivite_Num(String activite_Num) {
        this.activite_Num = activite_Num;
    }

    public Date getActivite_Date() {
        return activite_Date;
    }

    public void setActivite_Date(Date activite_Date) {
        this.activite_Date = activite_Date;
    }

    public String getActivite_Lieu() {
        return activite_Lieu;
    }

    public void setActivite_Lieu(String activite_Lieu) {
        this.activite_Lieu = activite_Lieu;
    }

    public String getActivite_Theme() {
        return activite_Theme;
    }

    public void setActivite_Theme(String activite_Theme) {
        this.activite_Theme = activite_Theme;
    }

    public String getActivite_Motif() {
        return activite_Motif;
    }

    public void setActivite_Motif(String activite_Motif) {
        this.activite_Motif = activite_Motif;
    }
    
    
    
}
