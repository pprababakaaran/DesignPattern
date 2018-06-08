package prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employees e1 =new Employees();
		e1.loadEmployeesFromDB();
		
		Employees e2=(Employees)e1.clone();
		e2.getEmployeeList().forEach(e->System.out.println(e));
		

		
		
	}

}
