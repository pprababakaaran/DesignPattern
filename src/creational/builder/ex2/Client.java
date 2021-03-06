package creational.builder.ex2;

public class Client {

	public static void main(String[] args) {
		IPizza pizza = new NonVegPizza();
		IDrinks drinks = new SoftDrinks();
		
		Menu menu = new Menu.Builder().drinks(drinks).pizza(pizza).build();
		
		System.out.println(menu.toString());

	}

}
