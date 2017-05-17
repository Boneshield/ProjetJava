package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BDClient {
	
	private Map<Integer, Client> listeClient = new HashMap<>();
	private int numClient = 0;
	
	/**
	* Ajoute un client dans la BD client
	* @param Client client
	*/
	public void ajouterClient(Client client) {
		listeClient.put(numClient++ ,client);
	}

	public Map<Integer, Client> getListeClient() {
		return listeClient;
	}

	public String toString() {
    	return "BDClient [listeClient=" + listeClient + "]";
    }
	
	/**
	* Connecte le client à la BD avec son login et son mot de passe et retourne son numéro
	* @param String login, String mdp
	* @return int
	*/
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
	
	/**
	* Deconnecte le client de la BD à l'aide de son numéro
	* @param int numClient
	*/
	public void deconnexionClient(int numClient) {
		//Parcours de la hashMap
		Client valeur;
		for(Entry<Integer, Client> entry : listeClient.entrySet()) {
		    Integer cle = entry.getKey();
		    if( cle == numClient)
		    {
		    	valeur = entry.getValue();
		    	valeur.deconnexionProfil();
		    	break;
		    }
		}
	}
	
	public Client getClient(int numClient){
	    return listeClient.get(numClient);
	}
}