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

import voiture.Vehicule;

public class Garage implements Serializable{
	private List<Vehicule> voitures;
	private static String nomFichier="garage.txt";
	
	public Garage(){
	    ObjectInputStream ois;
	    try {	
	      //On r�cup�re maintenant les donn�es !
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
	      System.out.println("Pas de fichier trouv� !\nNom recherch� : "+nomFichier+"\nOn part d'une liste vide...");
	      System.err.println("Aucune voiture sauvegard�e !");
	      this.voitures=new LinkedList<Vehicule>(); 
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	public void addVoiture(Vehicule voit){
		this.voitures.add(voit);
		
	    ObjectOutputStream oos;
	    try {	
	      //On r�cup�re maintenant les donn�es !
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
		String str = "";
		str+="****************************\n";
		str+="*  Garage de l'impossible  *\n";
		str+="****************************\n";
		for (Vehicule voit : voitures){
			str+="+ "+voit.toString()+"\n";
		}
		return str;
	}
}
