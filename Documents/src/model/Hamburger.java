package model;

public class Hamburger extends Aliment {
	
	public Hamburger(String nom) {
		super(nom);
	}
	
	public Object clone(){
	    Hamburger aClone = new Hamburger(this.getNom());
	    return aClone;
	}
}
