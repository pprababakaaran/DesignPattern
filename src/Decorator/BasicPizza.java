package Decorator;

public class BasicPizza implements Pizza {

	@Override
	public void description() {
		// TODO Auto-generated method stub
		
		System.out.println("Basic Pizza");

	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4;
	}

}
