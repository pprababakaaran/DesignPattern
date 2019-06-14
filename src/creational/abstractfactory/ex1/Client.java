package creational.abstractfactory.ex1;

public class Client {

	public static void main(String[] args) {

		AbstractFactory bankFactory = AbstractCreator.getFactory("bank");
		Bank hdfc = bankFactory.getBank("hdfc");
		System.out.println(hdfc.getBankName());
		
		
		AbstractFactory loanFactory = AbstractCreator.getFactory("loan");
		Loan home = loanFactory.getLoan("home");
		home.setInterestRate(10);
		double emi = home.calculateLoanPayment(10000, 1);
		System.out.println("Home Loan EMI : "+emi);
		
		Loan personal = loanFactory.getLoan("personal");
		personal.setInterestRate(11);
		System.out.println("Personal Loan EMI: "+ personal.calculateLoanPayment(20000, 2));
	}

}
