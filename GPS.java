package garage;

import java.io.Serializable;

public class GPS implements Option,Serializable{
	double prix;
	
	public GPS(){
		this.prix=300d;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		return "GPS, prix "+this.prix;
	}
}
