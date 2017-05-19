package control;

import vue.BoundaryVisualiserCommandeJour;
import model.BDCommande;

public class ControlVisualiserCommandeJour{
    
    public void setObserver(BoundaryVisualiserCommandeJour vue) {
        BDCommande.getInstance().addObserver(vue);
	}
}