package com.decorator;

public class Main {

	//Decotator - Used to attach additional responsibilities to class
	public static void main(String args[]){
		HouseDecorator h= HouseFactory.getInstance("pool", "dining");
		System.err.println("Total Cost"+h.getCost());
		
		 h= HouseFactory.getInstance("road", "pooja");
		System.err.println("Total Cost"+h.getCost());
	}
}