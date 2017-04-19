package testTextuel;

import control.ControlAjouterAlimentCarte;
import control.ControlCommander;
import control.ControlCreerProfil;
import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlSIdentifier;
import control.ControlVerifierCoordonneesBancaires;
import control.ControlVerifierIdentification;
import restaurationRapide.AlimentMenu;
import restaurationRapide.BDClient;
import restaurationRapide.BDCommande;
import restaurationRapide.BDPersonnel;
import restaurationRapide.Carte;
import restaurationRapide.ProfilUtilisateur;
import vueTextuelle.BoundaryCommander;
import vueTextuelle.BoundaryEnregistrerCoordonneesBancaires;

public class TestCasCommander {

	public static void main(String[] args) {

		// Initialisation des objets metier
		BDCommande bdCommande = new BDCommande();
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();
		Carte carte = new Carte();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte(
				carte);
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);

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

		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond",
				"Hector", "cdh");
		int numClient = controlSIdentifier.sIdentifier(
				ProfilUtilisateur.CLIENT, "Hector.Dupond", "cdh");

		// Initialisation controleur du cas & cas Inclus/etendu
		ControlVerifierIdentification controlVerifierIdentification = new ControlVerifierIdentification(
				bdClient, bdPersonnel);
		ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaire = new ControlVerifierCoordonneesBancaires();
		ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires = new ControlEnregistrerCoordonneesBancaires(
				bdClient);

		// Initialisation vue du cas & cas Inclus/etendu
		BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires = new BoundaryEnregistrerCoordonneesBancaires(
				controlVerifierCoordonneesBancaire,
				controlEnregistrerCoordonneesBancaires);
		BoundaryCommander boundaryCommander = new BoundaryCommander(
				new ControlCommander(carte, bdClient, bdCommande),
				controlVerifierIdentification,
				boundaryEnregistrerCoordonneesBancaires);

		// Lancement du cas
		System.out.println("\nEcran client");
		boundaryCommander.commander(numClient);

		// Verification de la bonne realisation du cas
		// Resultat du test
		// Ecran client
		// Veuillez selectionner le numero de votre hamburger
		// Liste des hamburgers :
		// 1 : baconBurger
		// 2 : chickenBurger
		// 3 : cheeseBurger
		//
		// 1
		// Veuillez selectionner le numero de votre accompagnement
		// Liste des accompagnement :
		// 1 : frites
		// 2 : pommesChips
		//
		// 2
		// Veuillez selectionner le numero de votre boisson
		// Liste des boissons :
		// 1 : coca
		// 2 : orangeBulles
		//
		// 2
		// Veuillez saisir votre numero de carte bancaire
		// 123154123
		// Veuillez saisir la date d'expiration de votre carte bancaire (MMAA)
		// 1018
		// Votre numero de commande est le : 1
	}

}
