package behavioral.command.ex1;

public class Client {

	public static void main(String[] args) {

		Light light = new Light();
		Command offCommand = new LightOffCommand(light);
		RemoteController controller = new RemoteController(offCommand);
		controller.pressButton();
		
		Command onCommand = new LightOnCommand(light);
		controller = new RemoteController(onCommand);
		controller.pressButton();
		
	}

}
