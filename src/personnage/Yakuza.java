package personnage;

public class Yakuza extends Humain {
	String clan ; 
	int reputation = 0 ;
	public Yakuza(String nom, String boissonPref, int argent, String clan) {
		super(nom, boissonPref, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
	parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
	int	vol = victime.seFaireExtorquer(); 
	gagnerArgent(vol);
	this.reputation +=1 ; 
	parler("J’ai piqué les "+ vol+" sous de "+victime.getNom()+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
}
