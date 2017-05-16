package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class BDCommande {
    private static BDCommande = null;
    private Map<Integer, Commande> mapCommande = new HashMap<>();
    
    private BDCommande(){
        super();
    }
    
    private static class BDCommandeHolder{
        private final static BDCommande instance = new BDCommande();
    }
    
    public final static BDCommande getInstance() {
		return BDCommande.instance;
	}
    
    public int enregistrerCommande(int numClient, Hamburger hamburger, Accompagnement accompagnment, Boisson boisson){
        Commande commande = new Commande(numClient, hamburger, accompagnement, boisson);
        numCommande = commande.getNumCommandeAttribue();
        mapCommande.put(numCommande, commande);
        return numCommande;
    }
    
    public String toString() {
    	return "BDCommande [mapCommande=" + mapCommande + "]";
    }
    
    public Commande removeCommande(int numCommande){
        return mapCommande.remove(numCommande);
    }
}
