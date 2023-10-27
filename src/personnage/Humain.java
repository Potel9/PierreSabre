package personnage;

public class Humain {

	private String nom; 
	private String BoissonPref;
	private int argent; 	
	
	
	
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		BoissonPref = boissonPref;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public String getBoissonPref() {
		return BoissonPref;
	}
	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println(this.nom+"- "+texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ this.nom+" et j'aime boire du "+this.BoissonPref);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+this.BoissonPref+" ! GLOUPS !"); 	
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain ; 
	}
	
	public void perdreArgent(int perte) {
		this.argent -= perte ; 
	}
	public void acheter(String achat, int prix) {
		if (this.argent < prix) {
			parler("Je n'ai plus que "+this.argent+" sous en poche. Je ne peux plus m'offrir "+achat+" à "+prix+"sous.");}
		else {
			parler("J'ai "+this.argent+" sous en poche. Je vais pouvoir m'offrir "+achat+" à "+prix+" sous.");
			perdreArgent(prix); 
		}
	
	}
	public static void main(String[] args) {
		Humain poyo = new Humain("poyel", "9.6", -500); 
		poyo.direBonjour();
		poyo.boire();
	}
}
