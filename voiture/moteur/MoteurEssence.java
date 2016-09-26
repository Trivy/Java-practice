package voiture.moteur;

import java.io.Serializable;

public class MoteurEssence extends Moteur implements Serializable{
	public MoteurEssence(String cylindre, double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.ESSENCE;
	}
}
