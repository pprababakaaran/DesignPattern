package creational.abstractfactory.ex1;

public interface AbstractFactory {
	
	Loan getLoan(String loanType);
	Bank getBank(String bankName);
}
