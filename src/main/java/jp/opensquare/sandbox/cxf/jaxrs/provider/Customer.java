package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class Customer {
	private String id;
	private String name;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Customer() {
		super();
	}
	
	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id +" , name:" + this.name;
	}
}
