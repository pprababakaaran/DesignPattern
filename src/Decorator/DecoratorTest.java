package Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Pizza pizza= new CheesePizza( new SausePizza(new BasicPizza()));
		
	System.out.println(pizza.cost());
		// TODO Auto-generated method stub
	
	

	}
	
	
	
	
	

}