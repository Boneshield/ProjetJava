package control;

import model.BDClient;
import model.BDCommande;
import model.Carte;
import model.Commande;

public class ControlCommander {
    private BDClient bdClient;
    private BDCommande bdCommande;
    
	public ControlCommander(Carte carte, BDClient bdClient,
			BDCommande bdCommande) {
		this.carte = carte
		this.bdClient = bdClient;
		this.bdCommande = bdCommande;
	}
	
	public List<String> getListeHamburger(){
	    List<Hamburger> listeHamburger = carte.getListeHamburger();
	    List<String> listeReturn = new ArrayList<>();
	    for(Hamburger hamburger : this.listeHamburger){
	        listeReturn.add(hamburger.getNom());
	    }
	    return listeReturn;
	}
	
	public List<String> getListeAccompagnement(){
	    List<Accompagnement> listeAccompagnement = carte.getListeAccompagnement();
	    List<String> listeReturn = new ArrayList<>();
	    for(Accompagnement accompagnement : this.listeAccompagnement){
	        listeReturn.add(accompagnement.getNom());
	    }
	    return listeReturn;
	}
	
	public List<String> getListeBoisson(){
	    List<Boisson> listeBoisson = carte.getListeBoisson();
	    List<String> listeReturn = new ArrayList<>();
	    for(Boisson boisson : this.listeBoisson){
	        listeReturn.add(boisson.getNom());
	    }
	    return listeReturn;
	}
	
	public boolean isCarteRenseignee(int numClient){
	    Client client = bdClient.getClient(numClient);
	    return client.isCarteRenseignee();
	}
	
	public int enregistrerCommande(int numClient, int numHamburger, int numAccompagnement, int numBoisson){
	    Hamburger hamburger = carte().choixHamburger(numHamburger);
	    Accompagnement accompagnement = carte().choixAccompagnement(numAccompagnement);
	    Boisson boisson = carte().choixBoisson(numBoisson);
	    int numCommande = BDCommande.getInstance().enregistrerCommande(numClient, hamburger, accompagnement, boisson);
	    return numCommande;
	}
}
