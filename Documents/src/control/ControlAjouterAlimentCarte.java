package control;

import model.Carte;
import model.Hamburger;
import model.Accompagnement;
import model.Boisson;

public class ControlAjouterAlimentCarte {
	private final Carte carte;
	
	public ControlAjouterAlimentCarte() {
		 carte = Carte.getInstance();
	}
	
	public void ajouterAliment(TypeAliment aliment, String nom) {
		
		switch(aliment)
		{
			case HAMBURGER :
				Hamburger hamburger = new Hamburger(nom);
				carte.ajouterHamburger(hamburger);
				break;
	
			case ACCOMPAGNEMENT :
				Accompagnement accompagnement = new Accompagnement(nom);
				carte.ajouterAccompagnement(accompagnement);
				break;
			
			case BOISSON :
				Boisson boisson = new Boisson(nom);
				carte.ajouterBoisson(boisson);
				
			default:
				System.out.println("type aliment non reconnu");
				break;
		}
	}

	public char[] visualiserCarte() {
		// TODO Auto-generated method stub
		return null;
	}
}
