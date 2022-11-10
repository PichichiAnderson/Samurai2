package personnages;

public class Main {

	
		public static void main(String[] args) {
			Human C = new Human("Charles", 10, "thé");
			C.parler("Bonjour "+C.getArgent());
			C.gagnerArgent(20);
			C.parler("Bonjour "+C.getArgent());
			C.perdreArgent(50);
			C.parler("Bonjour "+C.getArgent());
			
			
		}
	

}
