package behavioral.observer.ex1;

import java.util.Date;

public class Client {
	
	public static void main(String args[]) {
		
		Manager manager = new Manager("123", "ABC@gmail.com");
		Manager manager1 = new Manager("123", "XYZ@gmail.com");
		
		Incident incident = new Incident("Fire", new Date());
		incident.register(manager1);
		incident.register(manager);

		IncidentManager incidentController = new IncidentManager();
		incidentController.createIncident(incident);
		
	}

}
