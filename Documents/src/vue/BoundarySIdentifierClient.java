package vue;

import model.ProfilUtilisateur;
import control.ControlSIdentifier;

public class BoundarySIdentifierClient {
	
	private ControlSIdentifier controlSIdentifier;
	
	private Clavier clavier = new Clavier();
	
	public BoundarySIdentifierClient(ControlSIdentifier controlSIdentifier) {
		this.controlSIdentifier = controlSIdentifier;
	}

	public void identificationClient() {
		String login, mdp;
		System.out.println("Veuillez entrer votre login");
		login = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre mot de passe");
		mdp = clavier.entreeClavierString();
		int numClient = controlSIdentifier.sIdentifier(ProfilUtilisateur.CLIENT, login, mdp);
		if(numClient == -1){
		    System.out.println("Erreur - connexion");
		}else{
		    System.out.println("Connexion réussie");
		}
	}

}
