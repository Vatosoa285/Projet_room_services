package fr.insa.mas.model;
import java.util.ArrayList;


public class LightSensor {
	private String id; 
	private String location; 
	private LightSensorPayload payload; 


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


	public LightSensorPayload getPayload() {
		return payload;
	}


	public void setPayload(LightSensorPayload payload) {
		this.payload = payload;
	}


	public LightSensor(String id, String location, LightSensorPayload payload) {
		super();
		this.id = id;
		this.location = location;
		this.payload = payload;
	}

	//constructeur vide : sérialisation/désérialisation des objets presence sensors
	public LightSensor() {
		
	}
	
}
