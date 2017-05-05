package model;

import java.util.HashMap;
import java.util.Map;

public class BDClient {
	
	private Map<Integer, Client> listeClient = new HashMap<>();
	private int numero = 0;
	
	public void ajouterClient(Client client) {
		listeClient.put(numero, client);
		this.numero++;
	}


	public Map<Integer, Client> getListeClient() {
		return listeClient;
	}


	public void setListeClient(Map<Integer, Client> listeClient) {
		this.listeClient = listeClient;
	}
	
	public String toString() {
    	return "BDClient [listeClient=" + listeClient + "]";
    }
}