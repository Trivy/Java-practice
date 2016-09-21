package garage;

import java.io.Serializable;

public class MoteurEssence extends Moteur implements Serializable{
	MoteurEssence(String cylindre, double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.ESSENCE;
	}
}
