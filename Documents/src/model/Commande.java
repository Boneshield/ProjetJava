package model;

/**
* Classe gérant une commande
*/
public class Commande{
    private static int numCommande = 0;
    private int numClient;
    private Hamburger hamburger;
    private Accompagnement accompagnement;
    private Boisson boisson;
    private int numCommandeAttribue;
    
    public Commande(int numClient, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson){
        this.numClient = numClient;
        this.hamburger = hamburger;
        this.accompagnement = accompagnement;
        this.boisson = boisson;
        numCommandeAttribue = numCommande++;
    }
    
    
    public int getNumClient(){
        return numClient;
    }
    
    public Hamburger getHamburger(){
        return hamburger;
    }
    
    public Accompagnement getAccompagnement(){
        return accompagnement;
    }
    
    public Boisson getBoisson(){
        return boisson;
    }
    
    public int getNumCommandeAttribue(){
        return numCommandeAttribue;
    }
    
    public String toString() {
		return "Commande [numClient=" + getNom() + ", hamburger=" + hamburger.getNom()
		+ ", accompagnement=" + accompagnement.getNom() + ", boisson=" + boisson.getNom()
		+ "numCommandeAttribue=" + numCommandeAttribue + "]";
	}
}