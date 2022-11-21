package exemple;

import java.awt.Color;

import bandeau.Bandeau;


public abstract class Effet {
	public Bandeau bandeau; 
	protected int repetitions; 
	protected String message; 
	protected Color couleur; 
	
	public Effet(int repetitons, Bandeau bandeau, String message) {
		this.repetitions = repetitons; 
		this.bandeau = bandeau; 
		this.message = message; 
		
	}
	
	public Effet(Bandeau bandeau, String message, Color couleur) {
		this.bandeau = bandeau; 
		this.message = message; 
		this.couleur = couleur; 

	}

	public abstract void afficher(); 
	public abstract int getRepet();
}
