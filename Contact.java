//Steven Anderson
package main.java;

public class Contact {
	//values for contact
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//instance of contact including all 5 values
	public Contact (String contactID, String firstName, String lastName, String phone, String address){
		
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//public strings for retrieving information
	public String getID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {	
		return address;
	}
	
	//set first name
	protected boolean setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			return false;
		}
		this.firstName = firstName;
		return true;
	}
	
	//set last name
	protected boolean setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			return false;
		}
		this.lastName = lastName;
		return true;
	}
	
	//set phone
	protected boolean setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			return false;
		}
		this.phone = phone;
		return true;
	}
	
	//set address
	protected boolean setAddress(String address) {
		if (address == null || address.length() > 30) {
			return false;
		}
		this.address = address;
		return true;
	}
	
}