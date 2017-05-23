package vue;

import java.util.Observable;
import java.util.Observer;

import control.ControlVisualiserCommandeJour;
import model.BDCommande;

public class BoundaryVisualiserCommandeJour implements Observer{
    //private ControlVisualisationCommandeJour controlVisualisationCommandeJour;
    
    public BoundaryVisualiserCommandeJour(ControlVisualiserCommandeJour controlVisualisationCommandeJour){
        //this.controlVisualisationCommandeJour = controlVisualisationCommandeJour;
        controlVisualisationCommandeJour.setObserver(this);
    }
    
    public void update(Observable arg0, Object arg1) {
        if (arg0 instanceof BDCommande) {
            if (arg1 instanceof String) {
                String texte = (String) arg1;
                fichier.ecrire("Ecran cuisinier" + texte);
            }else{
                System.out.println("type de message inconnu");
            }
        }else{
            System.out.println("Objet emetteur inconnue");
        }
    }
}