package histoire;
import personnage.Humain;
import personnage.Commercant;
import personnage.Yakuza;
import personnage.Ronin;
public class HistoireTp4 {

	public static void main(String[] args) {
		Commercant prof = new Commercant("Marco", 15); 
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 12); 
		yaku.extorquer(prof);
		Ronin roro = new Ronin("Roro", "sochu", 60 ); 
		roro.direBonjour();
		roro.donnerArgent(prof); 
		roro.provoquer(yaku);
	}

}
