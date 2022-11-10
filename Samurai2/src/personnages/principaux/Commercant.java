package personnages.principaux;

import personnages.Human;


public class Commercant extends Human{

	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		this.parler("Le monde est vraiment trop injuste.");
		return 0;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci avec déférence !");
	}
	
	

}
