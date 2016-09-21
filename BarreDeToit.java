package garage;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	double prix;

	public BarreDeToit() {
		// TODO Auto-generated constructor stub
		this.prix=50d;
	}

	public double getPrix(){
		return this.prix;
	}
}
