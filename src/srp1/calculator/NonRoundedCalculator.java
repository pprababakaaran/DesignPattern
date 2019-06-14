package srp1.calculator;

import java.util.List;

import srp1.shape.NonRoundedShape;
import srp1.shape.Shape;

public class NonRoundedCalculator extends Calculator{
	
	

	public NonRoundedCalculator(List<Shape> nonRoundedShapes) {
		super(nonRoundedShapes);
	}
	
	public int perimeterSum() {
		int sum = 0;
		for(Shape shape : this.shapes) {
			NonRoundedShape nonRoundedShape = (NonRoundedShape) shape;
			sum = sum+nonRoundedShape.getPerimeter();
		}
		return sum;
	}
	
	
	

}
