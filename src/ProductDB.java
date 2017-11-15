
public class ProductDB extends ObjectDB{

	public ProductDB()
	{
		super();
	}
	
	public Product find(int productID)
	{
		for(Object object : super.objects)
		{
			Product product = (Product) object;
			
			if(product.getProductID() == productID)
			{
				return product;
			}
		}
		return null;
	}
}
