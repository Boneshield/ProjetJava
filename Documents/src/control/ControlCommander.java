package control;

import model.BDClient;
import model.BDCommande;
import model.Carte;
import model.Commande;

public class ControlCommander {
    private BDClient bdClient;
    private BDCommande bdCommande;
    
	public ControlCommander(BDClient bdClient,
			BDCommande bdCommande) {
		this.bdClient = bdClient;
		this.bdCommande = bdCommande;
	}
	
	public String getListeHamburger(){
	    List<Hamburger> listeHamburger = Carte.getInstance.getListeHamburger();
	    List<String> listeReturn = new ArrayList<>();
	    for(Hamburger hamburger : this.listeHamburger){
	        listeReturn.add(hamburger.getNom());
	    }
	    return listeReturn;
	}
	
	public String getListeAccompagnement(){
	    List<Accompagnement> listeAccompagnement = Carte.getInstance.getListeAccompagnement();
	    List<String> listeReturn = new ArrayList<>();
	    for(Accompagnement accompagnement : this.listeAccompagnement){
	        listeReturn.add(accompagnement.getNom());
	    }
	    return listeReturn;
	}
	
	public String getListeBoisson(){
	    List<Boisson> listeBoisson = Carte.getInstance.getListeBoisson();
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
	    Client client = bdClient.getClient(numClient);
	    Hamburger hamburger = Carte.getInstance().getHamburger(numHamburger);
	    Accompagnement accompagnement = Carte.getInstance().getAccompagnement(numAccompagnement);
	    Boisson boisson = Carte.getInstance().getBoisson(numBoisson);
	    Commande commande = new Commande(client, hamburger, accompagnement, boisson);
	    int numCommande = bdCommande.ajouterCommande(commande);
	    return numCommande;
	}
}
