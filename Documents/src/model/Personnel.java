package model;

public class Personnel extends Profil{
    private boolean gerant = false;
    
    public Personnel(String login, String mdp, String nom, String prenom){
        super(login, mdp, nom, prenom);
    }
    
    public void definirGerant{
        gerant = true;
    }
}
