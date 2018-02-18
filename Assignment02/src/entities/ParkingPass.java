package entities;

//subclass of the product class
public class ParkingPass extends Product {
	
	private double cost;

	//getter and setter methods
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	//constructor for the parking pass
	public ParkingPass(String productCode, String productType, double cost) {
		super(productCode, productType);
		this.cost = cost;
	}
	
	
	
}
