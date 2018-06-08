package Decorator;

public class CheesePizza extends ToppingDecorator {

	public CheesePizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
		System.out.println("constructing cheese Pizza");
	}
	
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		


	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+4;
	}
	

}
