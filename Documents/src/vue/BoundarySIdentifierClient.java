package vue;

import model.ProfilUtilisateur;
import control.ControlSIdentifier;

public class BoundarySIdentifierClient {
	
	private ControlSIdentifier controlSIdentifier;
	
	private Clavier clavier = new Clavier();
	
	public BoundarySIdentifierClient(ControlSIdentifier controlSIdentifier) {
		this.controlSIdentifier = controlSIdentifier;
	}

	public int identificationClient() {
		String login, mdp;
		System.out.println("Veuillez entrer votre login");
		login = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre mot de passe");
		mdp = clavier.entreeClavierString();
		return controlSIdentifier.sIdentifier(ProfilUtilisateur.CLIENT, login, mdp);
	}

}
