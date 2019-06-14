package behavioral.strategy.ex1;

public class OnlinePayment implements PaymentStrategy {
	
	@Override
	public boolean pay(double amount) {
		System.out.println("Online banking payment");
		return true;
	}

}
