package control;

import vue.BoundaryVisualiserCommandeJour;
import model.BDCommande;

class ControlVisualiserCommandeJour{
    
    public void setObserver(BoundaryVisualiserCommandeJour vue) {
        this.BDCommande.getInstance.addObserver(vue);
	}
}