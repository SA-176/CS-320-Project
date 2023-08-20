//Steven Anderson
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Contact;
import main.java.ContactService;

public class ContactServiceTest {
	
	Contact testCon = new Contact("568485792", "Ben", "Kenobi", "4581239845", "Beyond the Dune Sea");
	
	//test to see if addContact works
	@Test
	void addContactTest() {
		//checks to make sure this is true
		assertEquals(false, ContactService.addContact(testCon));
	}
	
	//test to see if deleteContact works
	@Test
	public void deleteContactTest() {
		ContactService temp = new ContactService();
		
		Contact test = new Contact("568485792", "Ben", "Kenobi", "4581239845", "Beyond the Dune Sea");
		Contact test2 = new Contact("123456789", "Luke", "Skywalker", "4876952463", "5689 Owen Farm Tatooine");
		Contact test3 = new Contact("457821547", "Uncle", "Owen", "1259876534", "5689 Owen Farm Tatooine");
		
		ContactService.addContact(test);
		ContactService.addContact(test2);
		ContactService.addContact(test3);
		
		
		//test to make sure it returns false
		assertEquals(false, temp.deleteContact("457628547"));
		assertEquals(false, temp.deleteContact("457821714"));
		//test to make sure it is true
		assertEquals(true, temp.deleteContact("457821547"));
	}
	
	//test for updating a contact
	@Test
	public void updateFirstTest() throws Exception {
		ContactService temp = new ContactService();
		
		String testID = "452169873";
		String testName = "Owen";
		
		Contact test3 = new Contact(testID, "Uncle", "Owen", "1259876534", "5689 Owen Farm Tatooine");

		ContactService.addContact(test3);
		
		assertEquals(true, temp.updateFirstName(testID, testName));

		assertEquals(false, temp.updateFirstName("457821548", "Burned"));
	}
	
	//test for updating a contact
	@Test
	public void updateLastTest() throws Exception {
		ContactService temp = new ContactService();

		Contact test3 = new Contact("457821547", "Uncle", "Owen", "1259876534", "5689 Owen Farm Tatooine");

		ContactService.addContact(test3);
			
		//test that should return true
		assertEquals(true, temp.updateLastName("457821547", "Bones"));
		//test that should return false due to false ID
		assertEquals(false, temp.updateLastName("457821548", "Bones"));
	}
	
	//test for updating a contact
	@Test
	public void updatePhoneTest() throws Exception {
		ContactService temp = new ContactService();
			
		Contact test3 = new Contact("457821547", "Uncle", "Owen", "1259876534", "5689 Owen Farm Tatooine");
			
		ContactService.addContact(test3);
			
		//test that should return true
		assertEquals(true, temp.updatePhone("457821547", "4875982346"));
		//test that should return false due to false ID
		assertEquals(false, temp.updatePhone("457821548", "4875982346"));
	}
	
	//test for updating a contact
	@Test
	public void updateAddressTest() throws Exception {
		ContactService temp = new ContactService();
				
		Contact test3 = new Contact("457821547", "Uncle", "Owen", "1259876534", "5689 Owen Farm Tatooine");

		ContactService.addContact(test3);
				
		//test that should return true
		assertEquals(true, temp.updateAddress("457821547", "Remains of Old Farm"));
		//test that should return false due to false ID
		assertEquals(false, temp.updateAddress("457821548", "Remains of Old Farm"));
	}
}
