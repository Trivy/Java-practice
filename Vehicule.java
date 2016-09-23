package garage;

import java.io.Serializable;
import java.util.List;

public class Vehicule implements Serializable{
	Double prix;
	String nom;
	List<Option> options;
	Marque nomMarque;
	Moteur moteur;
	
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
	
	void addOption(Option opt){
		options.add(opt);
	}
	
	Marque getMarque(){
		return nomMarque;
	}
	
	List<Option> getOptions(){
		return options;
	}
	
	Double getPrix(){
		double prixTotal=this.prix;
		for (Option opt:options){
			prixTotal+=opt.getPrix();
		}
		prixTotal+=this.moteur.getPrix();
		return prixTotal;
	}
	
	void setMoteur(Moteur mot){
		this.moteur=mot;
	}
}
