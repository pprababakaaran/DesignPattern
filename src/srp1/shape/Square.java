package srp1.shape;

public class Square implements NonRoundedShape{
	
	int length;
	
	public Square(int length){
		this.length = length;
	}

	@Override
	public int getValue() {
		return length;
	}

	@Override
	public int getArea() {
		return length*length;
	}

	@Override
	public int getPerimeter() {
		return 4*length;
	}

}
