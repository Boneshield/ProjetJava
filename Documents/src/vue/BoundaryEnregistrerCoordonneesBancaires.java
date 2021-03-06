package vue;

import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlVerifierCoordonneesBancaires;

public class BoundaryEnregistrerCoordonneesBancaires {
    private Clavier clavier = new Clavier();
    private ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires;
    private ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires;
    
	public BoundaryEnregistrerCoordonneesBancaires(
			ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires,
			ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires) {
		this.controlEnregistrerCoordonneesBancaires = controlEnregistrerCoordonneesBancaires;
		this.controlVerifierCoordonneesBancaires = controlVerifierCoordonneesBancaires;
	}
	

	public boolean renseignerInfoBancaire(int numClient) {
		int numCarte, dateCarte;
		System.out.println("Veuillez saisir votre numéro de carte bancaire");
		numCarte = clavier.entreeClavierInt();
		System.out.println("Veuillez saisir la date d'expiration de votre carte bancaire (MMAA)");
		dateCarte = clavier.entreeClavierInt();
		boolean carteValide = controlVerifierCoordonneesBancaires.verifierCoordonneesBancaires(numCarte, dateCarte);
		if (carteValide){
		    controlEnregistrerCoordonneesBancaires.enregistrerCoordonneesBancaires(numClient, numCarte, dateCarte);
		}
		return carteValide;
	}

}
