package structural.composite.ex1;

public class Client {
	public static void main(String[] args) {
		Developer dev1 = new Developer(100, "Prabakaran", "Senior Developer");
		Developer dev2 = new Developer(101, "Amabar", "Developer");
		
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(dev1);
		engDirectory.addEmployee(dev2);

		Manager man1 = new Manager(200, "Vinoth", "Engineering Manager");
		Manager man2 = new Manager(201, "Johnson", "People Manager");

		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);

		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetails();
	}
}
