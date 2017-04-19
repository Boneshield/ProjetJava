package model;

public class BDPersonnel{
    private Map<Integer, Personnel> listePersonnel = new Hashmap<>();
    
    public void ajouterPersonnel(Personnel personnel){
        hashmap.put(personnel.getNumeroPersonnel(), personnel);
    }
}