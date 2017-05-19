package testGraphique;

import control.ControlAjouterAlimentCarte;
import control.ControlCommander;
import control.ControlCreerProfil;
import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlSIdentifier;
import control.ControlVerifierCoordonneesBancaires;
import control.ControlVerifierIdentification;
import control.TypeAliment;
import model.BDClient;
import model.BDCommande;
import model.BDPersonnel;
import model.Carte;
import model.ProfilUtilisateur;
import vueGraphique.ClientFrame;

public class TestGraphiqueEcranClient {

	public static void main(String[] args) {

		//Initialisation des objets metier
		BDCommande bdCommande = model.BDCommande.getInstance();
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();
		Carte carte = Carte.getInstance();
		
		// Initialisation pour test commander
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(bdClient, bdPersonnel);
		ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte();
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(bdClient, bdPersonnel);

		// Scenario pour le test
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.HAMBURGER,
				"baconBurger");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.HAMBURGER,
				"chickenBurger");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.HAMBURGER,
				"cheeseBurger");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.ACCOMPAGNEMENT,
				"frites");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.ACCOMPAGNEMENT,
				"pommesChips");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.BOISSON, "coca");
		controlAjouterAlimentCarte.ajouterAliment(TypeAliment.BOISSON,
				"orangeBulles");

		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");
		int numClient = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Hector.Dupond", "cdh");

		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Durand",
				"Jacques", "cdj");
		int numClient2 = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Jacques.Durand", "cdj");

		// cas commander
		ControlVerifierIdentification controlVerificationIdentification = new ControlVerifierIdentification(bdClient, bdPersonnel);
		ControlVerifierCoordonneesBancaires controlVerificationCoordonneesBancaire = new ControlVerifierCoordonneesBancaires();
		ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires = new ControlEnregistrerCoordonneesBancaires(bdClient);
		ControlCommander controlCommande = new ControlCommander(carte, bdClient, bdCommande);
		
		new ClientFrame(numClient, controlCommande,
				controlVerificationIdentification,
				controlEnregistrerCoordonneesBancaires,
				controlVerificationCoordonneesBancaire);
		new ClientFrame(numClient2, controlCommande,
				controlVerificationIdentification,
				controlEnregistrerCoordonneesBancaires,
				controlVerificationCoordonneesBancaire);
	}
}
