package voiture.option;

import java.io.Serializable;

public class GPS implements Option,Serializable{
	private double prix;
	
	public GPS(){
		this.prix=300d;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		return "GPS ("+this.prix+" €)";
	}
}
