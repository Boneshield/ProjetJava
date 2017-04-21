package testTextuel;

import control.ControlCreerProfil;
import model.BDClient;
import model.BDPersonnel;
import vue.BoundaryCreerProfilGerant;

public class TestCasCreerProfilGerant {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();

		// Initialisation controleur du cas
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		// Initialisation vue du cas
		BoundaryCreerProfilGerant boundaryCreerProfilGerant = new BoundaryCreerProfilGerant(
				controlCreerProfil);

		// Lancement du cas
		boundaryCreerProfilGerant.creerProfilGerant();

		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println(controlCreerProfil.visualiserBDUtilisateur());
		
		// Resultat du test
		// Veuillez entrer votre nom
		// Victor
		// Veuillez entrer votre prenom
		// Martin
		// Veuillez entrer votre mot de passe
		// gmv
		// VERIFICATION
		// BDPersonnel [listePersonnel={0=Profil [nom=Victor, prenom=Martin,
		// login=Martin.Victor, mdp=gmv, connecte=false]Personnel
		// [gerant=true]}]
		// BDClient [listeClient={}]
	}
}
