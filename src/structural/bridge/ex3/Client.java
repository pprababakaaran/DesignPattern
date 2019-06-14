package structural.bridge.ex3;

public class Client {

	//Reference: https://www.geeksforgeeks.org/bridge-design-pattern/
	public static void main(String[] args) {
		Location privateLocation = new PrivateLocation();
		Performer dancer = new DancePerformer(privateLocation);
		dancer.performsOn(privateLocation);

		Location stageLocation = new StageLocation();
		Performer singer = new SingerPerformer(stageLocation);
		singer.performsOn(stageLocation);
	}

}
