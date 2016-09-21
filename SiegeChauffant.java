package garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	double prix;

	public SiegeChauffant() {
		// TODO Auto-generated constructor stub
		this.prix=250d;
	}

	public double getPrix(){
		return this.prix;
	}

}
