package vue;

import control.ControlCreerProfil;
import model.ProfilUtilisateur;

public class BoundaryCreerProfilClient {
	private ControlCreerProfil controlCreerProfil;
	
	private Clavier clavier = new Clavier();
	
	public BoundaryCreerProfilClient(ControlCreerProfil controlCreerProfil) {
		this.controlCreerProfil = controlCreerProfil;
	}

	
	public void creerProfilClient() {
		String nom, prenom, mdp;
		System.out.println("Veuillez entrer votre nom : ");
		nom = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre prenom : ");
		prenom = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre mot de passe : ");
		mdp = clavier.entreeClavierString();
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, nom, prenom, mdp);
	}

}
