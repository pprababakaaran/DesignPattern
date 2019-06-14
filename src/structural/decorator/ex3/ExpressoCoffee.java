package structural.decorator.ex3;

public class ExpressoCoffee implements Coffee {

	@Override
	public void description() {
		System.out.println("Expresso Coffee");
	}

	@Override
	public double cost() {
		return 4;
	}

}
