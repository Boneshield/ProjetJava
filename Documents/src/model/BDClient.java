package model;

import java.util.HashMap;
import java.util.Map;

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
		return 0;
	}
}