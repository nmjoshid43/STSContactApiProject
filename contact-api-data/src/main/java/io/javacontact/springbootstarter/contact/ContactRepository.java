/*
 * This is DAO class
 * 
 */
package io.javacontact.springbootstarter.contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository  extends CrudRepository<Contact, String>{

}
