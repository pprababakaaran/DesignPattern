package behavioral.observer.ex1;

public class IncidentManager implements Observer{
	
	
	public void createIncident(Incident incident) {
		System.out.println("Creating incident and storing to DB");
		System.out.println("Trigger notifications");
		notifyIncident(incident);
		}

	@Override
	public void notifyIncident(Incident incident) {
		System.out.println("Incident Descirption : "+ incident.getDescription()+ "  Incident Date : "+incident.getDate().toString());
		System.out.println("Sending Email Notification to below email..");
		for(Manager manager: incident.getManagers()) {
			System.out.println(manager.getEmail());
		}
		
	}

}
