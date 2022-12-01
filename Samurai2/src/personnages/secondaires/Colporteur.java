package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant{
	
	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int argent = this.getArgent() / 2;
		this.perdreArgent(argent);
		this.parler("Hahaha il n'a eu que la moitié de ce que j'ai hahaha.");
		return argent;
	}
	

}
