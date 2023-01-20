package fr.insa.mas.ControlMS.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


import fr.insa.mas.model.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;

@RestController
@RequestMapping("/Controler")
public class Control {
	
    @Autowired
	private RestTemplate restTemplate ; 
	Batiment bat = new Batiment(2);		
	
	
	//requête qui récupère les infos de présence 
	@RequestMapping("/updatePresence")
	public int updatePresence() {				
		ArrayList<PresenceSensor> presence= new ArrayList<PresenceSensor>();
		//presence = restTemplate.getForObject("http://localhost:8083/sensorList", ArrayList.class);
		System.out.println("bob");
		ResponseEntity<ArrayList<PresenceSensor>> presenceresponse = restTemplate.exchange(
"http://presenceSensorList/sensorList", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<ArrayList<PresenceSensor>>() {});
		System.out.println("bob2");
		System.out.println(presenceresponse);
		presence=presenceresponse.getBody();
		for (int i=0;i<presence.size();i++) {
			
			int buff = presence.get(i).getPayload().getStatus();
			bat.getSalles().get(i).setpresenceState(buff);
		}
		return bat.getSalles().get(0).getpresenceState();
	}
	
	@RequestMapping("/updateLights")
	public int updateLights() {				
		ArrayList<LightSensor> light= new ArrayList<LightSensor>();
		//presence = restTemplate.getForObject("http://localhost:8084/sensorList", ArrayList.class);
		System.out.println("bob");
		ResponseEntity<ArrayList<LightSensor>> lightresponse = restTemplate.exchange(
               "http://LightInfoMS/lightSensorList", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<ArrayList<LightSensor>>() {});
		System.out.println("bob2");
		System.out.println(lightresponse);
		light=lightresponse.getBody();
		for (int i=0;i<light.size();i++) {
			
			//int buff = light.get(i).getPayload().getStatus();
			//bat.getSalles().get(i).setlightState(buff);
		}
		return bat.getSalles().get(0).getlightState();
	}
	
	
	@RequestMapping("/alerte")
	public int alerte() {
		for (int i=0;i<bat.getnbSalles();i++){
			System.out.println(bat.getSalles().get(i).getpresenceState());
			if (bat.getSalles().get(i).getpresenceState() == 1) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H");
				System.out.println(Integer.parseInt(dtf.format(LocalDateTime.now())));
				if (Integer.parseInt(dtf.format(LocalDateTime.now()))>22){
						AlarmeSwitch info = new AlarmeSwitch(Integer.toString(i),Integer.toString(i));
						restTemplate.put("http://alarmeEndMS/alerte_on", info);
						return 0;}
			}
		}
		return 1;	//public void 
	}
	
	@RequestMapping("/lumiere")
	public int lumiere() {
		for (int i=0;i<bat.getnbSalles();i++){
			if ((bat.getSalles().get(i).getpresenceState() == 1) && (bat.getSalles().get(i).getlightState() == 0)) {
				lightSwitch info = new lightSwitch(Integer.toString(i),Integer.toString(i));
				restTemplate.put("http://lightEndMS/lightSwitch/switch_on", info);		
			}
			if ((bat.getSalles().get(i).getpresenceState() == 0) && (bat.getSalles().get(i).getlightState() == 1)) {
				lightSwitch info = new lightSwitch(Integer.toString(i),Integer.toString(i));
				restTemplate.put("http://lightEndMS/lightSwitch/switch_off", info);		
			}
		}
		
		return 1;
	}
}
