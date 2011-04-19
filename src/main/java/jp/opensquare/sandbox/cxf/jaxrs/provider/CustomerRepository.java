package jp.opensquare.sandbox.cxf.jaxrs.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
	private static CustomerRepository instance = null;
	
	private Map<String, Customer> repo = new HashMap<String, Customer>();
	
	public static CustomerRepository getInstance() {
		if(instance == null) {
			instance = new CustomerRepository();
		}
		return instance;
	}
	
	private CustomerRepository() {
		createCustomer("001","hoge");
		createCustomer("002","fuga");
		createCustomer("003","bar");
	}

	private void createCustomer(String id, String name) {
		repo.put(id, new Customer(id, name));
	}
	
	public Customer getCustomer(String id) {
		Customer result = null;
		if(repo.containsKey(id)) {
			result =repo.get(id);
		}
		return result;
	}
	
	public List<Customer> getCustomers() {
		return new ArrayList<Customer>(repo.values());
	}

	public Customer createCustomer(Customer customer) {
		if(!repo.containsKey(customer.getId())) {
			repo.put(customer.getId(), customer);
		}
		return repo.get(customer.getId());
	}

	public void updateCustomer(Customer customer) {
		if(repo.containsKey(customer.getId())) {
			repo.put(customer.getId(), customer);
		}
	}
	
	public void removeCustomer(String id) {
		if(repo.containsKey(id)) {
			repo.remove(id);
		}
	}
}
