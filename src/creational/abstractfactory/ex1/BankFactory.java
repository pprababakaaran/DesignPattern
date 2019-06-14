package creational.abstractfactory.ex1;

public class BankFactory implements AbstractFactory {

	@Override
	public Loan getLoan(String loanType) {
		return null;
	}

	@Override
	public Bank getBank(String bankName) {
		Bank bank = null;
		switch (bankName) {
		case "city":
			bank = new CityBank();
			break;
		case "hdfc":
			bank = new HDFCBank();
			break;

		}
		return bank;
	}

}
