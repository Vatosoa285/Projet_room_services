package fr.insa.mas.LightInfoMS.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PresenceSensorList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date1 = new Date(); 
		
		LightSensorPayload payload1 = new LightSensorPayload(date1,0);
		
		Date date2 = new Date(); 
		LightSensorPayload payload2 = new LightSensorPayload(date2,1);
		
		ArrayList<LightSensor> arrayList = new ArrayList<LightSensor>();  
		
	    LightSensor sensor1 = new LightSensor("LS-001","GEI1-12", payload1);
	    LightSensor sensor2 =new LightSensor("LS-002","GEI1-01", payload2);
	    arrayList.add(sensor1);
	    arrayList.add(sensor2);
		System.out.println("ArrayList  : " + arrayList);
	}

}
