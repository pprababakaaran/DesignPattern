package structural.decorator.ex3;

public class CaramelDecorator extends CoffeeDecorator {

	private Coffee coffee;

	public CaramelDecorator(Coffee coffee) {
		super(coffee);
		this.coffee = coffee;
	}

	@Override
	public void description() {
		coffee.description();
		System.out.println("Caramel");
	}

	@Override
	public double cost() {
		return coffee.cost() + 20;
	}

}
