package structural.decorator.ex3;

public class ChocolateDecorator extends CoffeeDecorator {

	private Coffee coffee;

	public ChocolateDecorator(Coffee coffee) {
		super(coffee);
		this.coffee = coffee;
	}

	@Override
	public void description() {
		coffee.description();
		System.out.println("Chocolate");
	}

	@Override
	public double cost() {
		return coffee.cost() + 30;
	}

}
