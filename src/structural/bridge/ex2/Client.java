package structural.bridge.ex2;

public class Client {

	//Reference: https://www.geeksforgeeks.org/bridge-design-pattern/
	public static void main(String[] args) {
		Vehicle car = new Car(new BlueColor());
		car.joinWorkshop(new ProduceWorkshop());
		car.joinWorkshop(new AssembleWorkshop());
		car.manufacture();
		
		
		Vehicle bike = new Bike(new RedColor());
		bike.joinWorkshop(new ProduceWorkshop());
		bike.joinWorkshop(new AssembleWorkshop());
		bike.joinWorkshop(new TestWorkshop());
		bike.manufacture();
	}

}
