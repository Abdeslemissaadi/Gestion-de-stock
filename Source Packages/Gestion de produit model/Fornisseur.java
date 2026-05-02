/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.des.produit.modele;

/**
 *
 * @author Abdeslem ISSAADI
 */
public class Fornisseur {
     public int N_for;
   public String nom_prenom;
   public String telephone ;
   public String adresse;
    public String nfix;

    public Fornisseur(String nom_prenom, String telephone, String adresse, String nfix) {
        this.nom_prenom = nom_prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.nfix = nfix;
    }

    public Fornisseur(int N_for, String nom_prenom, String telephone, String adresse, String nfix) {
        this.N_for = N_for;
        this.nom_prenom = nom_prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.nfix = nfix;
    }

    public int getN_for() {
        return N_for;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getnfix() {
        return nfix;
    }
     
    
}  
