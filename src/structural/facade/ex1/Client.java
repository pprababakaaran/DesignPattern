package structural.facade.ex1;

public class Client {

	public static void main(String args[]) {

		OrderStatus orderStatus = new OrderStatusFacade(new SFDC(), new SAP());
		String customerId = orderStatus.getCustomerId("Prabakaran");
		String order = orderStatus.getOrderStatus(customerId, "876543");
		System.out.println("CustomerID: " + customerId + " Order Status: " + order);
	}

}
