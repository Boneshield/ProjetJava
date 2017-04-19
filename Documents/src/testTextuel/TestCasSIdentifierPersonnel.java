package testTextuel;

import control.ControlCreerProfil;
import control.ControlSIdentifier;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.ProfilUtilisateur;
import vueTextuelle.BoundarySIdentifierPersonnel;

public class TestCasSIdentifierPersonnel {

	public static void main(String[] args) {
		// Initialisation des objets metier
		BDClient bdClient = new BDClient();
		BDPersonnel bdPersonnel = new BDPersonnel();

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil(
				bdClient, bdPersonnel);
		controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, "Martin",
				"Victor", "gmv");

		// Initialisation controleur du cas & cas Inclus/etendu
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier(
				bdClient, bdPersonnel);
		// Initialisation vue du cas
		BoundarySIdentifierPersonnel boundarySIdentifierPersonnel = new BoundarySIdentifierPersonnel(
				controlSIdentifier);
		// Lancement du cas
		boundarySIdentifierPersonnel.identificationPersonnel();

		// Verification de la bonne réalisation du cas
		System.out.println("VERIFICATION");
		System.out.println(controlSIdentifier.visualiserBDUtilisateur());

		// Resultat du test
		// Veuilliez entrer votre login
		// Victor.Martin
		// Veuilliez entrer votre mot de passe
		// gmv
		// VERIFICATION
		// BDPersonnel [listePersonnel={0=Personnel [nom=Martin, prenom=Victor,
		// login=Victor.Martin, mdp=gmv, gerant=true, connecte=true]}]
		// BDClient [listeClient={}]
	}
}
