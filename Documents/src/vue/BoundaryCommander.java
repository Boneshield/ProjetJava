package vue;

import java.util.List;

import control.ControlCommander;
import control.ControlVerifierIdentification;
import model.ProfilUtilisateur;

public class BoundaryCommander {
    private ControlCommander controlCommander;
	private ControlVerifierIdentification controlVerifierIdentification;
	private BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires;
	private Clavier clavier = new Clavier();
	
	public BoundaryCommander(
			ControlCommander controlCommander,
			ControlVerifierIdentification controlVerifierIdentification,
			BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires) {
		this.controlCommander = controlCommander;
		this.controlVerifierIdentification = controlVerifierIdentification;
		this.boundaryEnregistrerCoordonneesBancaires = boundaryEnregistrerCoordonneesBancaires;
	}

	public void commander(int numClient) {
		boolean clientConnecte = controlVerifierIdentification.verifierIdentification(ProfilUtilisateur.CLIENT, numClient);
		if(clientConnecte){
		    List<String> listeHamburger = controlCommander.getListeHamburger();
		    System.out.println("Veuillez sélectionner le numero de votre hamburger:");
		    for(int i = 0; i < listeHamburger.size(); i++){
		        System.out.println(i + " : " + listeHamburger.get(i));
		    }
		    int numHamburger = clavier.entreeClavierInt();
		    
		    List<String> listeAccompagnement = controlCommander.getListeAccompagnement();
		    System.out.println("Veuillez sélectionner le numero de votre accompagnement:");
		    for(int i = 0; i < listeAccompagnement.size(); i++){
		        System.out.println(i + " : " + listeAccompagnement.get(i));
		    }
		    int numAccompagnement = clavier.entreeClavierInt();
		    
		    List<String> listeBoisson = controlCommander.getListeBoisson();
		    System.out.println("Veuillez sélectionner le numero de votre boisson:");
		    for(int i = 0; i < listeBoisson.size(); i++){
		        System.out.println(i + " : " + listeBoisson.get(i));
		    }
		    int numBoisson = clavier.entreeClavierInt();
		    
		    boolean carteRenseignee = controlCommander.isCarteRenseignee(numClient);
		    if(!carteRenseignee){
		        carteRenseignee = boundaryEnregistrerCoordonneesBancaires.renseignerInfoBancaire(numClient);
		    }
		    if(carteRenseignee){
		        int numCommande = controlCommander.enregistrerCommande(numClient, numHamburger, numAccompagnement, numBoisson);
		        System.out.println("Votre numéro de commande est le : " + numCommande);
		    }else{
		        System.out.println("Aucune carte bancaire renseignée");
		    }
		}
		else
		{
			System.out.println("Client non connecté");
		}
	}

}
