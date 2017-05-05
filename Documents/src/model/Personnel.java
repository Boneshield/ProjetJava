package model;

public class Personnel extends Profil{
    private boolean gerant = false;
    private int numeroPersonnel;
    
    public Personnel(String nom, String prenom, String mdp){
        super(nom, prenom, mdp);
    }
    
    public void definirGerant() {
        this.gerant = true;
    }
    
    public int getNumeroPersonnel(){
        return numeroPersonnel;
    }
    
    public void setNumeroPersonnel(Personnel personnel, int numero) {
    	personnel.numeroPersonnel = numero;
    }

	public boolean isGerant() {
		return gerant;
	}
	
	public String toString() {
		return "Personnel [nom=" + getNom() + ", prenom=" + getPrenom()
		+ ", login=" + getLogin() + ", mdp=" + getMdp() + ", gerant="
		+ gerant + ", connecte=" + this.isConnected() + "]";
		}
}
