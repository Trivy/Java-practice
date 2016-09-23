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
		output += "Mon nom est "+this.nom;
		output += "\nMa marque est "+this.nomMarque;
		output += "\nMon prix est "+this.prix;
		output += "\nJ'ai "+options.size()+ " option(s) :";
		for (int i=0; i< options.size(); i++){
			output += "\n\t_ "+options.get(i).toString();
		}
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
		return prix;
	}
	
	void setMoteur(Moteur mot){
		this.moteur=mot;
	}
}
