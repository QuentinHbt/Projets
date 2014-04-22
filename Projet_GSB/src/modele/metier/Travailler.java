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
public class Travailler {
    Visiteur visiteur;
    Date jjmmaa;
    Region region;
    String travail_Role;

    public Travailler(Visiteur Visiteur, Date Jjmmaa, Region Region, String Travail_Role) {
        this.visiteur = Visiteur;
        this.jjmmaa = Jjmmaa;
        this.region = Region;
        this.travail_Role = Travail_Role;
    }

    @Override
    public String toString() {
        return "Travailler{" + "visiteur=" + visiteur + ", jjmmaa=" + jjmmaa + ", region=" + region + ", travail_Role=" + travail_Role + '}';
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur Visiteur) {
        this.visiteur = Visiteur;
    }

    public Date getJjmmaa() {
        return jjmmaa;
    }

    public void setJjmmaa(Date Jjmmaa) {
        this.jjmmaa = Jjmmaa;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region Region) {
        this.region = Region;
    }

    public String getTravail_Role() {
        return travail_Role;
    }

    public void setTravail_Role(String Travail_Role) {
        this.travail_Role = Travail_Role;
    }
    
    
    
}
