package control;

import model.BDClient;
import model.Client;

public class ControlEnregistrerCoordonneesBancaires {
    BDClient bdClient;

	public ControlEnregistrerCoordonneesBancaires(BDClient bdClient) {
		this.bdClient = bdClient;
	}

	/**
	* Ajoute les informations concernant la carte bancaire d'un client dans la BD client
	* @param int numClient, int numCarte, int dateCarte
	*/
    public void enregistrerCoordonneesBancaires(int numClient, int numCarte, int dateCarte){
        Client client = bdClient.getClient(numClient);
        client.enregistrerCoordonneesBancaires(numCarte, dateCarte);
    }
    
    /**
	* Affiche les valeurs des BD client
	* @return String
	*/
	public String visualiserBDClient() {
		return (bdClient+"");
	}

}
