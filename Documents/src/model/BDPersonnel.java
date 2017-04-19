package model;

public class BDPersonnel{
    private Map<int, Personnel> hashmap = new Hashmap<>();
    
    public void ajouterPersonnel(Personnel personnel){
        hashmap.put(personnel.getNumeroPersonnel(), personnel);
    }
}