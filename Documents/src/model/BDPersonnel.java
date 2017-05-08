package model;

import java.util.HashMap;
import java.util.Map;

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
		return 0;
	}
    
    public Personnel getPersonnel(int numPersonnel){
	    return listePersonnel.get(numPersonnel);
	}
}