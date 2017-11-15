import java.util.ArrayList;
import java.util.List;

public class ObjectDB {

	List<Object> objects;
	
	public ObjectDB()
	{
		this.objects = new ArrayList<Object>();
	}
	public void add(Object object)
	{
		this.objects.add(object);
	}
	
	public void remove(Object object)
	{
		this.objects.remove(object);
	}
	
	public String toString()
	{
		if(objects.size() == 0)
			return "List is empty.";
		
		String toReturn = "";
		for(Object obj : objects)
			toReturn += obj.toString() + "\n";
		
		return toReturn;
	}
}
