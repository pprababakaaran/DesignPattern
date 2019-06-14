package structural.bridge.ex2;

public class Bike extends Vehicle {
	public Bike(Color color) {
		super(color);
	}

	@Override
	public void manufacture() {
		System.out.println("=====================================================");
		System.out.println(color.paintColor() +" color Bike getting manufactured");
		System.out.println("=====================================================");
		this.workshops.forEach(workshop->workshop.work());
	}

}
