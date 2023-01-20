package fr.insa.mas.model;

public class salle {
	private int id;
	private int lightState;
	private int presenceState;
	
	public salle(int id,int light,int presence) {
		this.id=id;
		this.lightState=light;
		this.presenceState=presence;
	}
	
	public int getlightState() {
		return this.lightState;
	}
	
	public int getpresenceState() {
		return this.presenceState;
	}
	
	public void setlightState(int light) {
		this.lightState=light;
	}
	
	public void setpresenceState(int presence) {
		this.presenceState=presence;
	}
	
	public void setId(int id) {this.id=id;}
	
	public int getId() {
		return this.id;
	}

}
