package behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Incident implements Notifier{
	
	private List<Manager> managers = new ArrayList<>();
	private String description;
	private Date date;
	
	public Incident(String description, Date date) {
		this.description = description;
		this.date = date;
	}

	@Override
	public void register(Manager manager) {
		managers.add(manager);
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
