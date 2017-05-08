package control;

import model.BDClient;
import model.BDPersonnel;
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
		        break;
		    case PERSONNEL:
		        Personnel personnel;
		        personnel = bdPersonnel.getPersonnel(numProfil);
		        return personnel!= null && personnel.isConnected();
		        break;
		    case GERANT:
		        Personnel gerant;
		        gerant = bdPersonnel.getPersonnel(numProfil);
		        return gerant!= null && gerant.isConnected() && gerant.isGerant();
		        break;
		}
		return false;
	}

}
