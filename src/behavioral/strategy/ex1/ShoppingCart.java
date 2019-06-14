package behavioral.strategy.ex1;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> items;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public double totalAmount() {
		double sum = items.parallelStream().mapToDouble(u -> u.getPrice()).sum();
		return sum;
	}

	public void pay(PaymentStrategy payment) {
		payment.pay(totalAmount());
	}

}
