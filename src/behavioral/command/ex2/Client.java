package behavioral.command.ex2;

public class Client {
	public static void main(String[] args) {

		Chef chef = new Chef();
		Order order = new Order(chef, "Salad");
		
		Waiter waiter = new Waiter(order);
		waiter.placeOrder();

		order = new Order(chef, "Cake");
		waiter = new Waiter(order);
		waiter.placeOrder();

	}
}
