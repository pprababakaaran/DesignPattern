package srp1.calculator;

import java.util.List;

import srp1.shape.RoundedShape;
import srp1.shape.Shape;

public class RoundedCalculator extends Calculator{
	

	public RoundedCalculator(List<Shape> shapes) {
		super(shapes);
	}
	
	public int circumferenceSum() {
		int sum = 0;
		for(Shape shape : this.shapes) {
			RoundedShape roundedShape = (RoundedShape) shape;
			sum = sum+roundedShape.getCircumference();
		}
		return sum;
	}
	

}
