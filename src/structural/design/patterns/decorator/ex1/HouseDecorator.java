package structural.design.patterns.decorator.ex1;

public class HouseDecorator implements IHouse {
	
	IHouse h;
	
	HouseDecorator(IHouse h){
		this.h=h;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return h.getCost();
	}

}
