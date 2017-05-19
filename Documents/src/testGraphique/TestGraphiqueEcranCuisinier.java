package testGraphique;

import control.ControlAjouterAlimentCarte;
import control.ControlArchiver;
import control.ControlCreerProfil;
import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlSIdentifier;
import control.ControlCommander;
import control.ControlVerifierCoordonneesBancaires;
import control.ControlVerifierIdentification;
import control.ControlVisualiserCommandeJour;
import control.TypeAliment;
import model.BDClient;
import model.BDCommande;
import model.BDPersonnel;
import model.Carte;
import model.ProfilUtilisateur;
import vueGraphique.ClientFrame;
import vueGraphique.CuisinierFrame;
import vue.BoundaryArchiver;

public class TestGraphiqueEcranCuisinier {
	public static void main(String[] args) {
		// Initialisation des objets metier
		BDCommande bdCommande = BDCommande.getInstance();
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();
		Carte carte = Carte.getInstance();

		// Initialisation pour test commander
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte();
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);

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

		controlCreerProfil.creerProfil(ProfilUtilisateur.PERSONNEL, "Melon",
				"Stephane", "pms");
		int numCuisinier = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.PERSONNEL, "Stephane.Melon", "pms");

		controlCreerProfil.creerProfil(ProfilUtilisateur.PERSONNEL, "Bernard",
				"Christophe", "pbc");
		int numCuisinier2 = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.PERSONNEL, "Christophe.Bernard", "pbc");

		controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, "Martin",
				"Victor", "gmv");
		int numGerant = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.GERANT, "Victor.Martin", "gmv");

		// Cas commander
		ControlVerifierIdentification controlVerifierIdentification = new ControlVerifierIdentification(
				bdClient, bdPersonnel);
		ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires = new ControlVerifierCoordonneesBancaires();
		ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires = new ControlEnregistrerCoordonneesBancaires(
				bdClient);
		ControlCommander controlCommande = new ControlCommander(carte,
				bdClient, bdCommande);
		new ClientFrame(numClient, controlCommande,
				controlVerifierIdentification,
				controlEnregistrerCoordonneesBancaires,
				controlVerifierCoordonneesBancaires);
		new ClientFrame(numClient2, controlCommande,
				controlVerifierIdentification,
				controlEnregistrerCoordonneesBancaires,
				controlVerifierCoordonneesBancaires);

		// Cas visualisation commande du jour
		ControlVisualiserCommandeJour controlVisualiserCommandeJour = new ControlVisualiserCommandeJour();
		new CuisinierFrame(numCuisinier, controlVisualiserCommandeJour);
		new CuisinierFrame(numCuisinier2, controlVisualiserCommandeJour);

		// Cas archiver
		ControlArchiver controlArchiver = new ControlArchiver(bdCommande);
		BoundaryArchiver boundaryArchiver = new BoundaryArchiver(
				controlVerifierIdentification, controlArchiver);
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boundaryArchiver.archiver(numGerant);
	}

}
