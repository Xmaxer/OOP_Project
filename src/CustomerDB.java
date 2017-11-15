
public class CustomerDB extends ObjectDB{

	public CustomerDB()
	{
		super();
	}
	
	public Customer find(String name)
	{
		for(Object object : super.objects)
		{
			Customer customer = (Customer) object;
			
			if(customer.getName().equals(name))
			{
				return customer;
			}
		}
		return null;
	}
}
