/*
 * This is controller class
 * 
 */
package io.javacontact.springbootstarter.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/contacts")
	public List<Contact> getAllContacts() {
		return contactService.getAllContacts();
	}
	
	@RequestMapping("/contacts/{phoneNumber}")
	public Contact getContact(@PathVariable String phoneNumber) {
		return contactService.getContact(phoneNumber);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/contacts")
	public void addContact(@RequestBody Contact contact) {
		contactService.addContact(contact);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/contacts/{phoneNumber}")
	public void updateContact(@RequestBody Contact contact, @PathVariable String phoneNumber) {
		contactService.updateContact(phoneNumber, contact);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/contacts/{phoneNumber}")
	public void deleteContact(@PathVariable String phoneNumber) {
		contactService.deleteContact(phoneNumber);
		
	}
		
}
