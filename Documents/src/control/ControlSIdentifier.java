package control;

import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;

public class ControlSIdentifier {
	private BDClient bdClient;
	private BDPersonnel bdPersonnel;
	
	public ControlSIdentifier(BDClient bdClient, BDPersonnel bdPersonnel) {
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
	* Connecte un utilisateur en fonction de son profil(client, personnel)
	* @param ProfilUtilisateur profil, String login, String mdp
	* @return int numéro client ou personnel
	*/
	public int sIdentifier(ProfilUtilisateur profil, String login,
			String mdp) {
		if(profil == ProfilUtilisateur.CLIENT)
		{
			return bdClient.connexionClient(login,mdp);
		}
		else
		{
			return bdPersonnel.connexionPersonnel(login,mdp);
		}
	}

}
