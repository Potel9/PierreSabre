package personnage;

public class Ronin extends Humain {
	int honneur = 1; 
	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
	}
	
	public void donnerArgent(Commercant pauvre) {
		int montant = this.getArgent()/10;
		parler(pauvre.getNom() + " tiens prends ces "+ montant+"sous."); 
		pauvre.recevoirArgent(montant);
	}	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2 ; 
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(force >= adversaire.getReputation()) {
			
			int gain = adversaire.perdre() ;
			gagnerArgent(gain); 
			this.honneur +=1 ; 
			parler("Je t’ai eu petit yakusa! ");} 
		else {
			int perte = this.getArgent();
			adversaire.gagner(perte);
			perdreArgent(perte);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup"); 
			}
		}
	}

