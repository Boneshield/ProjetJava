package control;

public class ControlVerifierCoordonneesBancaires {
    public boolean verifierCoordonneesBancaires(int numCarte, int dateCarte){
        if(dateCarte < 100 && dateCarte > 1299){
		        return false;
        }
        return true;
    }
}
