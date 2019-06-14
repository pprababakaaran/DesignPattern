package creational.abstractfactory.ex1;

public abstract class Loan {
	protected float interestRate;
	
	public abstract void setInterestRate(float interestRate);
	public abstract double calculateLoanPayment(double loanAmount, int years);
	
}
