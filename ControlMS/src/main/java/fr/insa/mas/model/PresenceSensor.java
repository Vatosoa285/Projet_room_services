package fr.insa.mas.model;

import java.util.ArrayList;



//la ligne ci-dessous permet la sérialisation en XML de l'objet PresenceSensor 
public class PresenceSensor {
	private String id; 
	private String location; 
	private PresenceSensorPayload payload; 


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public PresenceSensorPayload getPayload() {
		return payload;
	}


	public void setPayload(PresenceSensorPayload payload) {
		this.payload = payload;
	}


	public PresenceSensor(String id, String location, PresenceSensorPayload payload) {
		super();
		this.id = id;
		this.location = location;
		this.payload = payload;
	}

	//constructeur vide : sérialisation/désérialisation des objets presence sensors
	public PresenceSensor() {
		
	}


	
	
	
	
	
}


	
	
	
	
	
