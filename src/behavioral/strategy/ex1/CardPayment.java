package behavioral.strategy.ex1;

public class CardPayment implements PaymentStrategy {

	private String cardno;
	private String name;

	public CardPayment(String cardno, String name) {
		this.cardno = cardno;
		this.name = name;
	}

	@Override
	public boolean pay(double amount) {

		System.out.println("Payment via card : " + amount);
		return true;
	}

}
