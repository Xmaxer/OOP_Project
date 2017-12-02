
public class Product {
	
	private String name;
	private String description;
	private double price;
	private int productID;
	private static int currentID = 0;
	
	public Product(String name, String description, double price)
	{
		productID = ++currentID;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String toString()
	{
		return "[ID: " + productID + "] Product name: " + name + "\nDescription: " + description + "\nPrice: " + price + "\n";
	}
	public void print()
	{
		System.out.println(toString());
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
}
