package behavioral.command.ex1;

public class Light {
	
	private boolean on;
	
	public void switchOn() {
		System.out.println("Light is on");
		this.on = true;
	}
	
	public void switchOff() {
		System.out.println("Light is off");
		this.on = false;
		
	}

}
