package control;

import model.BDCommande;

public class ControlArchiver {
    private BDCommande bdCommande;
    
	public ControlArchiver(BDCommande bdCommande) {
		// TODO Auto-generated constructor stub
	}
	
	public void setObserver(BoundaryArchiver vue) {
        BDCommande.getInstance().addObserver(vue);
	}

}
