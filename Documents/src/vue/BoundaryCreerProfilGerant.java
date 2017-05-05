package vue;

import model.ProfilUtilisateur;
import control.ControlCreerProfil;

public class BoundaryCreerProfilGerant {
	private ControlCreerProfil controlCreerProfil;
	
	private Clavier clavier = new Clavier();
	
	public BoundaryCreerProfilGerant(ControlCreerProfil controlCreerProfil) {
		this.controlCreerProfil = controlCreerProfil;
	}

	
	public void creerProfilGerant() {
		String nom, prenom, mdp, profilStr;
		System.out.println("Veuillez entrer votre nom : ");
		nom = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre prenom : ");
		prenom = clavier.entreeClavierString();
		System.out.println("Veuillez entrer votre mot de passe : ");
		mdp = clavier.entreeClavierString();
		System.out.println("Quel profil voulez vous creer ?");
		profilStr = clavier.entreeClavierString();
		profilStr= profilStr.toLowerCase();

		switch(profilStr)
		{
			case "client":
				controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, nom, prenom, mdp);
				break;
			case "personnel":
				controlCreerProfil.creerProfil(ProfilUtilisateur.PERSONNEL, nom, prenom, mdp);
				break;
			case "gerant":
				controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, nom, prenom, mdp);
				break;
			default:
				System.out.println("Type profil non reconnu !");
				break;
		}
		
	}

}
