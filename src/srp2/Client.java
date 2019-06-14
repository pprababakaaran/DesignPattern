package srp2;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	
	public static void main(String args[]) {
		
		Car bmw = new BMW();
		Car audi = new Audi();
		Car lambogani = new Lambogani();
		List<Car> cars = new ArrayList<>();
		
		cars.add(audi);
		cars.add(bmw);
		cars.add(lambogani);
		
		DriverProfile siva = new DriverProfile(cars);
		
		System.out.println(siva.canDrive("BMW"));
		System.out.println(siva.canDrive("Lambogani"));
	}

}
