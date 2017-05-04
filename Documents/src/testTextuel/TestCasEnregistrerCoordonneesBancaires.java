package testTextuel;

import control.ControlCreerProfil;
import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlSIdentifier;
import control.ControlVerifierCoordonneesBancaires;
import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;
import vue.BoundaryEnregistrerCoordonneesBancaires;

public class TestCasEnregistrerCoordonneesBancaires {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);
		int numClient = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Hector.Dupond", "cdh");

		// Initialisation controleur du cas
		ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires = new ControlEnregistrerCoordonneesBancaires(bdClient);
		ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires = new ControlVerifierCoordonneesBancaires();
		// Initialisation vue du cas

		BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires = new BoundaryEnregistrerCoordonneesBancaires(controlVerifierCoordonneesBancaires, controlEnregistrerCoordonneesBancaires);
		// Lancement du cas
		boundaryEnregistrerCoordonneesBancaires.renseignerInfoBancaire(numClient);
		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println(controlEnregistrerCoordonneesBancaires.visualiserBDClient());
		

		// Resultat du test
		// VERIFICATION
		// Veuillez saisir votre numero de carte bancaire
		// 12315415
		// Veuillez saisir la date d'expiration de votre carte bancaire (MMAA)
		// 1207
		// VERIFICATION
		// BDClient [listeClient={0=Client [nom=Dupond, prenom=Hector, login=Hector.Dupond, mdp=cdh, connecte=true, carte =CarteBancaire [numeroCarte=12315415, dateCarte=1207]]}]

	}
}
