/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Medicament {
    String medicament_DepotLegal;
    String medicament_NomCommercial;
    Famille famille;
    String medicament_Composition;
    String medicament_Effets;
    String medicament_ContreIndic;
    Float medicament_PricEchantillon;

    public Medicament(String medicament_DepotLegal, String medicament_NomCommercial, Famille famille, String medicament_Composition, String medicament_Effets, String medicament_ContreIndic, Float medicament_PricEchantillon) {
        this.medicament_DepotLegal = medicament_DepotLegal;
        this.medicament_NomCommercial = medicament_NomCommercial;
        this.famille = famille;
        this.medicament_Composition = medicament_Composition;
        this.medicament_Effets = medicament_Effets;
        this.medicament_ContreIndic = medicament_ContreIndic;
        this.medicament_PricEchantillon = medicament_PricEchantillon;
    }

    @Override
    public String toString() {
        return medicament_NomCommercial;
    }

    public String getMedicament_DepotLegal() {
        return medicament_DepotLegal;
    }

    public void setMedicament_DepotLegal(String medicament_DepotLegal) {
        this.medicament_DepotLegal = medicament_DepotLegal;
    }

    public String getMedicament_NomCommercial() {
        return medicament_NomCommercial;
    }

    public void setMedicament_NomCommercial(String medicament_NomCommercial) {
        this.medicament_NomCommercial = medicament_NomCommercial;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    public String getMedicament_Composition() {
        return medicament_Composition;
    }

    public void setMedicament_Composition(String medicament_Composition) {
        this.medicament_Composition = medicament_Composition;
    }

    public String getMedicament_Effets() {
        return medicament_Effets;
    }

    public void setMedicament_Effets(String medicament_Effets) {
        this.medicament_Effets = medicament_Effets;
    }

    public String getMedicament_ContreIndic() {
        return medicament_ContreIndic;
    }

    public void setMedicament_ContreIndic(String medicament_ContreIndic) {
        this.medicament_ContreIndic = medicament_ContreIndic;
    }

    public Float getMedicament_PricEchantillon() {
        return medicament_PricEchantillon;
    }

    public void setMedicament_PricEchantillon(Float medicament_PricEchantillon) {
        this.medicament_PricEchantillon = medicament_PricEchantillon;
    }
   
    
}
