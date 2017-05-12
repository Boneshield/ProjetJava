package model;

public class Commande{
    private int numClient;
    private int numHamburger;
    private int numAccompagnement;
    private int numBoisson;
    
    public Commande(int numClient, int numHamburger, int numAccompagnement, int numBoisson){
        this.numClient = numClient;
        this.numHamburger = numHamburger;
        this.numAccompagnement = numAccompagnement;
        this.numBoisson = numBoisson;
    }
    
    public int getNumClient(){
        return numClient;
    }
    
    public int getNumHamburger(){
        return numHamburger;
    }
    
    public int getNumAccompagnement(){
        return numAccompagnement;
    }
    
    public int getNumBoisson(){
        return numBoisson;
    }
}