package structural.decorator.ex2;

public class Client {

	public static void main(String[] args) {

		Pizza pizza = new CheesePizza(new SausePizza(new BasicPizza()));
		System.out.println(pizza.cost());
	}

}
