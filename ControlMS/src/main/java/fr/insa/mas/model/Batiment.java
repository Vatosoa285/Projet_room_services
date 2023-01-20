package fr.insa.mas.model;
import java.util.*;

public class Batiment {
	List<salle> salles;
	int nbSalles;
	
	public Batiment(int nbSalles) {
		this.nbSalles=nbSalles;
		this.salles = new ArrayList<salle>();
	for (int i=0;i<nbSalles;i++) {
		salles.add(new salle(i,0,0));
	}
	}
	
	public Batiment() {}
	
	public int getnbSalles() {
		return this.nbSalles;
	}
	
	public List<salle> getSalles(){
		return this.salles;
	}
}
