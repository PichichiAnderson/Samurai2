package personnages.principaux;

import personnages.Human;


public class Commercant extends Human{

	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.parler("Le monde est vraiment trop injuste.");
		return argent;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci avec déférence !");
	}
	
	

}
