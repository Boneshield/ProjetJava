package control;

import model.BDClient;
import model.BDPersonnel;
import model.Client;
import model.Personnel;
import model.ProfilUtilisateur;

public class ControlCreerProfil {
	
	private BDClient bdClient;
	private BDPersonnel bdPersonnel;

	public ControlCreerProfil(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}

	/**
	* Affiche les valeurs des BD client et personnel
	* @return String
	*/
	public String visualiserBDUtilisateur() {
		return (bdPersonnel + "\n" + bdClient);
	}

	/**
	* Permet de créer un profil utilisateur avec le type, le nom, le prenom et le mdp
	* @param ProfilUtilisateur profil, String nom, String prenom, String mdp
	*/
	public void creerProfil(ProfilUtilisateur profil, String nom,
		String prenom, String mdp) {
		
		switch(profil)
		{
			case CLIENT :
				Client client = new Client(nom, prenom, mdp);
				bdClient.ajouterClient(client);
				break;
			case PERSONNEL :
				Personnel personnel = new Personnel(nom, prenom, mdp);
				bdPersonnel.ajouterPersonnel(personnel);
				break;
			case GERANT :
				Personnel gerant = new Personnel(nom, prenom, mdp);
				bdPersonnel.ajouterPersonnel(gerant);
				gerant.definirGerant();
				break;
			default:
				System.out.println("Type utilisateur inconnu !");
				break;
		}
	}

}
