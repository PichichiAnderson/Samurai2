package personnages.secondaires;


import personnages.principaux.*;
import personnages.*;
import java.util.*;

public class GrandMere extends Human{

	private Human[] memoire;
	private Random r;
	private int nbConnaissances;
	
	public GrandMere(String nom) {
		super(nom, 0, "tisane");
		this.r = new Random();
		this.nbConnaissances = 0;
	}
	
	private String humanHasard() {
		
		int rand = r.nextInt(6);
		
		switch(rand) {
		
		case(0) : 
			return "Ronin";
		case(1) :
			return "Yakuza";
		case(2) :
			return "Commerçant";
		case(3) :
			return "Traitre";
		case(4) :
			return "Samourai";
		case(5) :
			return "Grand mère";
		}
		return "";
		
	}
	
	public void faireConnaissanceAvec(Human h) {
		if (this.nbConnaissances< 30) {
			this.memoire[this.nbConnaissances] = h;
			this.nbConnaissances ++;
			this.parler("Ah je me souviendrai de toi.");
		}
		else {
			this.parler("Oh je suis bien trop vieille, laisse ma mémoire tranquille.");
		}
	}
	
	public void ragoter() {
		
		for (int i = 0; i < nbConnaissances; i++) {
			if ( memoire[i] instanceof Traitre ) {
				this.parler("Je sais que "+memoire[i].getNom()+" est un traître !");
			}
			else {
				String s = humanHasard();
				this.parler("Je crois que "+memoire[i].getNom()+ " est un "+s+".");
			}
		}
		
	}
	
	

}
