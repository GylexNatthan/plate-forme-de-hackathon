package creer.equipe.creer.Service;
import creer.equipe.creer.Entity.Equipe;
import creer.equipe.creer.Repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    public Equipe createEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }
}