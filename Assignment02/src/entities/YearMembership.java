package entities;

//subclass of the product class
public class YearMembership extends Product{
	private String startDate;
	private String endDate;
	private Address address;
	private String name;
	private double cost;

	//getter and setter methods
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	
	//constructor for year long memberships
	public YearMembership(String productCode, String productType, String startDate, String endDate, Address address,
			String name, double cost) {
		super(productCode, productType);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.name = name;
		this.cost = cost;
	}
	
}
