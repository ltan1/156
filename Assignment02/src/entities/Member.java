package entities;

public class Member {
	private String memberCode;
	private String type;
	private Person primaryContact;
	private String memberName;
	private Address memberAddress;

	//getter and setter methods
	
	public Person getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(Person primaryContact) {
		this.primaryContact = primaryContact;
	}
	public Address getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(Address memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//constructor for member
	public Member(String memberCode, String type, Person primaryContact, String memberName, Address memberAddress) {
		super();
		this.type = type;
		this.memberCode = memberCode;
		this.primaryContact = primaryContact;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
}