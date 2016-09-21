package garage;

import java.io.Serializable;

public class MoteurElectrique extends Moteur implements Serializable {

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		this.type=TypeMoteur.ELECTRIQUE;
	}

}
