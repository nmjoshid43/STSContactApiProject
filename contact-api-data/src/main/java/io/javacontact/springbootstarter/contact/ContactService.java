/*
 * This is service class
 * 
 */
package io.javacontact.springbootstarter.contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.dialect.pagination.TopLimitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	public List<Contact> getAllContacts(){
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findAll().forEach(contacts::add);
		return contacts;
		
	}
	public Contact getContact(String phoneNumber) {
		return contactRepository.findOne(phoneNumber);
			}
	
	public void addContact(Contact contact) {
		contactRepository.save(contact);
		
	}

	public void updateContact(String phoneNumber, Contact contact) {
		contactRepository.save(contact);
	}
	
	public void deleteContact(String phoneNumber) {
		contactRepository.delete(phoneNumber);
	}
}
