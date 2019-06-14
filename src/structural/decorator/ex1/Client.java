package structural.decorator.ex1;

public class Client {

	//Decotator - Used to attach additional responsibilities to class
	public static void main(String args[]){
		HouseDecorator h= HouseFactory.getInstance("pool", "dining");
		System.err.println("Total Cost"+h.getCost());
		
		 h= HouseFactory.getInstance("road", "pooja");
		System.err.println("Total Cost"+h.getCost());
	}
}