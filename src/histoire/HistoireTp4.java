package histoire;
import personnage.Humain;
import personnage.Commercant;
import personnage.Yakuza;
public class HistoireTp4 {

	public static void main(String[] args) {
		Commercant prof = new Commercant("Marco", 15); 
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong"); 
		yaku.extorquer(prof);
	}

}
