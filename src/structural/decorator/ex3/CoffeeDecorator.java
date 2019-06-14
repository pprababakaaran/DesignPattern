package structural.decorator.ex3;

public abstract class CoffeeDecorator implements Coffee {

	private Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void description() {
		coffee.description();
	}

	@Override
	public double cost() {
		return coffee.cost() + 5;
	}

}
