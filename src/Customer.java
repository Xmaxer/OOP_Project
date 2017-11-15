import java.util.ArrayList;

public class Customer {
	
	private String name;
	private String address;
	private ArrayList<Order> orders;
	
	public Customer(String name, String address)
	{
		this.name = name;
		this.address = address;
		orders = new ArrayList<Order>();
	}
	public Customer(String name)
	{
		this.name = name;
		this.address = "Unknown";
		orders = new ArrayList<Order>();
	}
	public void addOrder(Order o)
	{
		orders.add(o);
	}
	
	public void printAllOrders()
	{
		for(Order order : this.orders)
		{
			System.out.println(order);
		}
	}
	public String toString()
	{
		return name + " lives at " + address + " has " + orders.size() + " orders";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the orders
	 */
	public ArrayList<Order> getOrders() {
		return orders;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	
}
