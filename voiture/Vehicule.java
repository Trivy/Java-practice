package voiture;

import java.io.Serializable;
import java.util.List;

import voiture.moteur.Moteur;
import voiture.option.Option;

public class Vehicule implements Serializable{
	protected Double prix;
	protected String nom;
	protected List<Option> options;
	protected Marque nomMarque;
	protected Moteur moteur;
	
	public String toString(){
		String output= "";
		output += "Voiture "+this.nomMarque+" : "+this.nom+" "+this.moteur.toString();
		if (options.size()>0){
			output += " [";
			for (int i=0; i< options.size()-1; i++){
				output += options.get(i).toString()+", ";
			}
			output += options.get(options.size()-1).toString()+"]";
		}
		output += " d'une valeur totale de "+this.getPrix()+" €";
		return output;
	}
	
	public void addOption(Option opt){
		options.add(opt);
	}
	
	public Marque getMarque(){
		return nomMarque;
	}
	
	public List<Option> getOptions(){
		return options;
	}
	
	public Double getPrix(){
		double prixTotal=this.prix;
		for (Option opt:options){
			prixTotal+=opt.getPrix();
		}
		prixTotal+=this.moteur.getPrix();
		return prixTotal;
	}
	
	public void setMoteur(Moteur mot){
		this.moteur=mot;
	}
}
