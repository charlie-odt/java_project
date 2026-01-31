package java_project;

import java.time.LocalDateTime;

public class Intervention {

    private int id;
    private LocalDateTime date;
    private String type;
    private String description;
    
    private StatutIntervention status;
    private Technician technician;
    private Building building;

    // Constructeur sans ID, pour la création
    public Intervention(LocalDateTime date, String type, StatutIntervention status, 
                        String description, Technician technician, Building building) {
        this.date = date;
        this.type = type;
        this.status = status;
        this.description = description;
        this.technician = technician;
        this.building = building;
    }

    // Constructeur complet avec ID, pour la lecture BDD
    public Intervention(int id, LocalDateTime date, String type, StatutIntervention status, 
                        String description, Technician technician, Building building) {
        this(date, type, status, description, technician, building); 
        this.id = id;
    }

//getter et setter 
    public int getId() { 
		return id; 
	}
	
    public void setId(int id) { 
		this.id = id; 
	}

    public LocalDateTime getDate() { 
		return date; 
	}
    public void setDate(LocalDateTime date) { 
		this.date = date; 
	}

    public String getType() { 
		return type; 
	}
    public void setType(String type) { 
		this.type = type; 
	}

    public StatutIntervention getStatus() { 
		return status; 
	}
    public void setStatus(StatutIntervention status) { 
		this.status = status;
	}

    public String getDescription() {
		return description; 
	}
    public void setDescription(String description) {
		this.description = description; 
	}

    public Technician getTechnician() { 
		return technician;
	}
    public void setTechnician(Technician technician) { 
		this.technician = technician; 
	}

    public Building getBuilding() { 
		return building; 
	}
    public void setBuilding(Building building) { 
		this.building = building; 
	}
    
}
