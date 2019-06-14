package creational.abstractfactory.ex1;

public class LoanFactory implements AbstractFactory {

	@Override
	public Loan getLoan(String loanType) {
		Loan loan = null;
		switch (loanType) {
		case "home":
			loan = new HomeLoan();
			break;
		case "personal":
			loan = new PersonalLoan();
			break;
		}
		return loan;
	}

	@Override
	public Bank getBank(String bankName) {
		return null;
	}

}
