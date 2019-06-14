package behavioral.template.ex1;

public class Manager extends Worker{

	@Override
	public void work() {
		System.out.println("Manager is working");
	}
	
	public void relax() {
		System.out.println("Manager is relaxing");
	}

}
