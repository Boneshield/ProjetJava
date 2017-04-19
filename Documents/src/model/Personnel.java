package model;

public class Personnel extends Profil{
    private boolean gerant = false;
    private int numeroPersonnel;
    
    public Personnel(String login, String mdp, String nom, String prenom){
        super(login, mdp, nom, prenom);
    }
    
    public void definirGerant() {
        this.gerant = true;
    }
    
    public int getNumeroPersonnel{
        return numeroPersonnel;
    }
}
