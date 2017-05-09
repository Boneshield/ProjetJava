package model;

public class CarteBancaire{
    private int numCarte;
    private int dateCarte;
    
    public CarteBancaire(int numCarte, int dateCarte){
        this.numCarte = numCarte;
        this.dateCarte = dateCarte;
    }
    
    public int getNumeroCarte(){
        return numCarte;
    }
    
    public int dateCarte(){
        return dateCarte;
    }
}