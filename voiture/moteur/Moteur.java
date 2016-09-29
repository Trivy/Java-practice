package voiture.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	public double getPrix(){
		return prix;
	}
	
	public Moteur(String cylindre, double prix){
		this.cylindre=cylindre;
		this.prix=prix;
	}
	
	public void setMoteur(String cylindre, double prix){
		this.cylindre=cylindre;
		this.prix=prix;		
	}
	
	public String toString(){
		return "Moteur "+type.toString()+" "+cylindre+" ("+prix+" €)";
	}
}
