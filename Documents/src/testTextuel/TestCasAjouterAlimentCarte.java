package testTextuel;

import control.ControlAjouterAlimentCarte;
import control.ControlCreerProfil;
import control.ControlSIdentifier;
import control.ControlVerifierIdentification;
import model.BDClient;
import model.BDPersonnel;
import model.Carte;
import model.ProfilUtilisateur;
import vue.BoundaryAjouterAlimentCarte;

public class TestCasAjouterAlimentCarte {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();
		Carte carte = Carte.getInstance();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, "Martin",
				"Victor", "gmv");
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);

		int numGerant = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.GERANT, "Victor.Martin", "gmv");

		ControlVerifierIdentification controlVerifierIdentification = new ControlVerifierIdentification(
				bdClient, bdPersonnel);

		// Initialisation controleur du cas
		ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte();
		// Initialisation vue du cas
		BoundaryAjouterAlimentCarte boundaryAjouterAlimentCarte = new BoundaryAjouterAlimentCarte(
				controlVerifierIdentification, controlAjouterAlimentCarte);

		// Lancement du cas
		boundaryAjouterAlimentCarte.ajouterAlimentCarte(numGerant);

		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println(controlAjouterAlimentCarte.visualiserCarte());

		// Resultat du test
		// 1. ajouter un hamburger
		// 2. ajouter un accompagnement
		// 3. ajouter une boisson
		// 2
		// Veuillez entrer le nom de l'aliment :
		// frites
		// VERIFICATION
		// Carte [listeHamburger=[], listeBoisson=[],
		// listeAccompagnement=[Aliment [nom=frites]]]
		
	}
}
