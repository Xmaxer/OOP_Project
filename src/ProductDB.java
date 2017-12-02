import java.util.ArrayList;

public class ProductDB{

	private ArrayList<Product> products;
	
	public ProductDB()
	{
		products = new ArrayList<Product>();
	}
	
	public void add(Product product)
	{
		products.add(product);
	}
	
	public void remove(int id)
	{
		for(int i = 0, length = products.size(); i < length; i++)
		{
			if(products.get(i).getProductID() == id)
			{
				products.remove(i);
				break;
			}
		}
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
	
	public void printAll()
	{
		System.out.println(this);
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
