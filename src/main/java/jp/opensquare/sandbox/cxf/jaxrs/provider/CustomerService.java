package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public interface CustomerService {

	@Produces("application/json")
	@GET
	@Path("/customer/{id}/")
	Customer getCustomer(@PathParam("id") String id);

	@Produces("application/json")
	@GET
	@Path("/customers/")
	Customers getCustomers();

	@Produces("application/json")
	@POST
	@Path("/customer/create")
	Customer createCustomer(Customer customer);

	@Produces("application/json")
	@PUT
	@Path("/customer/update")
	Customer updateCustomer(Customer customer);

	@Produces("application/json")
	@DELETE
	@Path("/customer/delete/{id}")
	Customer removeCustomer(@PathParam("id") String id);

}