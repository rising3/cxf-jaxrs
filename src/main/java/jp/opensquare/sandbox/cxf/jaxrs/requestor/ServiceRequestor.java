package jp.opensquare.sandbox.cxf.jaxrs.requestor;

import jp.opensquare.sandbox.cxf.jaxrs.provider.Customer;
import jp.opensquare.sandbox.cxf.jaxrs.provider.CustomerResource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceRequestor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("requestor-beans.xml");

		CustomerResource customerResource = (CustomerResource) context.getBean("customerResource");
		
		System.out.println("=== @GET RESULT");
		System.out.println(customerResource.getCustomer("001"));

		System.out.println("=== @POST RESULT");
		Customer customer = customerResource.createCustomer(new Customer("999", "create customer"));
		for(Customer item : customerResource.getCustomers().getCustomer()) {
			System.out.println(item);
		}

		System.out.println("=== @PUT RESULT");
		customer.setName("update customer");
		customerResource.updateCustomer(customer);
		for(Customer item : customerResource.getCustomers().getCustomer()) {
			System.out.println(item);
		}
		
		System.out.println("=== @DELETE RESULT");
		customerResource.removeCustomer(customer.getId());
		for(Customer item : customerResource.getCustomers().getCustomer()) {
			System.out.println(item);
		}
		System.exit(0);
	}
}
