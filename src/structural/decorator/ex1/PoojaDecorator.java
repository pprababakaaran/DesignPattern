package structural.decorator.ex1;

public class PoojaDecorator extends HouseDecorator {

	public PoojaDecorator(IHouse h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	public int getCost(){
		return super.getCost()+30;
	}	

}
