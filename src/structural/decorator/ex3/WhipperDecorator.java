package structural.decorator.ex3;

public class WhipperDecorator extends CoffeeDecorator {

	private Coffee coffee;

	public WhipperDecorator(Coffee coffee) {
		super(coffee);
		this.coffee = coffee;
	}

	@Override
	public void description() {
		coffee.description();
		System.out.println("Whipper");
	}

	@Override
	public double cost() {
		return coffee.cost() + 10;
	}

}
