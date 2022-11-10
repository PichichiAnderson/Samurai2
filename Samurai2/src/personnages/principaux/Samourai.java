package personnages.principaux;

public class Samourai extends Ronin{

	
	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
		
	}
	
	public String getSeigneur() {
		return this.seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je sers le seigneur "+this.getSeigneur()+".");
	}
	
	public void boire(String boisson) {
		this.parler("Mmmm, un bon verre de "+boisson+"! GLOUPS !");
	}

}
