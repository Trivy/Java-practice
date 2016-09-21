package garage;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable {
	MoteurDiesel(String cylindre, double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.DIESEL;
	}
}
