package model;

public abstract class Profil {
	private String login;
	private String mdp;
	private String nom;
	private String prenom;
	private boolean connecte=false;
	
	public Profil(String login, String mdp,	String nom, String prenom) {
		this.login=login;
		this.mdp=mdp;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public void seConnecter() {
		this.connecte=true;
	}
	
}
