package structural.bridge.ex3;

public class DancePerformer extends Performer{
	
	Location location;
	
	public DancePerformer(Location location){
		this.location = location;
	}

	@Override
	void performsOn(Location location) {
		System.out.println("Dancer Performs in "+location.performanceLocation());	
	}

}
