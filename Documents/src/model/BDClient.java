package model;

import java.util.HashMap;
import java.util.Map;

public class BDClient {
	
	private Map<Integer, Client> ListeClient = new HashMap<>();
	
	
	public void ajouterClient(Client client) {
		
	}


	public Map<Integer, Client> getListeClient() {
		return ListeClient;
	}


	public void setListeClient(Map<Integer, Client> listeClient) {
		ListeClient = listeClient;
	}
}