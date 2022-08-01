
package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Skill;
import ar.com.porfolio.Backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> verHabilidades() {
        return skillRepo.findAll();
    }

    @Override
    public void crearHabilidad(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarHabilidad(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarHabilidad(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarHabilidad(Skill skill) {
                skillRepo.save(skill);
    }    
}
