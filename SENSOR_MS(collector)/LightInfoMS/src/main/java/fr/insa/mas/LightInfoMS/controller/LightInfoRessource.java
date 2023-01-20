/** cette classe représente le microservice (controleur) ***/

package fr.insa.mas.LightInfoMS.controller;

import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.LightInfoMS.model.LightSensor;
import fr.insa.mas.LightInfoMS.model.LightSensorPayload;

import org.springframework.http.MediaType; 

import java.util.ArrayList;
import java.util.Date;

@RestController 
public class LightInfoRessource {
	
	@GetMapping("/lightSensor") 
	//path access : http://localhost:8080/lightensor 
	public String SensorStatus() {
		return "Welcome to light sensor microservice"; 
	}

	
	/*cette méthode génère un objet LightSensor à partir d'un id*/
	@GetMapping(value="/LightSensor/{idSensor}") 
	public LightSensor infosSensor(@PathVariable String idSensor) {
		String location = "GEI-01"; 
		Date date1 = new Date(); 
		LightSensorPayload payload1 = new LightSensorPayload(date1,0);
		LightSensor lightSensor=new LightSensor(idSensor ,location ,payload1);
		return lightSensor; 
	}
	
	//** extension du microservice pour afficher la liste de tous les capteurs de lumière au GEI) 
	@GetMapping(value="/lightSensorList") 
			public ArrayList<LightSensor> PresenceSensorList() {
				ArrayList<LightSensor> arrayList = new ArrayList<LightSensor>();  
				Date date1 = new Date(); 
				LightSensorPayload payload1 = new LightSensorPayload(date1,0);
				LightSensorPayload payload2 = new LightSensorPayload(date1,1);
				LightSensorPayload payload3 = new LightSensorPayload(date1,0);
				LightSensorPayload payload4 = new LightSensorPayload(date1,0);
			    LightSensor sensor1 =new LightSensor("LS-001","GEI-S01",payload1);
			    LightSensor sensor2 =new LightSensor("LS-002","GEI-S02",payload2);
			    LightSensor sensor3 =new LightSensor("LS-003","GEI-S10",payload3);
			    LightSensor sensor4 =new LightSensor("LS-004","GEI-S101",payload4);
			    arrayList.add(sensor1);
			    arrayList.add(sensor2);
				return arrayList; 	
			}
   }
	

