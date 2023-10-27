package personnage;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int argentPerdus= this.getArgent();
		parler("J'ai tout perdus ! Le monde est vraiment trop injuste");
		perdreArgent(argentPerdus); 
		return argentPerdus ; 
	}
	public void recevoirArgent(int montant) {
		this.gagnerArgent(montant);
		parler(montant + " sous ! Merci généreux donateur."); 
	}
}
	