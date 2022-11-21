package exemple;

import java.awt.Color;

import bandeau.Bandeau; 

public class Rotation extends Effet {
	
	public Rotation(int repetitons, Bandeau bandeau, String message) {
		super(repetitons, bandeau, message);
		// TODO Auto-generated constructor stub
	}
	
	public void afficher() {
		bandeau.setMessage(message);
		this.bandeau.sleep(100);
		for (int n=0; n<  this.repetitions; n++) {
			for(int i =0; i<=100; i++) {
				this.bandeau.setRotation(2*Math.PI * i/100);
				this.bandeau.setForeground(Color.pink);
				this.bandeau.sleep(100); 
			}
		}
		this.bandeau.sleep(100);
	}
	
	public int getRepet() {
		return this.repetitions;
	}

}
