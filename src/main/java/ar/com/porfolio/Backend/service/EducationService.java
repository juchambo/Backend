package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Education;
import ar.com.porfolio.Backend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
   
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Education educacion) {
        eduRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education buscarExperiencia(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Education educacion) {
        eduRepo.save(educacion);
    }
}
