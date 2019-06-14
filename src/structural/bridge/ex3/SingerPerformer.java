package structural.bridge.ex3;

public class SingerPerformer extends Performer{
	
	Location location;
	
	public SingerPerformer(Location location){
		this.location = location;
	}

	@Override
	void performsOn(Location location) {
		System.out.println("Singer Performs in "+location.performanceLocation());	
	}

}
