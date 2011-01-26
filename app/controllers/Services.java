package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Services extends Controller {

	@Before
	static void setConnectedUser() {
		if (Security.isConnected()) {
			renderArgs.put("user", "jeez");
		}
	}
	
	public static void launch(String name) {
		render("services/launch.html",name);
	}

	public static void listDevTools() {
		ServicesBuilder servicesBuilder = new ServicesBuilder();
		servicesBuilder.add("TeamCity status displayer",
				"Displaying status teamCity project build.");
		render(servicesBuilder);
	}

	private static void render(ServicesBuilder sb) {
		List<Service> services = sb.toList();
		renderTemplate("services/list.html", services);
	}

	public static void listSearchs() {
		ServicesBuilder servicesBuilder = new ServicesBuilder();
		servicesBuilder.add("Home search",
				"Searching detailed home around the world.");
		servicesBuilder.add("Car search",
				"Searching detailed cars around the world.");
		render(servicesBuilder);
	}

	public static void listBackups() {
		ServicesBuilder servicesBuilder = new ServicesBuilder();
		servicesBuilder.add("Rss backup", "Backup Rss.");
		servicesBuilder.add("Bookmark backup", "Backup bookmarks.");
		servicesBuilder.add("Email backup", "Backup emails.");
		render(servicesBuilder);
	}

}