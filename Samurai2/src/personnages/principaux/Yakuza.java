package personnages.principaux;

import personnages.Human;

public class Yakuza extends Human{

	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	
	public void extorquer(Commercant commercant ) {
		this.gagnerArgent(commercant.getArgent());
		commercant.perdreArgent(this.getArgent());
		this.reputation ++;
		this.parler("Je viens de te prendre tout ton argent !");
		
	}
	
	public int perdre() {
		int argentPerdu = this.getArgent();
		this.perdreArgent(this.getArgent());
		this.reputation --;
		this.parler("J'ai perdu mon duel !");
		return argentPerdu;
	}
	
	public void gagner() {
		this.reputation ++;
		this.parler("J'ai gagné mon duel !");
		
	}
	

}
