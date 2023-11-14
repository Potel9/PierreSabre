package personnage;

public class Yakuza extends Humain {
	String clan ; 
	int reputation = 0 ;
	public Yakuza(String nom, String boissonPref, int argent, String clan,int reputation) {
		super(nom, boissonPref, argent);
		this.clan = clan;
		this.reputation = reputation; 
	}
	
	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+getNom()+  " et j’aime boire du "+getBoissonPref());
		parler("Mon clan est celui de "+getClan());
	}
	public void extorquer(Commercant victime) {
	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
	parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
	int	vol = victime.seFaireExtorquer(); 
	gagnerArgent(vol);
	this.reputation +=1 ; 
	parler("J’ai piqué les "+ vol+" sous de "+victime.getNom()+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int perte = this.getArgent();
		perdreArgent(perte); 
		this.reputation -= 1 ; 
		parler("J'ai perdus");
		return perte ;
		
	}
	public int gagner(int gain) {
		gagnerArgent(gain); 
		parler("J'ai gagné"); 
		this.reputation +=1 ;
		return gain ;
	}
}
