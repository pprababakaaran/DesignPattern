package creational.prototype.shallowcopy.ex1;

public class Address {
	
	private String doorNo;
	private String street;
	private String district;
	
	
	public Address(String doorNo, String street, String district) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.district = district;
	}


	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", district=" + district + "]";
	}
	
	

}
