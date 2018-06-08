package Decorator;

public abstract class ToppingDecorator implements Pizza {
	
	private Pizza pizza;
	
	public ToppingDecorator(Pizza pizza)
	{
		
		this.pizza=pizza;
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		
	pizza.description();

	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost();
	}
	
	
	
	

}
