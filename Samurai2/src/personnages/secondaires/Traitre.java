package personnages.secondaires;

import personnages.principaux.*;

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
		
	}
	
	public void extorquer(Commercant c) {
		if(this.getTraitrise() == 3) {
			
		}
	}

}
