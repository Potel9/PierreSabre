package histoire;

import personnage.Commercant;
import personnage.Ronin;
import personnage.Yakuza;
import personnage.Traitre;
import personnage.Samouraï;
public class HistoireTp5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		Samouraï akimoto = new Samouraï("Miyamoto", "Akimoto", "saké", 80);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 12); 
		yaku.direBonjour();
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(akimoto);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
		
		
		
	}

}
