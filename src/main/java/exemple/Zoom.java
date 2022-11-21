package exemple;
import bandeau.Bandeau;

import java.awt.Font; 

public class Zoom extends Effet {

	public Zoom(int repetitons, Bandeau bandeau, String message) {
		super(repetitons, bandeau, message);
	}
	
	public void afficher() {
		bandeau.setMessage(message);
		this.bandeau.sleep(100);
		for (int n = 0; n<this.repetitions; n++) {
			for(int i=5; i < 60; i+=5) {
				this.bandeau.setFont(new Font("Message", Font.BOLD, 5+i));
				this.bandeau.sleep(100);
				
			}
		}
		this.bandeau.sleep(100);
	}
	
	public int getRepet() {
		return this.repetitions;
	}
}
