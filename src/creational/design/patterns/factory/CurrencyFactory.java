package creational.design.patterns.factory;

public class CurrencyFactory {

	public static ICurrency getCountryCurrency(String country) 
	{
		ICurrency currency = null;
		switch (country) {
		case "India":
			currency = new IndianCurrency();
			break;
		case "US":
			currency = new USCurrency();
			break;
		case "Singapore":
			currency = new SingaporeCurrency();
			break;
		default:
			break;
		}
		
		return currency;

	}

}
