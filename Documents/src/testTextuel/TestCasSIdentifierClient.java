package testTextuel;

import control.ControlCreerProfil;
import control.ControlSIdentifier;
import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;
import vue.BoundarySIdentifierClient;

public class TestCasSIdentifierClient {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");

		// Initialisation controleur du cas & cas Inclus/etendu
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);
		// Initialisation vue du cas
		BoundarySIdentifierClient boundarySIdentifierClient = new BoundarySIdentifierClient(
				controlSIdentifier);
		// Lancement du cas
		boundarySIdentifierClient.identificationClient();

		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println(controlSIdentifier.visualiserBDUtilisateur());

		// Resultat du test
		// Veuilliez entrer votre login
		// Hector.Dupond
		// Veuilliez entrer votre mot de passe
		// cdh
		// VERIFICATION
		// BDPersonnel [listePersonnel={}]
		// BDClient [listeClient={0=Client [nom=Dupond, prenom=Hector,
		// login=Hector.Dupond, mdp=cdh, connecte=true, carte =null]}]
	}
}
