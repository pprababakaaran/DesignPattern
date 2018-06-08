package StrategyPattern;

public class Item {

	private String name;

	private double price;
	
	public Item(String name,double price)
	{
		
		this.setPrice(price);
		this.name=name;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
