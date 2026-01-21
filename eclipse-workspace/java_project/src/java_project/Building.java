package java_project;

public class Building {
	// Defines the variables
	String name;
	String location;
	
	// Creates a Building instance
	public Building(String name, String location) {
		this.name = name;
		this.location = location;
		}
	
	// Gets the name variable
	String getName() {
		return this.name;
	}
	
	// Modifies the name variable
	void modifiyName(String newName) {
		this.name = newName;
	}
	
	// Gets the location variable
	String getLocation() {
		return this.location;
	}
	
	// Modifies the location variable
	void modifyLocation(String newLocation) {
		this.location = newLocation;
	}	
	
}