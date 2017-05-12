package model;

import java.util.List;
import java.util.ArrayList;

public final class Carte {
	private static Carte instance = null;
	private static List<Hamburger> listeHamburger = new ArrayList<>();
	private static List<Accompagnement> listeAccompagnement = new ArrayList<>();
	private static List<Boisson> listeBoisson = new ArrayList<>();
	
	private Carte() {
		super();
	}
	
	public final static Carte getInstance() {
		if(Carte.instance == null) {
			synchronized(Carte.class) {
				if(Carte.instance == null) {
					Carte.instance = new Carte();
				}
			}
		}
		return Carte.instance;
	}
	
	
	public static void ajouterHamburger(Hamburger hamburger) {
		listeHamburger.add(hamburger);
	}
	
	public static void ajouterAccompagnement(Accompagnement accompagnement) {
		listeAccompagnement.add(accompagnement);
	}
	
	public static void ajouterBoisson(Boisson boisson) {
		listeBoisson.add(boisson);
	}
	
	public String toString() {
		return "Carte [listeHamburger=" + listeHamburger + ", listeAccompagnement=" + listeAccompagnement
				+ ", listeBoisson=" + listeBoisson + "]";
	}
	
	public List<Hamburger> getListeHamburger(){
	    List<Hamburger> listeReturn = new ArrayList<Hamburger>();
	    for(Hamburger hamburger : this.listeHamburger){
	        listeReturn.add((Hamburger) hamburger.clone());
	    }
	    return listeReturn;
	}
	
	public List<Accompagnement> getListeAccompagnement(){
	    List<Accompagnement> listeReturn = new ArrayList<Accompagnement>();
	    for(Accompagnement accompagnement : this.listeAccompagnement){
	        listeReturn.add((Accompagnement) accompagnement.clone());
	    }
	    return listeReturn;
	}
	
	public List<Boisson> getListeBoisson(){
	    List<Boisson> listeReturn = new ArrayList<Boisson>();
	    for(Boisson boisson : this.listeBoisson){
	        listeReturn.add((Boisson) boisson.clone());
	    }
	    return listeReturn;
	}
}
