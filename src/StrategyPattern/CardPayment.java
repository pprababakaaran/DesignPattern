package StrategyPattern;

public class CardPayment implements PaymentStrategy {
	
	String cardno;
	String name;
	public CardPayment(String cardno,String name)
	{
		
	}
	

	@Override
	public boolean pay(double amount) {
		
		System.out.println("Payment via card"+amount);
		// TODO Auto-generated method stub
		return false;
	}

}
