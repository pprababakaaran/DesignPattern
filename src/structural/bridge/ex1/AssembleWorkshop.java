package structural.bridge.ex1;

public class AssembleWorkshop implements Workshop {
	@Override
	public void work() {
		System.out.print(" And");
		System.out.println(" Assembled.");
	}

}
