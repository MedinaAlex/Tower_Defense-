/**
 * Created by Jacques on 09/11/2016.
 */
package com.epsi.tower_defense;
public class Ennemi {
    String nom;
    int vitesse;
    int pv;
    int degat;
    int prix;
    int[] ancienneCoordonées;
    int[] actuelleCoordonées;
   
    
    public Ennemi (String nom, int vitesse, int pv, int degat, int prix, int[] actuelle){
        this.nom = nom;
        this.vitesse = vitesse;
        this.pv = pv;
        this.degat = degat;
        this.prix = prix;
        this.actuelleCoordonées = actuelle;
    }
    
    public void deplacement(){
    	this.ancienneCoordonées = this.actuelleCoordonées;
    	// TODO
    }
    
    public void perdrePV(int degat){
    	this.pv -= degat;
    }
    
    public boolean verifierEnVie(){
    	return pv <= 0;
    }    
}
