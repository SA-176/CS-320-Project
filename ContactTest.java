//Steven Anderson
package test;

import main.java.Contact;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	String goodID = "123456789";
	String goodFirstName = "Luke";
	String goodLastName = "Skywalker";
	String goodPhone = "4876952463";
	String goodAddress = "5689 Ben Farm Tatooine";
	
	String badID = "11111123456789";
	String badFirstName = "LukeLukeLuke";
	String badLastName = "Skywalkerererer";
	String badPhone = "48769524635684228";
	String badAddress = "5689 Owen Farm Tatooine blah blah blah blah blah blah blah blue milk";
	
	//test that is meant to make sure all values are added correctly
	@Test 
	public void testContactValues() {
      Contact contact = new Contact(goodID, goodFirstName, goodLastName, goodPhone, goodAddress);
      assertTrue(contact.getID().equals(goodID));
      assertTrue(contact.getFirstName().equals(goodFirstName));
      assertTrue(contact.getLastName().equals(goodLastName));
      assertTrue(contact.getPhone().equals(goodPhone));
      assertTrue(contact.getAddress().equals(goodAddress));
   } 
	
	//test for id over 10 characters
	@Test
	public void testIDLengthOver() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(badID, goodFirstName, goodLastName, goodPhone, goodAddress);
		});
	}
	
	//test for first name over 10 characters
	@Test
	public void testFirstNameLengthOver() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, badFirstName, goodLastName, goodPhone, goodAddress);
		});
	}
	@Test
    public void testLastNameLengthOver() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, goodFirstName, badLastName, goodPhone, goodAddress);
		});
    }

    @Test
    public void testPhoneLengthNotTen() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, goodFirstName, goodLastName, badPhone, goodAddress);
		});
    }

    @Test
    public void testAddressOver() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, goodFirstName, goodLastName, goodPhone, badAddress);
		});
    }

    @Test
    public void testIDNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, goodFirstName, goodLastName, goodPhone, goodAddress);
		});
    }
    
    @Test
    public void testFirstNameNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, null, goodLastName, goodPhone, goodAddress);
		});
    }

    @Test
    public void testLastNameNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, goodFirstName, null, goodPhone, goodAddress);
		});
    }

    @Test
    public void testPhoneNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(goodID, goodFirstName, goodLastName, null, goodAddress);
		});
    }

    @Test
    public void testAddressNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(badID, goodFirstName, goodLastName, goodPhone, null);
		});
    }
}
