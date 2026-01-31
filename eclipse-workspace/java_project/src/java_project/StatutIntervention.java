package java_project;

public enum StatutIntervention {
    PLANIFIEE("Planifiée"),
    EN_COURS("En cours"),
    TERMINEE("Terminée");

    private final String label;

    StatutIntervention(String label) {
        this.label = label;
    }
  }
