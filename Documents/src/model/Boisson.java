package model;

public class Boisson extends Aliment{
	
	public Boisson(String nom) {
		super(nom);
	}
	
	public Object clone(){
	    Boisson aClone = new Boisson(this.getNom());
	    return aClone;
	}
}
