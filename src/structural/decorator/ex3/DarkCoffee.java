package structural.decorator.ex3;

public class DarkCoffee implements Coffee {

	@Override
	public void description() {
		System.out.println("Dark coffee");
	}

	@Override
	public double cost() {
		return 5;
	}

}
