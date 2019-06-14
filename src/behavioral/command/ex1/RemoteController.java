package behavioral.command.ex1;

public class RemoteController {
	
	Command command;
	
	public RemoteController(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}

}
