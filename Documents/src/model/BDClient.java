package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BDClient {
	
	private Map<Integer, Client> listeClient = new HashMap<>();
	private int numClient = 0;
	
	public void ajouterClient(Client client) {
		listeClient.put(numClient++ ,client);
	}

	public Map<Integer, Client> getListeClient() {
		return listeClient;
	}

	
	public String toString() {
    	return "BDClient [listeClient=" + listeClient + "]";
    }
	
	public int connexionClient(String login, String mdp) {
		//Parcours de la hashMap
		Client valeur;
		for(Entry<Integer, Client> entry : listeClient.entrySet()) {
		    Integer cle = entry.getKey();
		    valeur = entry.getValue();
		    if(valeur.selectProfil(login, mdp))
		    {
		    	valeur.connexionProfil();
		    	return cle;
		    }
		}
		return -1;
	}
	
	public void deconnexionClient(String login, String mdp) {
		//Parcours de la hashMap
		Client valeur;
		for(Entry<Integer, Client> entry : listeClient.entrySet()) {
		    Integer cle = entry.getKey();
		    valeur = entry.getValue();
		    if(valeur.selectProfil(login, mdp))
		    {
		    	valeur.deconnexionProfil();
		    	return;
		    }
		}
	}
	
	public Client getClient(int numClient){
	    return listeClient.get(numClient);
	}
}