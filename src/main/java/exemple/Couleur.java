package exemple;
import bandeau.Bandeau;
import java.awt.Color; 

public class Couleur extends Effet  {
	public Couleur( Bandeau bandeau, String message, Color couleur) {
		super(bandeau, message, couleur); 
	}
	
	public void afficher() {
		bandeau.setMessage(message);
		this.bandeau.setForeground(couleur);
	}
	
	public int getRepet() {
		return this.repetitions;
	}

}
