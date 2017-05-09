package control;

import model.BDClient;
import model.BDPersonnel;
import model.Client;
import model.Personnel;
import model.ProfilUtilisateur;

public class ControlVerifierIdentification {
    BDClient bdClient;
    BDPersonnel bdPersonnel;
    
	public ControlVerifierIdentification(BDClient bdClient,
			BDPersonnel bdPersonnel) {
		this.bdClient= bdClient;
		this.bdPersonnel= bdPersonnel;
	}

	public boolean verifierIdentification(ProfilUtilisateur profil,
			int numProfil) {
		switch(profil){
		    case CLIENT:
		        Client client;
		        client= bdClient.getClient(numProfil);
		        return client!= null && client.isConnected();
		        
		    case PERSONNEL:
		        Personnel personnel;
		        personnel = bdPersonnel.getPersonnel(numProfil);
		        return personnel!= null && personnel.isConnected();
		        
		    case GERANT:
		        Personnel gerant;
		        gerant = bdPersonnel.getPersonnel(numProfil);
		        return gerant!= null && gerant.isConnected() && gerant.isGerant();
		}
		return false;
	}

}
