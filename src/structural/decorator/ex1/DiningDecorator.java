package structural.decorator.ex1;

public class DiningDecorator extends HouseDecorator {


	public DiningDecorator(IHouse h){
		super(h);
		
	}
	
	public int getCost(){
		return super.getCost() + 20;
	}

}
