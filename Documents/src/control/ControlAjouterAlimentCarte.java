package control;

import model.Carte;
import model.Hamburger;
import model.Accompagnement;
import model.Boisson;


/**
* Résumé du rôle de la méthode.
* Commentaires détaillés sur le role de la methode
* @param val la valeur a traiter
* @return la valeur calculée
*/
public class ControlAjouterAlimentCarte {
	
	/**
	* Ajoute un aliment à la carte en fonction du type d'aliment passé en paramètre
	* @param TypeAliment aliment, String nom
	*/
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
				break;
				
			default:
				System.out.println("type aliment non reconnu");
				break;
		}
	}

	
	public String visualiserCarte() {
		return Carte.getInstance().toString();
	}
}
