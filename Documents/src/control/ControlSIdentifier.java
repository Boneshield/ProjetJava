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

	public String visualiserBDUtilisateur() {
		return (bdPersonnel + "\n" + bdClient);
	}

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
