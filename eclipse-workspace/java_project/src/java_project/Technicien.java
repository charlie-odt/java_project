package java_project;

public class Technicien {
	// Defines the variables
	private int id;
	private String name;
	private String qualification;
	private boolean available;
	
	// Creates a Technician instance
	public Technicien(String name, String qualification, boolean available) {
		this.name = name;
		this.qualification = qualification;
		this.available = available;
		}
	
	// Gets the name variable
	String getName() {
		return this.name;
	}
	
	// Modifies the name variable
	void modifiyName(String newName) {
		this.name = newName;
	}
	
	// Gets the qualification variable
	String getQualification() {
		return this.qualification;
	}
	
	// Modifies the qualification variable
	void modifyQualification(String newQualification) {
		this.qualification = newQualification;
	}

	// Gets the availability variable
	String getAvailability() {
		return this.available;
	}
	
	// Modifies the availability variable
	void modifiyAvailability(boolean newValue) {
		this.available = newValue;
	}

	int getId(){
		return this.id;
	}
	
	
}
