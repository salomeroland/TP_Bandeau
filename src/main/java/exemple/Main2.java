package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bandeau monBandeau = new Bandeau();
		Color couleur = Color.BLUE;
		Scenario monScenario =new Scenario(monBandeau); 
		Effet e = new Zoom(3, monBandeau, "Zoom");
		System.out.println(e.getRepet());
		monScenario.ajouterEffet(e);
		monScenario.ajouterEffet(new Rotation(1, monBandeau, "Tourne"));
		monScenario.ajouterEffet(new Clignotant(10, monBandeau, "Clignote"));
		monScenario.ajouterEffet(new Couleur(monBandeau, "Couleur", couleur));
		
		monScenario.afficherScenario(); 
	}

}
