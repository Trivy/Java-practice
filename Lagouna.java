package garage;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Lagouna extends Vehicule implements Serializable{
	public Lagouna(){
		this.prix = 2500d;
		this.nom="Lagouna";
		this.options = new LinkedList();
		this.nomMarque = Marque.RENO;
		this.moteur = new MoteurEssence("150 Chevaux", 10256d);
	}
}
