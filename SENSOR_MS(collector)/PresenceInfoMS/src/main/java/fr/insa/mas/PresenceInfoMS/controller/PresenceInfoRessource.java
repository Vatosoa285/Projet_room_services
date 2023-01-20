/** cette classe représente le microservice (controleur) ***/

package fr.insa.mas.PresenceInfoMS.controller;

import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.PresenceInfoMS.model.PresenceSensor;
import fr.insa.mas.PresenceInfoMS.model.PresenceSensorPayload;

import org.springframework.http.MediaType; 

import java.util.ArrayList;
import java.util.Date;

@RestController 
public class PresenceInfoRessource {
	
	@GetMapping("/presenceSensor") 
	//path access : http://localhost:8080/presenceSensor 
	public String SensorStatus() {
		return "Welcome to presence Sensor microservice"; 
	}

	
	/*cette méthode génère un objet PresenceSensor à partir d'un id*/
	@GetMapping(value="/presenceSensor/{idSensor}") 
	public PresenceSensor infosSensor(@PathVariable String idSensor) {
		String location = "GEI-01"; 
		Date date1 = new Date(); 
		PresenceSensorPayload payload1 = new PresenceSensorPayload(date1,0);
		PresenceSensor presenceSensor=new PresenceSensor(idSensor ,location ,payload1);
		return presenceSensor; 
	}
	
	//** extension du microservice pour afficher la liste de tous les capteurs de présence (au GEI) 
	@GetMapping(value="/sensorList") 
			public ArrayList<PresenceSensor> PresenceSensorList() {
				ArrayList<PresenceSensor> arrayList = new ArrayList<PresenceSensor>();  
				Date date1 = new Date(); 
				PresenceSensorPayload payload1 = new PresenceSensorPayload(date1,0);
				PresenceSensorPayload payload2 = new PresenceSensorPayload(date1,1);
				PresenceSensorPayload payload3 = new PresenceSensorPayload(date1,0);
				PresenceSensorPayload payload4 = new PresenceSensorPayload(date1,0);
			    PresenceSensor sensor1 =new PresenceSensor("S-001","GEI-S01",payload1);
			    PresenceSensor sensor2 =new PresenceSensor("S-002","GEI-S02",payload2);
			    PresenceSensor sensor3 =new PresenceSensor("S-003","GEI-S10",payload3);
			    PresenceSensor sensor4 =new PresenceSensor("S-004","GEI-S101",payload4);		    
			    arrayList.add(sensor1);
			    arrayList.add(sensor2);
				return arrayList; 	
			}
   }

//avancer méthodes pour les publier 
	
	/*
    //le format par défaut utilisé par Spring est du JSON
	//comment faire du XML ? 
	
	//cette méthode génére un objet etudiant à partir d'un id 
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_XML_VALUE) 
	public PresenceSensor xmlInfosStudent(@PathVariable int id) {		
		PresenceSensor presenceSensor=new PresenceSensor(id,"Rosa","Parks");
		return presenceSensor; 
	}
		
	//** extension du microservice pour afficher la liste des étudiants 
		@GetMapping(value="/studentList") 
		public ArrayList<PresenceSensor> PresenceSensorList() {
			ArrayList<PresenceSensor> arrayList = new ArrayList<PresenceSensor>();  	
		    PresenceSensor student1 =new PresenceSensor(1,"Rosa","Parks");
		    PresenceSensor student2 =new PresenceSensor(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
			return arrayList; 
			
		}	
		
	//** extension du microservice pour la possibilité d'ajouter (POST) de nouveaux etudiants 
		@PostMapping(value="/studentList/add") 
		public void addStudent(@RequestBody PresenceSensor stew) {		
			ArrayList<PresenceSensor> arrayList = new ArrayList<PresenceSensor>();  	
		    PresenceSensor student1 =new PresenceSensor(1,"Rosa","Parks");
		    PresenceSensor student2 =new PresenceSensor(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
		    System.out.println("Initial list :"+ arrayList);
		    arrayList.add(stew);
		    System.out.println("The student" + stew + "should be now on the list "+ arrayList);			 
		}
		
		//** extension du microservice pour la possibilité 
		//de mettre à jour les infos d'un étudiant existant 
		
		@PutMapping(value="/studentList/{index}") 
		public void updateInfosStudent(@RequestBody PresenceSensor stew, @PathVariable int index) {		
			ArrayList<PresenceSensor> arrayList = new ArrayList<PresenceSensor>();  	
		    PresenceSensor student1 =new PresenceSensor(1,"Rosa","Parks");
		    PresenceSensor student2 =new PresenceSensor(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
		    System.out.println("Initial list :"+ arrayList.toString());
		    arrayList.set(index,stew);
		    System.out.println("The student indexed at" + index + "should be now updated "+ arrayList);			 
		}
		
		
		//faudra tester dans postman 
} */
