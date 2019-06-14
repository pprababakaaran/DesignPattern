package srp1.calculator;

import java.util.ArrayList;
import java.util.List;

import srp1.shape.Circle;
import srp1.shape.NonRoundedShape;
import srp1.shape.RoundedShape;
import srp1.shape.Shape;
import srp1.shape.Square;

public class Client {

	public static void main(String args[]) {
		RoundedShape circle = new Circle(3);
		NonRoundedShape square= new Square(5);
		
		List<Shape> roundedShapes = new ArrayList<>();
		roundedShapes.add(circle);

		List<Shape> nonRoundedShapes = new ArrayList<>();
		nonRoundedShapes.add(square);
		
		NonRoundedCalculator nonRoundedCalculator = new NonRoundedCalculator(nonRoundedShapes);
		RoundedCalculator roundedCalculator = new RoundedCalculator(roundedShapes);

			
		AreaOutput roundedShapeOutput = new AreaOutput(roundedCalculator.circumferenceSum());
		roundedShapeOutput.outputHTML();
		roundedShapeOutput.outputJSON();
		
		AreaOutput roundedShapeOutput1 = new AreaOutput(roundedCalculator.areaSum());
		roundedShapeOutput1.outputHTML();
		roundedShapeOutput1.outputJSON();
		
		AreaOutput nonRoundedShapeOutput = new AreaOutput(nonRoundedCalculator.perimeterSum());
		nonRoundedShapeOutput.outputHTML();
		nonRoundedShapeOutput.outputJSON();
		
		AreaOutput nonRoundedShapeOutput1 = new AreaOutput(nonRoundedCalculator.areaSum());
		nonRoundedShapeOutput1.outputHTML();
		nonRoundedShapeOutput1.outputJSON();
	}
}
