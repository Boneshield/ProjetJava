package model;

public class Client extends Profil {
    CarteBancaire carteBancaire = null;
	
	public Client(String nom, String prenom, String mdp) {
		super(nom,prenom,mdp);
	}
	
	public String toString() {
		return "Client [nom=" + getNom() + ", prenom=" + getPrenom()
		+ ", login=" + getLogin() + ", mdp=" + getMdp() + ", connecte="
		+ this.isConnected() + ", carte="+ carteBancaire + "]";
	}
	
	public void enregistrerCoordonneesBancaires(int numCarte, int dateCarte){
	    carteBancaire = new CarteBancaire(numCarte, dateCarte);
	}
	
	public boolean isCarteRenseignee(){
	    return carteBancaire != null;
	}
}