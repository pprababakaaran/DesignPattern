package structural.decorator.ex3;

public class Client {

	public static void main(String[] args) {

		Coffee coffee = CoffeeFactory.getInstance("Dark", "Caramel");
		System.out.println(coffee.cost());
		
		coffee = CoffeeFactory.getInstance("Expresso", "Chocolate");
		System.out.println(coffee.cost());
		
		coffee = CoffeeFactory.getInstance("", "");
		System.out.println(coffee.cost());
		coffee.description();
	}

}
