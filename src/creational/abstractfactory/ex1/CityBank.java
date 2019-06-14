package creational.abstractfactory.ex1;

public class CityBank implements Bank{
	
	private String name;
	
	public CityBank() {
		this.name = "City";
	}

	@Override
	public String getBankName() {
		return this.name;
	}

}
