package jp.opensquare.sandbox.cxf.jaxrs.requestor;

import jp.opensquare.sandbox.cxf.jaxrs.provider.Customer;
import jp.opensquare.sandbox.cxf.jaxrs.provider.CustomerService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceRequestor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "requestor-beans.xml" });

		CustomerService requestor = (CustomerService) context.getBean("customerServiceRequestor");
		Customer newCustomer = new Customer("999", "create Customer");
		requestor.createCustomer(newCustomer);
		newCustomer.setName("update");
		requestor.updateCustomer(newCustomer);
		requestor.removeCustomer(newCustomer.getId());
		
		for(Customer customer : requestor.getCustomers().getCustomers()) {
			System.out.println(customer);
		}
		System.exit(0);
	}
}
