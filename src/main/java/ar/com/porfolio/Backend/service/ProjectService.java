package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Project;
import ar.com.porfolio.Backend.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectService implements IProjectService {

    @Autowired
    public ProjectRepository projRepo;
    
    @Override
    public List<Project> verProyectos() {
        return projRepo.findAll();
    }

    @Override
    public void creaProyecto(Project proyecto) {
        projRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        projRepo.deleteById(id);
    }

    @Override
    public Project buscarProyecto(long id) {
        return projRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Project proyecto) {
        projRepo.save(proyecto);
    }
}
