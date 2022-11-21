package exemple;

import java.util.ArrayList;

import bandeau.Bandeau; 

public class Scenario {

	private Bandeau bandeau ; 
	private ArrayList<Effet> lesEffets = new ArrayList<Effet>(); 

	
	public Scenario(Bandeau bandeau) {
		this.bandeau = bandeau; 
		
	}
	
	public void ajouterEffet(Effet lesEffets) {
		this.lesEffets.add(lesEffets); 
	}
	
	public ArrayList<Effet> getListe(){
		return this.lesEffets;
	}
	
	public void afficherScenario() {
		for (Effet e : lesEffets) {
			e.afficher(); 
			bandeau.sleep(100);
		}
		bandeau.close(); 
	}
}
