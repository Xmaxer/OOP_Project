import java.util.ArrayList;

public class Order {

	private ArrayList<OrderDetails> ordersDetails;

	public Order()
	{
		ordersDetails = new ArrayList<OrderDetails>();
	}
	
	public String toString()
	{
		String toReturn = "";
		
		if(ordersDetails.size() == 0)
			return "No products in order.";
		
		for(OrderDetails od : ordersDetails)
			toReturn += od.toString() + "\n";
		
		return toReturn;
	}
	public void add(Product product, int quantity)
	{
		ordersDetails.add(new OrderDetails(product, quantity));
	}
	
	/**
	 * @return the ordersDetails
	 */
	public ArrayList<OrderDetails> getOrdersDetails() {
		return ordersDetails;
	}
}
