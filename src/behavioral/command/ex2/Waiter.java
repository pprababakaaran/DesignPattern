package behavioral.command.ex2;

public class Waiter {

	private Order order;

	public Waiter(Order ord) {
		this.order = ord;
	}

	public void placeOrder() {
		this.order.execute();
	}

}
