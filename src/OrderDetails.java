
public class OrderDetails {
	
	private Product product;
	private int quantity;
	
	public OrderDetails(Product product, int quantity)
	{
		this.product = product;
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return product + "\nQuantity: " + quantity;
	}
	public void print()
	{
		System.out.println(toString());
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
