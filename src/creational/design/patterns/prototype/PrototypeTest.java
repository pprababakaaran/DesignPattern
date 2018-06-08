package creational.design.patterns.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(1,"Prabakaran Palanisamy","SSE",10,"Bangalore"); 
		System.out.println(employee.toString());
		
		Employee employeeTemp = (Employee) employee.getClone();
		System.out.println(employeeTemp.toString());
	}

}
