package model;

public class Accompagnement extends Aliment {
	
	public Accompagnement(String nom) {
		super(nom);
	}
	
	public Object clone(){
	    Accompagnement aClone = new Accompagnement(this.getNom());
	    return aClone;
	}
}
