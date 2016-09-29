package voiture.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	private double prix;

	public SiegeChauffant() {
		// TODO Auto-generated constructor stub
		this.prix=250d;
	}

	public double getPrix(){
		return this.prix;
	}

	public String toString(){
		return "Sièges chauffants ("+this.prix+" €)";
	}
}
