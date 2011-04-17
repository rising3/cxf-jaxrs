package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.ws.rs.Path;

@Path("/customerservice/")
public class CustomerServiceImpl implements CustomerService {
	@Override
	public Customer getCustomer(String id) {
		
		return CustomerRepository.getInstance().getCustomer(id);
	}

	@Override
	public Customers getCustomers() {
		return new Customers(CustomerRepository.getInstance().getCustomers());		
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return CustomerRepository.getInstance().createCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return CustomerRepository.getInstance().updateCustomer(customer);
	}
	
	@Override
	public Customer removeCustomer(String id) {
		return CustomerRepository.getInstance().removeCustomer(id);
	}
}
