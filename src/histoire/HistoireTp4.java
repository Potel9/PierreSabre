package histoire;
import personnage.Humain;
public class HistoireTp4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha", 52); 
		prof.direBonjour();
		prof.acheter("kombucha", 12);
		prof.acheter("kimono",50);
		
	}

}
