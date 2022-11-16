package personnages;

import personnages.principaux.*;


public class Main {

	
		public static void main(String[] args) {
			/*Human C = new Human("Charles", 10, "thé");
			C.parler("Bonjour "+C.getArgent());
			C.gagnerArgent(20);
			C.parler("Bonjour "+C.getArgent());
			C.perdreArgent(50);
			C.parler("Bonjour "+C.getArgent());*/
			
			Human humain = new Human("Prof", 10, "Porto");
			  humain.direBonjour();
			  humain.boire();
			  Commercant commercant = new Commercant("Marchand", 35);
			  commercant.direBonjour();
			  Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
			                             "biere", "WarSong");
			  yakusa.direBonjour();
			  yakusa.extorquer(commercant);
			  Ronin ronin = new Ronin("Roro", 61, "sake");
			  ronin.donner(10, commercant );
			  ronin.provoquer(yakusa);
			  ronin.direBonjour();

			
			  
			
		}
	

}
