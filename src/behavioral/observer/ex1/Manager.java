package behavioral.observer.ex1;

public class Manager {
	
	private String id;
	private String email;
	
	
	public Manager(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
