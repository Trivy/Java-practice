package garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Garage implements Serializable{
	List<Vehicule> voitures;
	static String nomFichier="garage.txt";
	
	public Garage(){
	    ObjectInputStream ois;
	    try {	
	      //On récupère maintenant les données !
	      ois = new ObjectInputStream(
	              new BufferedInputStream(
	                new FileInputStream(
	                  new File(nomFichier))));
	            
	      try {
	        voitures = (List<Vehicule>)ois.readObject();
	      } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	      }
		  
	    ois.close();
	        	
	    } catch (FileNotFoundException e) {
	      System.out.println("Pas de fichier trouvé !\nNom recherché : "+nomFichier+"\nOn part d'une liste vide...");
	      this.voitures=new LinkedList<Vehicule>(); 
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	public void addVoiture(Vehicule voit){
		this.voitures.add(voit);
		
	    ObjectOutputStream oos;
	    try {	
	      //On récupère maintenant les données !
	      oos = new ObjectOutputStream(
	              new BufferedOutputStream(
	                new FileOutputStream(
	                  new File(nomFichier))));
	            
	      try {
	        oos.writeObject(voitures);
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
		
	      oos.close();
	        	
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	public String toString(){
		String str = "Il s'agit d'un garage avec "+voitures.size()+" véhicules, à savoir :";
		for (Vehicule voit : voitures){
			str+="\n";
			str+="\n\t (*) "+voit.toString();
		}
		return str;
	}
}
