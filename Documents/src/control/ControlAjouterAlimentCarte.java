package control;

import model.Carte;
import model.Hamburger;
import model.Accompagnement;
import model.Boisson;

public class ControlAjouterAlimentCarte {
	
	public void ajouterAliment(TypeAliment aliment, String nom) {
		
		switch(aliment)
		{
			case HAMBURGER :
				Hamburger hamburger = new Hamburger(nom);
				Carte.ajouterHamburger(hamburger);
				break;
	
			case ACCOMPAGNEMENT :
				Accompagnement accompagnement = new Accompagnement(nom);
				Carte.ajouterAccompagnement(accompagnement);
				break;
			
			case BOISSON :
				Boisson boisson = new Boisson(nom);
				Carte.ajouterBoisson(boisson);
				
			default:
				System.out.println("type aliment non reconnu");
				break;
		}
	}

	public char[] visualiserCarte() {
		return(Carte.listeHamburger + "," + Carte.listeBoisson + "," + Carte.listeAccompagnement);
	}
}
