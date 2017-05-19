package control;

import vue.BoundaryVisualiserCommandeJour;
import model.BDCommande;

class ControlVisualisationCommandeJour{
    
    public void setObserver(BoundaryVisualiserCommandeJour vue) {
        this.BDCommande.getInstance.addObserver(vue);
	}
}