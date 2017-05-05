package model;

public class Client extends Profil {
	
	public Client(String nom, String prenom, String mdp) {
		super(nom,prenom,mdp);
	}
	
	public String toString() {
		return "Client [nom=" + getNom() + ", prenom=" + getPrenom()
		+ ", login=" + getLogin() + ", mdp=" + getMdp() + ", connecte="
		+ this.isConnected() + "]";
	}
}