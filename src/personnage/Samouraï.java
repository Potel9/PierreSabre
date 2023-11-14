package personnage;

public class Samoura� extends Ronin{
	String seigneur ; 
	public Samoura�(String seigneur, String nom, String boissonPref, int argent ) {
		super(nom, boissonPref, argent);
		this.seigneur = seigneur; 
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle "+getNom()+" et j�aime boire du "+getBoissonPref());
		parler("Je suis fier de servir le seigneur " + getSeigneur() );
	}

	public String getSeigneur() {
		return seigneur;
	}

	public void setSeigneur(String seigneur) {
		this.seigneur = seigneur;
	}

	@Override
	public String toString() {
		return "Samoura� [seigneur=" + seigneur + super.toString() + "]";
	}


	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson );
}
}