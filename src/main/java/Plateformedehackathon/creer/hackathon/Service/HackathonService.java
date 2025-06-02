package Plateformedehackathon.creer.hackathon.Service;
import Plateformedehackathon.creer.hackathon.Entity.Hackathon;
import Plateformedehackathon.creer.hackathon.Repository.HackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HackathonService {
    @Autowired
    private HackathonRepository hackathonRepository;

    public Hackathon createHackathon(Hackathon hackathon) {
        return hackathonRepository.save(hackathon);
    }

    public List<Hackathon> getAllHackathons() {
        return hackathonRepository.findAll();
    }
}
