package voiture;

import java.io.Serializable;
import java.util.LinkedList;

import voiture.moteur.MoteurEssence;

public class D4 extends Vehicule implements Serializable {
	public D4(){
		this.prix = 3000d;
		this.nom="D4";
		this.options = new LinkedList();
		this.nomMarque = Marque.TROEN;
		this.moteur = new MoteurEssence("150 Chevaux", 10256d);
	}
}
