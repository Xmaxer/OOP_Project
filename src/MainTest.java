import java.util.Scanner;

public class MainTest {

	final static String[] MENU_OPTIONS = {"Create a new phone",
			"Search for product using productID",
			"Display all available products",
			"Order products",
			"Display all orders",
	"Quit"};

	private static Scanner input = new Scanner(System.in);
	
	private static ProductDB products = new ProductDB();
	private static CustomerDB customers = new CustomerDB();

	public static void main(String[] args) {

		Phone p1 = new Phone("Samsung", "Galaxy S8", 500, 128);
		Phone p2 = new Phone("Apple", "X", 1000, 256);
		TV tv1 = new TV("LG", 50, "LED", false, 700);
		TV tv2 = new TV("Samsung", 43, "LCD", true, 600);



		products.add(p1);
		products.add(p2);
		products.add(tv1);
		products.add(tv2);

		Customer c1 = new Customer("John", "Some street 2");
		Customer c2 = new Customer("Tom", "Some street 3");

		Order o = new Order();
		o.add(p1, 5);
		o.add(tv2, 1);

		c1.addOrder(o);

		Order o2 = new Order();
		o2.add(p2, 10);
		o2.add(tv1, 3);

		c1.addOrder(o2);
		c2.addOrder(o2);

		//System.out.println(c1);
		//System.out.println(c2);

		interactWithMenu();
	}

	private static void interactWithMenu() {

		while(true)
		{
			for(int i = 0; i < MENU_OPTIONS.length; i++)
			{
				System.out.println((i+1) + ". " + MENU_OPTIONS[i]);
			}
			System.out.print("Input a menu choice (1 - " + MENU_OPTIONS.length + "): ");

			switch((input.hasNextInt()) ? input.nextInt() : 0)
			{
			case 1:
				input.nextLine();
				createAPhone();
				break;
			case 2:
				input.nextLine();
				System.out.print("Enter product ID: ");
				Product product = products.find((input.hasNextInt()) ? input.nextInt() : -1);
				System.out.println((product == null) ? "Couldn't find product with the specified ID." : product);
				break;
			case 3:
				input.nextLine();
				System.out.println(products.toString());
				break;
			case 4:
				input.nextLine();
				order();
				break;
			case 5:
				input.nextLine();
				displayOrders();
				break;
			case 6:
				System.out.println("Quitting...");
				return;
			default:
				input.nextLine();
				System.out.println("Input must be between 1 and " + MENU_OPTIONS.length);
			}
		}


	}

	private static void displayOrders() {

		String customerName = "";
		
		System.out.println("Type -1 to exit.");
		
		while(true)
		{
			System.out.print("Enter customer name: ");
			customerName = input.nextLine();
			
			if(customerName.equals("-1"))
				return;
			
			if(!customerName.isEmpty())
			{
				Customer customer = customers.find(customerName);
				
				if(customer != null)
				{
					customer.printAllOrders();
					return;
				}
				else
					System.out.println("Couldn't find customer with the name of: " + customerName);
			}
			else
				System.out.println("Customer name cannot be blank.");
		}
	}

	private static void order() {

		System.out.println("Type -1 to exit.");
		
		String customerName = "";
		Customer currentCustomer = null;
		Order order = new Order();

		while(true)
		{
			System.out.print("Enter customer name: ");
			customerName = input.nextLine();
			
			if(customerName.equals("-1"))
				return;
			
			else if(!customerName.isEmpty())
			{
				currentCustomer = customers.find(customerName);
				
				if(currentCustomer == null)
				{
					System.out.println("Creating new customer with the name of: " + customerName);
					currentCustomer = new Customer(customerName);
					customers.add(currentCustomer);
				}
				break;
			}
		}
		
		System.out.println("Type -1 to finish adding orders.");
		
		while(true)
		{
			System.out.print("Enter product id and quantity: ");
			String[] in = input.nextLine().split(" ");

			try {

				if(in.length == 2)
				{
					int productID = Integer.valueOf(in[0]);
					int quantity = Integer.valueOf(in[1]);

					Product product = products.find(productID);

					if(product != null)
					{
						order.add(product, quantity);
						System.out.println("You ordered " + quantity + " of " + product.getName());
					}
					else
						System.out.println("Couldn't find product with the ID of: " + productID);
				}
				else if(in.length == 1 && in[0].equals("-1"))
				{
					break;
				}
				else
					System.out.println("Invalid input. Try again.");
			} catch (NumberFormatException e)
			{ System.out.println("Invalid input."); }
		}

		if(!order.getOrdersDetails().isEmpty())
		{
			currentCustomer.addOrder(order);
			System.out.println("\nAdded order\n");
		}
		else
			System.out.println("\nNo orders were added for " + customerName + "\n");;
	}

	private static void createAPhone() {

		String make = "";
		String model = "";
		double price = 0;
		double storage = 0;

		System.out.print("Enter phone make: ");
		while((make = input.nextLine()).isEmpty())
		{
			System.out.print("Phone make cannot be empty!\nEnter phone make: ");
		}

		System.out.print("Enter phone model: ");
		while((model = input.nextLine()).isEmpty())
		{
			System.out.print("Phone model cannot be empty!\nEnter phone model: ");
		}

		System.out.print("Enter phone price: ");
		while(((input.hasNextInt()) ? price = input.nextInt() : 0) <= 0)
		{
			System.out.print("Must enter a number higher than 0\nEnter phone price: ");
			input.nextLine();
		}

		System.out.print("Enter phone storage in GB: ");
		while(((input.hasNextInt()) ? storage = input.nextInt() : 0) <= 0)
		{
			System.out.print("Must enter a number higher than 0\nEnter phone storage in GB: ");
			input.nextLine();
		}

		Phone newPhone = new Phone(make, model, price, storage);

		products.add(newPhone);

		System.out.println("\nAdded '" + make + " " + model + "' to list of products. Product ID: " + Product.getCurrentID() + "\n");

	}
}
