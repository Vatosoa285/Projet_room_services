package fr.insa.mas.lightEndMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.lightEndMS.model.lightSwitch;

@RestController

public class LightEndRessource {

	/*@GetMapping("/lightSwitch")
	public int LightSwitch() {
		return 200; 
	}*/

	@PostMapping("/lightSwitch/switch_on")
	public lightSwitch SwitchStateon(@RequestBody lightSwitch Switch) {
		Switch.setState(1); 
		return Switch; 
	}
	
	@PostMapping("/lightSwitch/switch_off")
	public lightSwitch SwitchStateoff(@RequestBody lightSwitch Switch) {
		Switch.setState(0); 
		return Switch; 
	}
	
	
	
}
