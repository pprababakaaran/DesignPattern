package StrategyPattern;

public class OnlinePayment implements PaymentStrategy {

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Online banking payment");
		return false;
	}

}
