package vue;

import control.ControlArchiver;
import control.ControlVerifierIdentification;
import model.ProfilUtilisateur;

public class BoundaryArchiver {
    private Fichier fichier = new Fichier();
    private ControlVerifierIdentification controlVerifierIdentification;
	private ControlArchiver controlArchiver;
	
	public BoundaryArchiver(
			ControlVerifierIdentification controlVerifierIdentification,
			ControlArchiver controlArchiver) {
		this.controlVerifierIdentification = controlVerifierIdentification;
		this.controlArchiver = controlArchiver;
	}

	public void archiver(int numGerant) {
		if(controlVerifierIdentification.verifierIdentification(ProfilUtilisateur.GERANT, numGerant)){
		    fichier.effacer();
		}
	}
	
	public void update(Observable arg0, Object arg1) {
        if (arg0 instanceof BDCommande) {
            if (arg1 instanceof Integer) {
                Integer numLabel = (Integer) arg1;
                if(numLabel == 2){

                }
            }else{
                System.out.println("type de message inconnu");
            }
        }else{
            System.out.println("Objet emetteur inconnue");
        }
    }
}
