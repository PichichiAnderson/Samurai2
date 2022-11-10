package personnages;

public class Human {

	private String nom;
	private int argent;
	private String boisson;
	
	public Human(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	public void perdreArgent(int n) {
		this.argent -= n;
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m’appelle " +this.getNom()+  " et j’aime boire du "+this.getBoisson()+ ".\n");
	}
	public void boire() {
		this.parler("Mmmm, un bon verre de "+this.getBoisson()+"! GLOUPS !");
	}
	protected void parler(String msg) {
		String s= "";
		s+="-  ( " +this.nom + " )  -";
		s+=msg;
		System.out.println(s);
	}

}