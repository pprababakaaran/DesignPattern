package srp1.shape;

public class Circle implements RoundedShape{
	
	int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}

	@Override
	public int getValue() {
		return radius;
	}

	@Override
	public int getArea() {
		return (int)3.14*radius;
	}

	@Override
	public int getCircumference() {
		return (int) (2*3.14*radius);
	}


}
