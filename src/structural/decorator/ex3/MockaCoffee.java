package structural.decorator.ex3;

public class MockaCoffee implements Coffee {

	@Override
	public void description() {
		System.out.println("Mocka Coffee");
	}

	@Override
	public double cost() {
		return 10;
	}

}
