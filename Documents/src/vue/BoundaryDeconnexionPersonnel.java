package vue;

import control.ControlDeconnexion;
import model.ProfilUtilisateur;

public class BoundaryDeconnexionPersonnel{
    ControlDeconnexion controlDeconnexion;
    
    public BoundaryDeconnexionPersonnel(ControlDeconnexion controlDeconnexion){
        this.controlDeconnexion = controlDeconnexion;
    }
    
    public void seDeconnecterPersonnel(int numPersonnel){
        controlDeconnexion.seDeconnecter(ProfilUtilisateur.PERSONNEL, numPersonnel);
    }
}