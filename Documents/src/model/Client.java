package model;

public class Client extends Profil {
	
	public Client(String login, String mdp,	String nom, String prenom) {
		super(login,mdp,nom,prenom);
	}
	
	public String toString() { 
	return "Client [nom="+this.getNom()+", prenom="+this.getPrenom()+", login="+this.getLogin()+", mdp="+this.getMdp()+", connecte="+this.isConnected()+"]"; 
	}
}