package entities;

//subclass of the product class
public class DayMembership extends Product{
	private String startDate;
	private Address address;
	private double cost;
	
	//getter and setter methods
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//Constructor for day membership class
	public DayMembership( String productCode, String productType, String startDate, Address address, double cost) {
		super(productCode, productType);
		this.startDate = startDate;
		this.address = address;
		this.cost = cost;
	}
	
	
}
