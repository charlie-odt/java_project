package java_project

public enum StatutIntervention {
    PLANIFIEE("Planifiée"),
    EN_COURS("En cours"),
    TERMINEE("Terminée");

    private final String label;

    InterventionStatus(String label) {
        this.label = label;
    }
  }
