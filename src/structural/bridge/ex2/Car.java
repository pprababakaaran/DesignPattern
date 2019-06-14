package structural.bridge.ex2;

public class Car extends Vehicle {
	public Car(Color color) {
		super(color);
	}

	@Override
	public void manufacture() {
		System.out.println("=====================================================");
		System.out.println(color.paintColor() +" color Car getting manufactured");
		System.out.println("=====================================================");
		this.workshops.forEach(workshop->workshop.work());
	}

}
