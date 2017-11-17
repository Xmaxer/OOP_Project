import java.util.ArrayList;
import java.util.List;

public class ProductDB{

	private List<Product> products;
	
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
	
	public String toString()
	{
		if(products.size() == 0)
			return "Product database is empty.";
		
		String toReturn = "";
		for(Product product : products)
			toReturn += product.toString() + "\n";
		
		return toReturn;
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
}
