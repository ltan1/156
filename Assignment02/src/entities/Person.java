package entities;

public class Person {
	private String personCode;
	private String firstName;
	private String lastName;
	private Address address;
	private String[] emails;
	
	//getter and setter methods
	
	public String getPersonCode() {
		return personCode;
	}
	
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getEmail() {
		return emails;
	}

	public void setEmail(String[] emails) {
		this.emails = emails;
	}
	
	
	//constructor for the person
	public Person(String personCode, String firstName, String lastName, Address address, String[] emails) {
		super();
		this.personCode = personCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emails = emails;
	}
	
}
