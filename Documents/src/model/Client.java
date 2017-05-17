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
	
	/**
	* Ajoute les informations bancaires passées en paramètre dans la carte
	* @param int numCarte, int dateCarte
	*/
	public void enregistrerCoordonneesBancaires(int numCarte, int dateCarte){
	    carteBancaire = new CarteBancaire(numCarte, dateCarte);
	}
	
	/**
	* Retourne true si la carte de l'utilisateur est renseignée et faux sinon
	* @return true or false
	*/
	public boolean isCarteRenseignee(){
	    return carteBancaire != null;
	}
}