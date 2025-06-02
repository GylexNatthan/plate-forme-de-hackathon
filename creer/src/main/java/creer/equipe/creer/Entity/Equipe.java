package creer.equipe.creer.Entity;
import jakarta.persistence.*;
import lombok.Data;

 //import jakarta.persistence.*;
    import java.util.List;
    @Data
    @Entity
    public class Equipe {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String description;
        private String projet;
    
        @ElementCollection
        private List<String> membre;

        // Getters et Setters
       public Long getId() { return id; }
      public void setId(Long id) { this.id = id; }
      public String getName() { return name; }
     public void setName(String name) { this.name = name; }
       public List<String> getMembre() { return membre; }
      public void setMembre(List<String> membre) { this.membre = membre; }
      public String getDescription() { return description; }
     public void setDescription(String description) { this.description = description; }
    public String getProjet() { return projet; }
     public void setProjet(String projet) { this.projet = projet; }
    }





