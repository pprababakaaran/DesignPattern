package structural.bridge.ex1;

public class ProduceWorkshop implements Workshop {
	
	@Override
	public void work() {
		System.out.print("Produced");
	}

}
