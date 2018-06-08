package creational.design.patterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICurrency currency = CurrencyFactory.getCountryCurrency("India");
		String curencyVal = currency.getSymbol();
		System.out.println(curencyVal);

	}

}
