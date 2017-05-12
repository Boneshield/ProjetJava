package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BDCommande {
    private Map<Integer, Commande> listeCommande = new HashMap<>();
    private int numCommande = 1;
    
    public int ajouterCommande(Commande commande){
        listeCommande.put(numCommande, commande);
        return numCommande++;
    }
    
    public String toString() {
    	return "BDCommande [listeCommande=" + listeCommande + "]";
    }
    
    public Commande getCommande(int numCommande){
        return listeCommande.get(numCommande);
    }
}
