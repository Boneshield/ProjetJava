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

	public String visualiserBDUtilisateur() {
		return (bdPersonnel + "\n" + bdClient);
	}

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
