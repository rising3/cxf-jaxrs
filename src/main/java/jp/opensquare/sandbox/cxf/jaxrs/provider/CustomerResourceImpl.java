package jp.opensquare.sandbox.cxf.jaxrs.provider;

public class CustomerResourceImpl implements CustomerResource {
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
	public void updateCustomer(Customer customer) {
		CustomerRepository.getInstance().updateCustomer(customer);
	}
	
	@Override
	public void removeCustomer(String id) {
		CustomerRepository.getInstance().removeCustomer(id);
	}
}
