package srp1.calculator;

import java.util.List;

import srp1.shape.Shape;

public abstract class Calculator {
	
	List<Shape> shapes;
	

	public Calculator(List<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public int areaSum() {
		int sum = 0;
		for(Shape shape : shapes) {
			sum = sum+shape.getArea();
		}
		return sum;
	}

}
