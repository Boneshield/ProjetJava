package model;

import java.util.HashMap;
import java.util.Map;

public class BDPersonnel{
    private Map<Integer, Personnel> listePersonnel = new HashMap<>();
    
    public void ajouterPersonnel(Personnel personnel){
        listePersonnel.put(personnel.getNumeroPersonnel(), personnel);
    }
}