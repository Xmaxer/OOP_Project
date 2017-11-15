import java.util.ArrayList;

public class ProductDB {

	private ArrayList<Product> products;

	public ProductDB()
	{
		products = new ArrayList<Product>();
	}
	public void add(Product product)
	{
		products.add(product);
	}
	
	public void remove(Product product)
	{
		products.remove(product);
	}
	
	public Product find(int productID)
	{
		for(Product product : products)
		{
			if(product.getProductID() == productID)
			{
				return product;
			}
		}
		return null;
	}
	
	/**
	 * @return the products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}
}
