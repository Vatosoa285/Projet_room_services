package fr.insa.mas.alarmeEndMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.alarmeEndMS.model.AlarmeSwitch;

@RestController

public class AlarmeEndRessource {

	/*@GetMapping("/AlarmeSwitch")
	public int LightSwitch() {
		return 200; 
	}*/

	@PostMapping("/AlarmeSwitch/switch_on")
	public AlarmeSwitch SwitchStateon(@RequestBody AlarmeSwitch Switch) {
		Switch.setState(1); 
		return Switch; 
	}
	
	@PostMapping("/AlarmeSwitch/switch_off")
	public AlarmeSwitch SwitchStateoff(@RequestBody AlarmeSwitch Switch) {
		Switch.setState(0); 
		return Switch; 
	}
	
	
}
