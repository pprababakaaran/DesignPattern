package prototype;

import java.util.ArrayList;

public class Employees implements Cloneable{
	private ArrayList<String> employeeList;
	
	public Employees()
	{
		employeeList= new ArrayList<String>();
	}
	
	public Employees(ArrayList<String> employeeList)
	{
		this.employeeList= employeeList;
	}
	
	public void loadEmployeesFromDB()
	{
		//write a logic
		employeeList.add("Adarsh");
		employeeList.add("aksha");
		employeeList.add("Praba");
		
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{

		
		ArrayList<String> temp= new ArrayList<String>();
		
		employeeList.forEach(e->temp.add(e));
		
		
		return new Employees(temp);
		
	}

	public ArrayList<String> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<String> employeeList) {
		this.employeeList = employeeList;
	}

}
