package creational.abstractfactory.ex1;

public class PersonalLoan extends Loan{

	@Override
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
		
	}

	@Override
	public double calculateLoanPayment(double loanAmount, int years) {
		double emi = (loanAmount*interestRate*years*12)/100;
		return emi;
	}

}
