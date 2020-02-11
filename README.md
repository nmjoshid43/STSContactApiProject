# STSContactApiProject
Contact Api with data spring boot starter project

# Contact API - RESTful
What are all the actions that you may want to do with an Contact API?

list all entries in the Contact,
add a new entry,
update an entry,
delete an entry

-Each contact in the contact has first name, last name,email and phone number and status(active/Inactive).

To design a restful API, we don’t start looking at actions, but at resources. Resources are just the things that you are dealing in the system.

So we  have one resource type, “contact”. What REST suggests is to model the URLs around the resources. So you  have two URL endpoints. One endpoint for representing all contacts and another for each individual contact.

/contacts
/contacts/$id -- Here i have considered phonenumber as id (as its unique) for showcase, but we can take another field which does not have any business value.

# The RESTful way to handle CRUD operation is to use HTTP methods for actions.

1.GET /contacts - list all the contacts

2.POST /contacts - create a new contact

3.PUT /contacts/$id - update a contact

4.DELETE /contacts/$id - delete a contact


a.GET is used for reading any resource
b.PUT is used to replace a resource 
c.DELETE is used to delete a resource
d.POST is used to create a resource 	

HTTP already has status codes. RESTful APIs try to reuse the same instead of reinventing a new way to deal with errors.

200 OK - all is well

400 Bad Request - the server could not understand the request from the client

404 Not Found - The resource is not found

500 Internal Server Error - something totally went wrong with the server, not your fault

# Test
use Postman to test application with following GET, POST, PUT and DELETE URLs.
`


1.GET -localhost:8080/contacts - Get all contacts

2.GET - localhost:8080/contacts/phoneNumber - get particular contact

3.POST -localhost:8080/contacts - Add contact to Database

4.PUT - localhost:8080/contacts/phonebumber - Update the contact

5.DELETE - localhost:8080/contacts/phonebumber - delete the contact
 
 # Note
Using springBoot Application, with spring web and JPA,Apachy Derby runtime database
Spring boot starts up embeded tomcat server, embeded derby database at startup

