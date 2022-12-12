package fr.insa.mas.studentManagementMS.model;

import javax.xml.bind.annotation.XmlRootElement;

//la ligne ci-dessous permet la sérialisation en XML de l'objet Student 
@XmlRootElement (name = "Student")
public class Student {
	private int id; 
	private String LastName; 
	private String firstName;
	
	//contructeur
	public Student(int id, String lastName, String firstName) {
		super();
		this.id = id;
		LastName = lastName;
		this.firstName = firstName;
	}
	
	//constructeur vide : sérialisation/désérialisation des objets Students
	public Student() {
		
	}
	
	
	//getters and setters 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} 
	
	
	
	
}
