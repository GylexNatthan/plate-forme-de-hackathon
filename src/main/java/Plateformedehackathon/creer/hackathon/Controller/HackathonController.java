package Plateformedehackathon.creer.hackathon.Controller;
import Plateformedehackathon.creer.hackathon.Entity.Hackathon;
import Plateformedehackathon.creer.hackathon.Service.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hackathons")
public class HackathonController {
    @Autowired
    private HackathonService hackathonService;

    @PostMapping
    public ResponseEntity<Hackathon> createHackathon(@RequestBody Hackathon hackathon) {
        Hackathon created = hackathonService.createHackathon(hackathon);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public List<Hackathon> getAllHackathons() {
        return hackathonService.getAllHackathons();
    }
}
