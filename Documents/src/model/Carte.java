package model;

import java.util.List;
import java.util.ArrayList;

public final class Carte {
	private static Carte instance = null; 
	private List<Hamburger> listeHamburger = new ArrayList<>();
	private List<Accompagnement> listeAccompagnement = new ArrayList<>();
	private List<Boisson> listeBoisson = new ArrayList<>();
	
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
	
	
	public void ajouterHamburger(Hamburger hamburger) {
		listeHamburger.add(hamburger);
	}
	
	public void ajouterAccompagnement(Accompagnement accompagnement) {
		listeAccompagnement.add(accompagnement);
	}
	
	public void ajouterBoisson(Boisson boisson) {
		listeBoisson.add(boisson);
	}
	
}
