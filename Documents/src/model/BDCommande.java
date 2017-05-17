package model;

import java.util.HashMap;
import java.util.Map;

public final class BDCommande {
    private static BDCommande instance = null;
    private Map<Integer, Commande> mapCommande = new HashMap<>();
    
    private BDCommande(){
        super();
    }
    
    /**
	* Crée le singleton de la BDCommande
	*/
    public final static BDCommande getInstance() {
    	if(BDCommande.instance == null) {
			synchronized(BDCommande.class) {
				if(BDCommande.instance == null) {
					BDCommande.instance = new BDCommande();
				}
			}
		}
		return BDCommande.instance;
	}
    
    /**
	* Ajoute les infos de la commande dans la map BDCommande
	* @param int numCLient, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson
	* @return int numCommande
	*/
    public int enregistrerCommande(int numClient, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson){
        Commande commande = new Commande(numClient, hamburger, accompagnement, boisson);
        int numCommande = commande.getNumCommandeAttribue();
        mapCommande.put(numCommande, commande);
        return numCommande;
    }
    
    public String toString() {
    	return "BDCommande [mapCommande=" + mapCommande + "]";
    }
    
    /**
	* Supprime la commande numCommande de la map 
	* @param int numCommande
	* @return Commande commande
	*/
    public Commande removeCommande(int numCommande){
        return mapCommande.remove(numCommande);
    }
}
