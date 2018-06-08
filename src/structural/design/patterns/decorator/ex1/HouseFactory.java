package structural.design.patterns.decorator.ex1;

public class HouseFactory {
	
	public static HouseDecorator getInstance(String houseType,String Decorator){
		
		HouseDecorator h=null;
		
		if(houseType.equalsIgnoreCase("pool") && Decorator.equalsIgnoreCase("dining")){
			h= new DiningDecorator(new PoolHouse());
		}else if(houseType.equalsIgnoreCase("road") && Decorator.equalsIgnoreCase("pooja")){
			h= new PoojaDecorator(new RoadHouse());
		}else {
			h=new HouseDecorator(new PoolHouse());
		}
		return h;
	}

}
