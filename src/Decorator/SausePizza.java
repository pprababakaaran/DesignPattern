package Decorator;

public class SausePizza extends ToppingDecorator {

	public SausePizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		


	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+10;
	}

}
