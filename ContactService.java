//Steven Anderson
package main.java;
import main.java.Contact;

//import array for use
import java.util.ArrayList;

public class ContactService {
	//create array list with contact called contactEntry
	private static ArrayList<Contact> conList = new ArrayList<>();

	
	//boolean for adding task to the array lists
	public static boolean addContact(Contact contact) {
		
		String conID = contact.getID();
		
		//uses the search to find the ID
		if(searchForContact(conID)== false) {
			conList.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	
	//boolean for deleting a contact by checking contact ID
	public boolean deleteContact(String conID) {
		int index = 0;
		//while loop through conList
		while (index < conList.size()) {
			//if a match is found remove the conList at that index and mark check true
			if (conID.equals(conList.get(index).getID())) {
				conList.remove(index);
				return true;
			}
			index++;
		}
		//return false
		return false;
	}
	
	//boolean for updating a contact
	public boolean updateFirstName(String conID, String firstName){
		if (searchForContact(conID) == true) {
			return false;
		}
		else {
			return searchForCon(conID).setFirstName(firstName);
		}
	}
	//boolean for updating a contact
	public boolean updateLastName(String conID, String lastName){
		if (searchForContact(conID) == false) {
			return false;
		}
		else {
			return searchForCon(conID).setLastName(lastName);
		}
	}
	//boolean for updating a contact
	public boolean updatePhone(String conID, String phone){
		if (searchForContact(conID) == false) {
			return false;
		}
		else {
			return searchForCon(conID).setPhone(phone);
		}
	}
	//boolean for updating a contact
	public boolean updateAddress(String conID, String address){
		if (searchForContact(conID) == false) {
			return false;
		}
		else {
			return searchForCon(conID).setAddress(address);
		}
	}
	
	//search for contact
	private static boolean searchForContact(String ID){
		int index = 0;
		//while loop to loop through conList
		while (index < conList.size()) {
			//if a match is found answer is marked true and returned
			if (ID.equals(conList.get(index).getID())) {
				return true;
			}
			index++;
		}
		//answer returned false
		return false;
	}
	
	//searchForCon for updates
	private Contact searchForCon(String ID){
		int index = 0;
		//while loop to loop through conList
		while (index < conList.size()) {
			//if a match is found answer is marked true and returned
			if (ID.equals(conList.get(index).getID())) {
				return conList.get(index);
			}
			index++;
		}
		return null;
	}
}
