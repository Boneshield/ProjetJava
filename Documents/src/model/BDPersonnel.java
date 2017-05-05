package model;

import java.util.HashMap;
import java.util.Map;

public class BDPersonnel{
    private Map<Integer, Personnel> listePersonnel = new HashMap<>();
    private int numero = 0;
    
    public void ajouterPersonnel(Personnel personnel){
        listePersonnel.put(numero++, personnel);
    }
    
    public String toString() {
    	return "BDPersonnel [listePersonnel=" + listePersonnel + "]";
    }
}