package personnages.principaux;

import personnages.Human;

public class Ronin extends Human {

	private int honneur;
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}

	public int getHonneur() {
		return this.honneur;
	}
	
	public void donner(int argent, Commercant c) {
		if(this.getArgent() >= argent) {
			c.gagnerArgent(argent);
			this.perdreArgent(argent);
			this.parler("J'ai donné "+argent+"$ à "+c.getNom()+".");
		}
		else {
			this.parler("Malheureusement je ne peux pas te donner "+argent+"$ car je ne les ai pas.");
		}
		
	}
	public void provoquer(Yakuza y) {
		if ( (this.getHonneur()*2) > y.getReputation() ) {
			this.gagnerArgent(y.perdre());
			this.honneur ++;
			this.parler("J'ai gagné mon duel face à "+y.getNom()+".");
		}
		else {
			y.gagner();
			this.honneur --;
			this.parler("J'ai perdu mon duel face à "+y.getNom()+".");
			
		}
	}
	
	
	
	
}
