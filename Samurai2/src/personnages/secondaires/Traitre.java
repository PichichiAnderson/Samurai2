package personnages.secondaires;

import personnages.principaux.*;
import personnages.*;

public class Traitre extends Samourai{

	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
		
	}
	
	public int getTraitrise(){
		return this.traitrise;
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traitrise est de : "+this.getNom()+".");
	}
	
	public void extorquer(Commercant c) {
		if(this.getTraitrise() == 3) {
			this.parler("Ohhh non je ne peux plus faire le hatail.");
		}
		else {
			this.gagnerArgent(c.seFaireExtorquer());
			this.parler("Je t'ai bien cassé la gueule, bouffon "+c.getNom()+".");
		}
	}
	public void faireLeGentil(Human h, int argent) {
		h.gagnerArgent(argent);
		this.perdreArgent(argent);
		if ((this.getTraitrise() - (argent * 0.1) )== 0 ) {
			this.traitrise -= argent * 0.1;
			this.parler("Je viens de faire une bonne action.");
		}
		
		
	}
	

}
