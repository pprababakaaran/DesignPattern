package creational.prototype.deepcopy.ex1;

public class Address implements Cloneable{
	
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
	
	public Address clone() {
		try {
			return (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
