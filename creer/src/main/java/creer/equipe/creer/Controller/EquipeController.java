package creer.equipe.creer.Controller;
import creer.equipe.creer.Entity.Equipe;
import creer.equipe.creer.Service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {
   @Autowired
    private EquipeService equipeService;

    @PostMapping
    public ResponseEntity<Equipe> createEquipe(@RequestBody Equipe equipe) {
        Equipe created = equipeService.createEquipe(equipe);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public List<Equipe> getAllEquipes() {
        return equipeService.getAllEquipes();
    }
}



