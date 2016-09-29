package voiture.option;

import java.io.Serializable;

public class Climatisation implements Serializable, Option {
	private double prix;
	
	public Climatisation(){
		this.prix=500d;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		return "Climatisation ("+this.prix+" €)";
	}
}
