package vue;

import control.ControlAjouterAlimentCarte;
import control.ControlVerifierIdentification;
import control.TypeAliment;

public class BoundaryAjouterAlimentCarte {
	private ControlAjouterAlimentCarte controlAjouterAlimentCarte;
	
	private Clavier clavier = new Clavier();
	private int choix;
	private boolean EntreeValide = false;
	
	public BoundaryAjouterAlimentCarte(ControlVerifierIdentification controlVerifierIdentification, ControlAjouterAlimentCarte controlAjouterAlimentCarte) {
		
	}
	
	public void ajouterAlimentCarte(int numProfil) {
		
		do
		{
			System.out.println("1.Ajouter un hamburger");
			System.out.println("2.Ajouter un accompagnement");
			System.out.println("3.Ajouter une boisson");
			this.choix=clavier.entreeClavierInt();
			if(choix==1 || choix==2 || choix==3) {
				EntreeValide = true;
			}
			else
			{
				System.out.println("Veuillez entrer 1, 2 ou 3");
			}
		}while(!EntreeValide);
		
		System.out.println("Veuillez entrer le nom de l'aliment");
		String nom = clavier.entreeClavierString();
		switch (choix)
		{
			case 1:
				controlAjouterAlimentCarte.ajouterAliment(TypeAliment.HAMBURGER, nom);
				break;
			case 2:
				controlAjouterAlimentCarte.ajouterAliment(TypeAliment.ACCOMPAGNEMENT, nom);
				break;
			case 3:
				controlAjouterAlimentCarte.ajouterAliment(TypeAliment.BOISSON, nom);
				break;
			default:
				System.out.println("Type d'aliment nom reconnu");	
		}
	}
}
