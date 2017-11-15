import java.util.ArrayList;

public class Order {

	private ArrayList<OrderDetails> ordersDetails;

	public Order()
	{
		ordersDetails = new ArrayList<OrderDetails>();
	}
	
	public String toString()
	{
		return ordersDetails.toString();
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
