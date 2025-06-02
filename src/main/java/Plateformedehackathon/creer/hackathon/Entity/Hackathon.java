package Plateformedehackathon.creer.hackathon.Entity;


import jakarta.persistence.*;
import lombok.Data;

//import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Hackathon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;

    // Getters et Setters


  public String getNom() {
        return name;
    }

    // Setter pour le nom
    public void setNom(String nom) {
        this.name = name;
    }

    // Getter pour la description
    public String getDescription() {
        return description;
    }

    // Setter pour la description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter pour la date de début
    public LocalDateTime getStartDate() {
        return startDate;
    }

    // Setter pour la date de début
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    // Getter pour la date de fin
    public LocalDateTime getEndDate() {
        return endDate;
    }

    // Setter pour la date de fin
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    // Getter pour la localisation
    public String getLocation() {
        return location;
    }

    // Setter pour la localisation
    public void setLocation(String location) {
        this.location = location;
    }
}


