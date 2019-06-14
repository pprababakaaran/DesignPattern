package creational.abstractfactory.ex1;

public class AbstractCreator {

	public static AbstractFactory getFactory(String factoryName) {
		AbstractFactory abstractFactory = null;
		switch (factoryName) {
		case "bank":
			abstractFactory = new BankFactory();
			break;
		case "loan":
			abstractFactory = new LoanFactory();
			break;
		}

		return abstractFactory;
	}

}
