package control;

import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;

public class ControlDeconnexion{
    private BDClient bdClient;
	private BDPersonnel bdPersonnel;
	
	public ControlDeconnexion(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}
	
	public void seDeconnecter(ProfilUtilisateur profil, int numProfil){
	    if(profil == ProfilUtilisateur.CLIENT)
		{
			bdClient.deconnexionClient(numProfil);
		}
		else
		{
			bdPersonnel.deconnexionPersonnel(numProfil);
		}
	}
}