package structural.decorator.ex3;

public class CoffeeFactory {
	
	public static CoffeeDecorator getInstance(String coffee,String addon){
		
		CoffeeDecorator kofi=null;
		
		if(coffee.equalsIgnoreCase("Dark") && addon.equalsIgnoreCase("Caramel")){
			kofi= new CaramelDecorator(new DarkCoffee());
		}else if(coffee.equalsIgnoreCase("Expresso") && addon.equalsIgnoreCase("Chocolate")){
			kofi= new ChocolateDecorator(new ExpressoCoffee());
		}else {
			kofi=new WhipperDecorator(new ChocolateDecorator(new CaramelDecorator(new MockaCoffee())));
		}
		return kofi;
	}

}
