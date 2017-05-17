package control;

public class ControlVerifierCoordonneesBancaires {
	
	/**
	* Controle les coordonnées bancaires d'une carte
	* @return true or false
	*/
    public boolean verifierCoordonneesBancaires(int numCarte, int dateCarte){
        if(dateCarte < 100 && dateCarte > 1299){
		        return false;
        }
        return true;
    }
}
