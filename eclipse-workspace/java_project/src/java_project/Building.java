package java_project;

public class Building {
	Private int id;
	Private String name;
	Private String location;
	
	// Creates a Building instance
	public Building(String name, String location) {
		this.name = name;
		this.location = location;
		}

	public Building(int id, String name, String location) {
		this.id=id;
		this.name = name;
		this.location = location;
		}
	
	// Gets the name variable
	String getName() {
		return this.name;
	}
	// recupère l'id
	public int getId() {
        return id;
    }

	//Setter standard
	public void setId(int id) {
        this.id = id;
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
