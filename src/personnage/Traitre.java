package personnage;

public class Traitre extends Samouraï {
	int nivTraitrise = 0 ; 
	public Traitre(String seigneur, String nom, String boissonPref, int argent ) {
		super(nom, boissonPref, seigneur, argent);
	}

	
	public int getNivTraitrise() {
		return nivTraitrise;
	}


	public void setNivTraitrise(int nivTraitrise) {
		this.nivTraitrise = nivTraitrise;
	}
	

	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+getNom()+" et j’aime boire du "+getBoissonPref());
		parler("Je suis fier de servir le seigneur " + getSeigneur() );
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+getNivTraitrise()+ " Chut !");
	}
	
	
	public void ranconner(Commercant commercant) {
		if( nivTraitrise < 3 ) {
			int argentRanconner = commercant.getArgent()* (2/10); 
			commercant.perdreArgent(argentRanconner) ;
			gagnerArgent(argentRanconner); 
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! "
					+ argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom()); 
			nivTraitrise ++ ;
		}
			
		else {
			parler("- Mince je ne peux plus rançonner personne sinon un samouraï risque de\r\n"
					+ "me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if( getNbConnaissance() < 1  ) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne! Sniff."); 
		}
		else {
			int don = getArgent()*(1/20);
			Humain[] memoire = getMémoire();
			int r = (int) (Math.random()* (getNbConnaissance()-0));
			Humain ami = memoire[r];
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+ ami.getNom() +"." ); 
			parler("Bonjour l'ami!"+"Je voudrais vous aider en vous donnant "+ don +"sous. "); 
			ami.gagnerArgent(don);
			perdreArgent(don); 	
			ami.parler("Merci "+ getNom() +".Vous êtes quelqu'un de bien."); 
			if (nivTraitrise > 1 ) {
				nivTraitrise-- ; 
			
			}
			
		}
	}
	
	
	
	
	
	
}
