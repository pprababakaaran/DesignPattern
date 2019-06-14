package structural.facade.ex1;

public class OrderStatusFacade implements OrderStatus{

	private SFDC sfdc;
	private SAP sap;
	
	public OrderStatusFacade(SFDC sfdc, SAP sap) {
		this.sfdc = sfdc;
		this.sap = sap;
	}
	
	@Override
	public String getCustomerId(String user) {
		return sfdc.getCustomerId(user);
	}

	@Override
	public String getOrderStatus(String customer, String orderId) {
		return sap.getOrderStatus(customer, orderId);
	}

	
}
