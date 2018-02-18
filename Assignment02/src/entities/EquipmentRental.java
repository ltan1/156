package entities;

//subclass of the product class
public class EquipmentRental extends Product {
	private String name;
	private double cost;
	
	//getter and setter methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//constructor for equipment rental
	public EquipmentRental(String productCode, String productType, String name, double cost) {
		super(productCode, productType);
		this.name = name;
		this.cost = cost;
	}
	
}
