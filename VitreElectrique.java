package garage;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	double prix;

	public VitreElectrique() {
		prix = 350d;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		return "Vitres �lectriques, prix "+this.prix;
	}
}
