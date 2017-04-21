package model;

public abstract class Profil {
	private String login;
	private String mdp;
	private String nom;
	private String prenom;
	private boolean connecte=false;
	
	public Profil(String mdp, String nom, String prenom) {
		this.login=nom+"."+prenom;
		this.mdp=mdp;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getMdp() {
		return this.mdp;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void seConnecter() {
		this.connecte=true;
	}
	
	public boolean isConnected() {
		return this.connecte; 
	}
	
	public String toString() { 
		return "Client [nom="+this.getNom()+", prenom="+this.getPrenom()+", login="+this.getLogin()+", mdp="+this.getMdp()+", connecte="+this.isConnected()+"]"; 
	}
}
