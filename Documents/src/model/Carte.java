
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
	
	/**
	* Crée le singleton de la carte
	*/
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
	
	/**
	* Ajoute un hamburger à la map listeHamburger
	* @param Hamburger hamburger
	*/
	public static void ajouterHamburger(Hamburger hamburger) {
		listeHamburger.add(hamburger);
	}
	
	/**
	* Ajoute un accompagnement à la map listeAccompagnement
	* @param Accompagnement
	*/
	public static void ajouterAccompagnement(Accompagnement accompagnement) {
		listeAccompagnement.add(accompagnement);
	}
	
	/**
	* Ajoute une boisson à la map listeBoisson
	* @param Boisson boisson
	*/
	public static void ajouterBoisson(Boisson boisson) {
		listeBoisson.add(boisson);
	}
	
	public String toString() {
		return "Carte [listeHamburger=" + listeHamburger + ", listeAccompagnement=" + listeAccompagnement
				+ ", listeBoisson=" + listeBoisson + "]";
	}
	
	public List<Hamburger> getListeHamburger(){
	    List<Hamburger> listeReturn = new ArrayList<>();
	    for(Hamburger hamburger : listeHamburger){
	        listeReturn.add((Hamburger) hamburger.clone());
	    }
	    return listeReturn;
	}
	
	public List<Accompagnement> getListeAccompagnement(){
	    List<Accompagnement> listeReturn = new ArrayList<>();
	    for(Accompagnement accompagnement : listeAccompagnement){
	        listeReturn.add((Accompagnement) accompagnement.clone());
	    }
	    return listeReturn;
	}
	
	public List<Boisson> getListeBoisson(){
	    List<Boisson> listeReturn = new ArrayList<>();
	    for(Boisson boisson : listeBoisson){
	        listeReturn.add((Boisson) boisson.clone());
	    }
	    return listeReturn;
	}
	
	/**
	* Retourne un hamburger depuis la map listeHamburger à l'aide d'un numéro
	* @param int numHamburger
	* @return Hamburger
	*/
	public Hamburger choixHamburger(int numHamburger){
	    return listeHamburger.get(numHamburger);
	}
	
	/**
	* Retourne un accompagnement depuis la map listeAccompgnement à l'aide de son numéro
	* @param int numAccompagnement
	* @return Accompagnement
	*/
	public Accompagnement choixAccompagnement(int numAccompagnement){
	    return listeAccompagnement.get(numAccompagnement);
	}
	
	/**
	* Retourne une boisson depuis la map listeBoisson à l'aide de son numéro
	* @param int numBoisson
	* @return Boisson
	*/
	public Boisson choixBoisson(int numBoisson){
	    return listeBoisson.get(numBoisson);
	}
}
