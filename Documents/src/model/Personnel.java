package model;

public class Personnel extends Profil{
    private boolean gerant = false;
    
    public Personnel(String nom, String prenom, String mdp){
        super(nom, prenom, mdp);
    }
    
    public void definirGerant() {
        this.gerant = true;
    }

	public boolean isGerant() {
		return gerant;
	}
	
	public String toString() {
		return "Personnel [nom=" + getNom() + ", prenom=" + getPrenom()
		+ ", login=" + getLogin() + ", mdp=" + getMdp() + ", gerant="
		+ gerant + ", connecte=" + this.isConnected() + "]";
		}
	
	public void connexionProfil() {
		this.connecte = true;
	}
}
