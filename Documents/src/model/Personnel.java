package model;

public class Personnel extends Profil{
    private boolean gerant = false;
    private int numeroPersonnel;
    
    public Personnel(String mdp, String nom, String prenom){
        super(mdp, nom, prenom);
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
}
