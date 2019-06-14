package structural.bridge.ex1;

public class Client {

	//Reference: https://www.geeksforgeeks.org/bridge-design-pattern/
	public static void main(String[] args) {
		Vehicle car = new Car(new ProduceWorkshop(), new AssembleWorkshop());
		car.manufacture();
		Vehicle bike = new Bike(new ProduceWorkshop(), new AssembleWorkshop());
		bike.manufacture();
	}

}
