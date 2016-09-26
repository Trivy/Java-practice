package voiture.moteur;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable {
	public MoteurDiesel(String cylindre, double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.DIESEL;
	}
}
