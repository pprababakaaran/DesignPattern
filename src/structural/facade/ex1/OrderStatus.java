package structural.facade.ex1;

public interface OrderStatus {
	
	String getCustomerId(String user);
	String getOrderStatus(String customer, String orderId);

}
