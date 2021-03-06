package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public final class BDCommande extends Observable {
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
        super.setChanged();
        String labels = "Commande no "+commande.getNumCommandeAttribue()+":"+commande.getHamburger().getNom()
                        +", "+commande.getAccompagnement().getNom()+", "+commande.getBoisson().getNom();
        super.notifyObservers(labels);
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
