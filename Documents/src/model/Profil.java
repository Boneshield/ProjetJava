package model;

public abstract class Profil {
	private String login;
	private String mdp;
	private String nom;
	private String prenom;
	protected boolean connecte=false;
	
	public Profil(String nom, String prenom, String mdp) {
		this.login=prenom+"."+nom;
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
	
	public void connexionProfil() {
		this.connecte=true;
	}
	
	public boolean isConnected() {
		return this.connecte; 
	}
	
	public boolean selectProfil(String login, String mdp) {
		if(this.login == login && this.mdp == mdp)
		{
			return true;
		}
		return false;
	}
	
}
