package creational.prototype.shallowcopy.ex1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address("12", "HSR Layout", "Bangalore");
		Employee employee = new Employee(1, "Prabakaran Palanisamy", "SSE", 10, address);
		System.out.println(employee.toString());

		Employee employeeTemp = employee.clone();
		System.out.println(employeeTemp.toString());

		System.out.println("Note: Employee and Address class equals method is not overwritten");
		System.out.println("==================================================================");
		System.out.println("Is Address object shallow copy? :" + (employee.getAddress() == employeeTemp.getAddress()));
		System.out.println("Is Employee object is same ?:"+(employee == employeeTemp));


	}

}
