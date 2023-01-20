package fr.insa.mas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PresenceSensorPayload {
	
	private Date timestamp; //l'heure
	private int status ; //l'état du capteur : 1 : présence détectée , 0 pas de présence 
	//ou sinon type énuméré si plus d'états que ça 
	
	
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
	public PresenceSensorPayload(Date timestamp, int status) {
		super();
		this.timestamp = timestamp;
		this.status = status;
	} 	
	
	public PresenceSensorPayload() {}
}
