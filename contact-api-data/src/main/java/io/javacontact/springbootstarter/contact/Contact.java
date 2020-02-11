/*
 * This is entity class
 * 
 */

package io.javacontact.springbootstarter.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	
	@Id
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String email;
	private String status;
	
	public Contact() {
		
	}
	
	public Contact(String phoneNumber,String firstName, String lastName, String email, String status) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.status = status;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
