package creational.prototype.deepcopy.ex1;

public class Employee implements Cloneable {

	private int id;
	private String name, designation;
	private double salary;
	private Address address;

	public Employee() {
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");

	}

	public Employee(int id, String name, String designation, double salary, Address address) {

		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	public Employee clone() {
		try {
			Employee emp = (Employee) super.clone();
			emp.address = address.clone();
			return emp;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Address getAddress() {
		return address;
	}

}
