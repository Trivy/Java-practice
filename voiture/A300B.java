package voiture;

import java.io.Serializable;
import java.util.LinkedList;

import voiture.moteur.MoteurEssence;

public class A300B extends Vehicule implements Serializable {
	public A300B(){
		this.prix = 3254d;
		this.nom="A300B";
		this.options = new LinkedList();
		this.nomMarque = Marque.PIGEOT;
		this.moteur = new MoteurEssence("150 Chevaux", 10256d);
	}
}
