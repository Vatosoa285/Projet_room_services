package fr.insa.mas.PresenceInfoMS.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PresenceSensorList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date1 = new Date(); 
		
		PresenceSensorPayload payload1 = new PresenceSensorPayload(date1,0);
		
		Date date2 = new Date(); 
		PresenceSensorPayload payload2 = new PresenceSensorPayload(date2,1);
		
		ArrayList<PresenceSensor> arrayList = new ArrayList<PresenceSensor>();  
		
	    PresenceSensor sensor1 = new PresenceSensor("PS-001","GEI1-12", payload1);
	    PresenceSensor sensor2 =new PresenceSensor("PS-002","GEI1-01", payload2);
	    arrayList.add(sensor1);
	    arrayList.add(sensor2);
		System.out.println("ArrayList  : " + arrayList);
	}

}
