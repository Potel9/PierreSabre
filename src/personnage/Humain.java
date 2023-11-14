package personnage;

public class Humain {
	private Humain[] mémoire =new Humain[30]  ; 
	private int nbConnaissance = 0 ; 
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

	public Humain[] getMémoire() {
		return mémoire;
	}
	public void setMémoire(Humain[] mémoire) {
		this.mémoire = mémoire;
	}
	public int getNbConnaissance() {
		return nbConnaissance;
	}
	public void setNbConnaissance(int nbConnaissance) {
		this.nbConnaissance = nbConnaissance;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setBoissonPref(String boissonPref) {
		BoissonPref = boissonPref;
	}
	public void setArgent(int argent) {
		this.argent = argent;
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
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		memoriser(humain); 
		humain.repondre(this);
		
	}
	
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
		
	}
	public void listerConnaissance () {
		System.out.println("Je connais beaucoup de monde dont : ");
		for(int i = 0 ; i<nbConnaissance ; i++) {
			System.out.println(mémoire[i].getNom()+ " ");
		}
	}
	private void memoriser(Humain humain) {
		if (nbConnaissance < 30 ) {
			mémoire[nbConnaissance] = humain ; 
			nbConnaissance ++ ; }
		else {
			mémoire[0] = null ; 
			for(int i = 1 ; i<30 ; i++) {
				mémoire[i-1] = mémoire[i] ; 
			}
			mémoire[nbConnaissance-1]= humain ;
			}
		
		
		
	}
	public static void main(String[] args) {
		Humain poyo = new Humain("poyel", "9.6", -500); 
		Humain poyo2 = new Humain("poyel2", "9.6", -500);
		Humain poyo3 = new Humain("mahmoud", "9.6", -500);
		poyo.faireConnaissanceAvec(poyo3);
		poyo.listerConnaissance();
		poyo3.listerConnaissance();
		poyo.boire();
	}
}
