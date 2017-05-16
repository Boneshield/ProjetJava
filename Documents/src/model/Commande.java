package model;

public class Commande{
    private static int numCommande = 0;
    private Client client;
    private Hamburger hamburger;
    private int Accompagnement accompagnement;
    private int Boisson boisson;
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
    
    public int getHamburger(){
        return hamburger;
    }
    
    public int getAccompagnement(){
        return accompagnement;
    }
    
    public int getBoisson(){
        return boisson;
    }
    
    public int getnumCommandeAttribue(){
        return numCommandeAttribue;
    }
}