package exemple;

import bandeau.Bandeau;

import java.awt.Color; 

public class Clignotant extends Effet {
	
	public Clignotant(int repetitons, Bandeau bandeau, String message) {
		super(repetitons, bandeau, message);
		// TODO Auto-generated constructor stub
	}
	
	public void afficher() {
		bandeau.setMessage(message);
		for(int i =0; i<this.repetitions; i++) {
			for(int n=0; n<this.repetitions; n++) {
				if(i %  2 ==0) {
					this.bandeau.setForeground(Color.pink);
					this.bandeau.sleep(5);
				}
				if((i%2)!=0) {
					this.bandeau.setForeground(Color.red); 
					this.bandeau.sleep(5);
				}
			}
		}
	}

	public int getRepet() {
		return this.repetitions;
	}
	

}
