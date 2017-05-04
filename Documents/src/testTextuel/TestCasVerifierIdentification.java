package testTextuel;

import control.ControlCreerProfil;
import control.ControlSIdentifier;
import control.ControlVerifierIdentification;
import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;

public class TestCasVerifierIdentification {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, "Martin",
				"Victor", "gmv");
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);

		int numGerant = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.GERANT, "Victor.Martin", "gmv");
		int numClient = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Hector.Dupond", "cdh");

		// Initialisation controleur du cas
		ControlVerifierIdentification controlVerifierIdentification = new ControlVerifierIdentification(
				bdClient, bdPersonnel);
		// Initialisation vue du cas

		// Lancement du cas
		boolean identificationGerantOK = controlVerifierIdentification
				.verifierIdentification(ProfilUtilisateur.GERANT, numGerant);
		boolean identificationClientOK = controlVerifierIdentification
				.verifierIdentification(ProfilUtilisateur.CLIENT, numClient);

		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println("Gerant identifier : " + identificationGerantOK);
		System.out.println("Client identifier : " + identificationClientOK);
		
		// Resultat du test
		// VERIFICATION
		// Gerant identifier : true
		// Client identifier : true

	}
}
