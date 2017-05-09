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
    
    public int selectProfil(String login, String mdp) {
		//Parcours de la hashMap
    	for(Entry<Integer, Personnel> entry : listePersonnel.entrySet()) {
		    Integer cle = entry.getKey();
		    Personnel valeur = entry.getValue();
		    // traitements
		    if(valeur.getLogin() == login && valeur.getMdp() == mdp)
		    {
		    	return cle;
		    }
		}
		return 0;
	}
    
    public Personnel getPersonnel(int numPersonnel){
	    return listePersonnel.get(numPersonnel);
	}
}