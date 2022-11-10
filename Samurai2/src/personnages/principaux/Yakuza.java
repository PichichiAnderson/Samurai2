package personnages.principaux;

import personnages.Human;

public class Yakuza extends Human{

	private String clan;
	private int reputation = 0;
	
	public Yakuza(String clan, int reputation, String nom, int argent, String boisson ) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	

}
