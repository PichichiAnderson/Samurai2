package personnages.secondaires;
import personnages.principaux.Yakuza;

import java.util.Random;


public class Ninja extends Yakuza{

	private String clanSecret;
	private static final String[] clansNinja = {" of Shadows", " of Mist", " of Clouds", " of Fog", " of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		
		Random rand = new Random();
		int clanSecret = rand.nextInt(5);
		String suffixe = "";
		
		switch(clanSecret) {
		
		case(0) -> suffixe = clansNinja[0];
		
		case(1) -> suffixe = clansNinja[1];
		
		case(2) -> suffixe = clansNinja[2];
		
		case(3) -> suffixe = clansNinja[3];
	
		case(4) -> suffixe = clansNinja[4];
		
		default -> suffixe = "";
		}
		
		
		this.clanSecret = clan + suffixe;
		
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("(mon clan secret est "+this.clanSecret+ " et maintenant que tu le sais, je vais devoir te tuer)");
	}
	
	public static void main(String[] argc) {
		Ninja n = new Ninja("Charles", 15, "Thé", "La pipibox");
		n.direBonjour();
	}
}
