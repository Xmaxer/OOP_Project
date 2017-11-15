
public class Phone extends Product{
	
	private String make;
	private String model;
	private double storageSpace;
	
	public Phone(String make, String model, double price, double storageSpace) {
		super(make + " " + model, storageSpace + "GB of storage", price);
		
		this.make = make;
		this.model = model;
		this.storageSpace = storageSpace;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	@Override
	public String toString()
	{
		return "[ID: " + super.getProductID() + "] Phone make and model: " + make + " " + model + "\nPrice: " + super.getPrice() + "\nStorage: " + storageSpace + "\n";
	}
	@Override
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the storageSpace
	 */
	public double getStorageSpace() {
		return storageSpace;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @param storageSpace the storageSpace to set
	 */
	public void setStorageSpace(double storageSpace) {
		this.storageSpace = storageSpace;
	}

}
