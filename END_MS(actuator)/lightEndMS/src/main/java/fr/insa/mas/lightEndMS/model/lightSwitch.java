package fr.insa.mas.lightEndMS.model;

//@XmlRootElement(name = "lightSwitch")

public class lightSwitch {
	private String id; 
	private String location; 
	private int state ;
	

	
	/*public lightSwitch(String id, String location, int state) {
		// TODO Auto-generated constructor stub
		this.id = id; 
		this.location = location;
		this.state = state; 
	}
	*/
	
	
	public lightSwitch(String id, String location) {
		// TODO Auto-generated constructor stub
		this.id = id; 
		this.location = location;
		this.state = 0; 
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	} 
	
	
	
}
