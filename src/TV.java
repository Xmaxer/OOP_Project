
public class TV extends Product{
	
	private String make;
	private double screenSize;
	private String type;
	private boolean threeD;
	
	public TV(String make, double screenSize, String type, boolean threeD, double price) {
		
		super(make, type + " (" + screenSize + ")", price);
		
		this.make = make;
		this.screenSize = screenSize;
		this.type = type;
		this.threeD = threeD;
	}
	
	@Override
	public void print() {
		super.print();
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the threeD
	 */
	public boolean isThreeD() {
		return threeD;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @param threeD the threeD to set
	 */
	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}
	
	

}
