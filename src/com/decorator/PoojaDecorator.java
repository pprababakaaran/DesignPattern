package com.decorator;

public class PoojaDecorator extends HouseDecorator {

	public PoojaDecorator(IHouse h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	public int getCost(){
		return super.getCost()+30;
	}	

}
