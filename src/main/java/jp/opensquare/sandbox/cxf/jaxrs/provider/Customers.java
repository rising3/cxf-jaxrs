package jp.opensquare.sandbox.cxf.jaxrs.provider;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customers")
public class Customers {
	private Collection<Customer> customers;

	public Collection<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}

	public Customers() {
		super();
	}
	public Customers(Collection<Customer> customers) {
		super();
		this.customers = customers;
	}
	
}
