package model;

public class Commande{
    private Client client;
    private Hamburger hamburger;
    private int Accompagnement accompagnement;
    private int Boisson boisson;
    
    public Commande(Client client, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson){
        this.client = client;
        this.hamburger = hamburger;
        this.accompagnement = accompagnement;
        this.boisson = boisson;
    }
    
    public int getClient(){
        return client;
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
}