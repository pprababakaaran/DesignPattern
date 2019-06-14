package srp2;

import java.util.List;

public class DriverProfile {
	
	List<Car> experiencedCars;
	
	public DriverProfile(List<Car> cars) {
		this.experiencedCars = cars;
	}
	
	
	public boolean canDrive(String name) {
		for(Car car : experiencedCars) {
			if(car.name().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
		
	}
	
	public List<Car> getExperiencedCars() {
		return experiencedCars;
	}
	

}
