CREATE DATABASE IF NOT EXISTS maintenance_app;
USE maintenance_app;

CREATE TABLE technicien (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    qualification VARCHAR(100),
    disponible BOOLEAN DEFAULT TRUE 
);

CREATE TABLE batiment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    localisation VARCHAR(255)
);

CREATE TABLE intervention (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date_intervention DATETIME NOT NULL,
    type_intervention VARCHAR(100),
    statut ENUM('Planifiée', 'En cours', 'Terminée') DEFAULT 'Planifiée',
    description TEXT,
    technicien_id INT,
    batiment_id INT,
    FOREIGN KEY (technicien_id) REFERENCES technicien(id) ON DELETE SET NULL,
    FOREIGN KEY (batiment_id) REFERENCES batiment(id) ON DELETE CASCADE
);

INSERT INTO technicien (nom, qualification) VALUES ('Valerio', 'Électricien'), ('Lucas', 'Plombier'),('Charlie', 'Chauffagiste');
INSERT INTO batiment (nom, localisation) VALUES ('Bâtiment A', '12 rue de la Paix'), ('Entrepôt B', 'Zone Industrielle');
