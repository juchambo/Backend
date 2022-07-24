package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Experience;
import ar.com.porfolio.Backend.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    public ExperienceRepository expRepo;    
    
    @Override
    public List<Experience> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experience experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);    
    }

    @Override
    public Experience buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experience experiencia) {
        expRepo.save(experiencia);
    }
}
