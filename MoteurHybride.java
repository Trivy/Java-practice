package garage;

import java.io.Serializable;

public class MoteurHybride extends Moteur implements Serializable {

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		this.type=TypeMoteur.HYBRIDE;
	}

}
