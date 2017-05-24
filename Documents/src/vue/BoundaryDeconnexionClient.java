package vue;

import control.ControlDeconnexion;
import model.ProfilUtilisateur;

public class BoundaryDeconnexionClient{
    ControlDeconnexion controlDeconnexion;
    
    public BoundaryDeconnexionClient(ControlDeconnexion controlDeconnexion){
        this.controlDeconnexion = controlDeconnexion;
    }
    
    public void seDeconnecterClient(int numClient){
        controlDeconnexion.seDeconnecter(ProfilUtilisateur.CLIENT, numClient);
    }
}