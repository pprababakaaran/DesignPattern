package StrategyPattern;

public class StrategyTest {
	
	public static void main(String args[])
	{
		
		
		
		StrategyMaker maker= new StrategyMaker(new MultiplyStrategy());
		;
		
		System.out.println(maker.performOperation(2,9));
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1= new Item("Paste", 90);
		Item item2= new Item("Fruits",20);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		PaymentStrategy payment= new CardPayment("262662662","Adarsh");
		
		cart.pay(payment);
		
		
		
		
	}

}
