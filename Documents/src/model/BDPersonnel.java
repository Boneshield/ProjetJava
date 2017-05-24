package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BDPersonnel{
    private Map<Integer, Personnel> listePersonnel = new HashMap<>();
    int nbPersonnel = 0;
    
    public void ajouterPersonnel(Personnel personnel){
        listePersonnel.put(nbPersonnel, personnel);
    }
    
    public Map<Integer, Personnel> getListePersonnel() {
		return listePersonnel;
	}
    
    public String toString() {
    	return "BDPersonnel [listePersonnel=" + listePersonnel + "]";
    }
    
    public int connexionPersonnel(String login, String mdp) {
		//Parcours de la hashMap
    	for(Entry<Integer, Personnel> entry : listePersonnel.entrySet()) {
		    Integer cle = entry.getKey();
		    Personnel valeur = entry.getValue();
		    if(valeur.selectProfil(login, mdp))
		    {
		    	valeur.connexionProfil();
		    	return cle;
		    }
		}
		return -1;
	}
    
    
    public Personnel getPersonnel(int numPersonnel){
	    return listePersonnel.get(numPersonnel);
	}
	
	/**
	* Deconnecte le personnel de la BD à l'aide de son numéro
	* @param int numPersonnel
	*/
	public void deconnexionPersonnel(int numPersonnel) {
		Personnel personnel = listePersonnel.get(numPersonnel);
		personnel.deconnexionProfil();
	}
}