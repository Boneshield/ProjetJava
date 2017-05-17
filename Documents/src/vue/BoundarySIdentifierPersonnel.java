package vue;

import model.ProfilUtilisateur;
import control.ControlSIdentifier;

public class BoundarySIdentifierPersonnel {

	private ControlSIdentifier controlSIdentifier;
	
	private Clavier clavier = new Clavier();
	
	public BoundarySIdentifierPersonnel(ControlSIdentifier controlSIdentifier) {
		this.controlSIdentifier = controlSIdentifier;
	}

	public void identificationPersonnel() {
		String login, mdp;
		System.out.println("Veuillez entrer votre login");
		login = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre mot de passe");
		mdp = clavier.entreeClavierString();
		int numPersonnel = controlSIdentifier.sIdentifier(ProfilUtilisateur.PERSONNEL, login, mdp);
		if(numPersonnel == -1){
		    System.out.println("Erreur - connexion");
		}else{
		    System.out.println("Connexion réussie");
		}
	}
}
