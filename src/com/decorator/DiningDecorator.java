package com.decorator;

public class DiningDecorator extends HouseDecorator {


	public DiningDecorator(IHouse h){
		super(h);
		
	}
	
	public int getCost(){
		return super.getCost() + 20;
	}

}
