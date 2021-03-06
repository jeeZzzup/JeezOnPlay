package models;

import controllers.Secure;
import play.mvc.With;

public class Service {

	String name;

	String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Service(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}
