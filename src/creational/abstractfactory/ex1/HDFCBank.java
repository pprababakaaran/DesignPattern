package creational.abstractfactory.ex1;

public class HDFCBank implements Bank{
	
	private String name;
	
	public HDFCBank() {
		this.name = "HDFC";
	}

	@Override
	public String getBankName() {
		return this.name;
	}

}
