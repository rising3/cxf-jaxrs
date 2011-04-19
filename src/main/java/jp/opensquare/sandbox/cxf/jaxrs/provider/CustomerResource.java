package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customer")
public interface CustomerResource {

	@GET
	@Path("/get/{id}")
	@Produces({"application/json", "application/xml"})
	Customer getCustomer(@PathParam("id") String id);

	@GET
	@Path("/all")
	@Produces({"application/json", "application/xml"})
	Customers getCustomers();

	@POST
	@Path("/create")
	@Produces({"application/json", "application/xml"})
	Customer createCustomer(Customer customer);

	@PUT
	@Path("/update")
	void updateCustomer(Customer customer);

	@DELETE
	@Path("/delete/{id}")
	void removeCustomer(@PathParam("id") String id);

}