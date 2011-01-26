package models;

import java.util.ArrayList;
import java.util.List;

public class ServicesBuilder {
	
	List<Service> services = new ArrayList<Service>();

	public ServicesBuilder() {
	}
	
	public ServicesBuilder add(String name, String description){
		services.add(new Service(name, description));
		return this;
	}
	
	public ServicesBuilder remove(Service service){
		services.remove(service);
		return this;
	}
	
	public List<Service> toList(){
		return services;
	}
	
	
	
	

}
