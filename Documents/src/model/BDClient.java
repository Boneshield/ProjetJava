package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BDClient {
	
	private Map<Integer, Client> listeClient = new HashMap<>();
	int nbClient = 0;
	
	public void ajouterClient(Client client) {
		listeClient.put(nbClient++ ,client);
	}


	public Map<Integer, Client> getListeClient() {
		return listeClient;
	}

	
	public String toString() {
    	return "BDClient [listeClient=" + listeClient + "]";
    }
	
	public int selectProfil(String login, String mdp) {
		//Parcours de la hashMap
		for(Entry<Integer, Client> entry : listeClient.entrySet()) {
		    Integer cle = entry.getKey();
		    Client valeur = entry.getValue();
		    // traitements
		    if(valeur.getLogin() == login && valeur.getMdp() == mdp)
		    {
		    	return cle;
		    }
		}
		return 0;
	}
	
	public Client getClient(int numClient){
	    return listeClient.get(numClient);
	}
}