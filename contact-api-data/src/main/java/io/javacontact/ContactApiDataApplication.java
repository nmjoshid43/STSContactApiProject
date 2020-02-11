/*
 * This is SpringBoot Main class starts the application and start the Tomcat server
 * 
 */
package io.javacontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApiDataApplication.class, args);
	}

}

