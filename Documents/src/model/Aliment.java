package model;

public abstract class Aliment {
	private String nom;
	
	
	public Aliment(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		return ("[" + this.nom + "]");
	}
}
