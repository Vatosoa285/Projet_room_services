package fr.insa.mas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LightSensorPayload {
	
	private Date timestamp; //l'heure
	private int status ; //l'état du capteur : 1 : allumée , 2 éteinte 
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public LightSensorPayload(Date timestamp, int status) {
		this.timestamp = timestamp;
		this.status = status;
	} 	
	
	public LightSensorPayload() {};
	
}