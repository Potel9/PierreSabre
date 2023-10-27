package histoire;
import personnage.Humain;
import personnage.Commercant;
public class HistoireTp4 {

	public static void main(String[] args) {
		Commercant prof = new Commercant("Prof", 52); 
		prof.direBonjour();
		prof.acheter("Thé", 12);
		prof.acheter("kimono",50);
		prof.seFaireExtorquer(); 
		prof.recevoirArgent(15);
		prof.boire();
	}

}
