package control;

import model.BDClient;

public class ControlEnregistrerCoordonneesBancaires {
    BDClient bdClient;

	public ControlEnregistrerCoordonneesBancaires(BDClient bdClient) {
		this.bdClient = bdClient;
	}

    public void enregistrerCoordonneesBancaires(int numClient, int numCarte, int dateCarte){
        Client client = bdClient.getClient(numClient);
        client.enregistrerCoordonneesBancaires(numCarte, dateCarte);
    }
    
	public String visualiserBDClient() {
		return bdClient;
	}

}
