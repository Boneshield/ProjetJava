package testTextuel;

import control.ControlAjouterAlimentCarte;
import control.ControlCommander;
import control.ControlCreerProfil;
import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlSIdentifier;
import control.ControlVerifierCoordonneesBancaires;
import control.ControlVerifierIdentification;
import control.ControlVisualiserCommandeJour;
import restaurationRapide.AlimentMenu;
import restaurationRapide.BDClient;
import restaurationRapide.BDCommande;
import restaurationRapide.BDPersonnel;
import restaurationRapide.Carte;
import restaurationRapide.ProfilUtilisateur;
import vueTextuelle.BoundaryCommander;
import vueTextuelle.BoundaryEnregistrerCoordonneesBancaires;
import vueTextuelle.BoundaryVisualiserCommandeJour;

public class TestCasVisualisationCommandeJour {

	public static void main(String[] args) {

		// Initialisation des objets metier
		BDCommande bdCommande = new BDCommande.getInstance();
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();
		Carte carte = Carte.getInstance();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");
		int numClient = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Hector.Dupond", "cdh");

		ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte(
				carte);
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.HAMBURGER,
				"baconBurger");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.HAMBURGER,
				"chickenBurger");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.HAMBURGER,
				"cheeseBurger");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.ACCOMPAGNEMENT,
				"frites");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.ACCOMPAGNEMENT,
				"pommesChips");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.BOISSON, "coca");
		controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.BOISSON,
				"orangeBulles");

		ControlVerifierIdentification controlVerifierIdentification = new ControlVerifierIdentification(
				bdClient, bdPersonnel);
		ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaire = new ControlVerifierCoordonneesBancaires();
		ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires = new ControlEnregistrerCoordonneesBancaires(
				bdClient);
		BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires = new BoundaryEnregistrerCoordonneesBancaires(
				controlVerifierCoordonneesBancaire,
				controlEnregistrerCoordonneesBancaires);
		BoundaryCommander boundaryCommander = new BoundaryCommander(
				new ControlCommander(carte, bdClient, bdCommande),
				controlVerifierIdentification,
				boundaryEnregistrerCoordonneesBancaires);

		// Initialisation controleur du cas
		ControlVisualiserCommandeJour controlVisualiserCommandeJour = new ControlVisualiserCommandeJour(
				bdCommande);

		// Initialisation vue du cas
		new BoundaryVisualiserCommandeJour(controlVisualiserCommandeJour);

		// Lancement du cas
		System.out.println("\nEcran client");
		boundaryCommander.commander(numClient);

		// Verification de la bonne realisation du cas
		// Ecran client
		// Veuillez selectionner le numero de votre hamburger
		// Liste des hamburgers :
		// 1 : baconBurger
		// 2 : chickenBurger
		// 3 : cheeseBurger
		//
		// 2
		// Veuillez selectionner le numero de votre accompagnement
		// Liste des accompagnement :
		// 1 : frites
		// 2 : pommesChips
		//
		// 1
		// Veuillez selectionner le numero de votre boisson
		// Liste des boissons :
		// 1 : coca
		// 2 : orangeBulles
		//
		// 2
		// Veuillez saisir votre numero de carte bancaire
		// 123456125
		// Veuillez saisir la date d'expiration de votre carte bancaire (MMAA)
		// 1118
		//
		// Ecran cuisinier
		// Commande no 1 : chickenBurger, frites, orangeBulles
		//
		// Ecran client
		// Votre numero de commande est le : 1
	}
}