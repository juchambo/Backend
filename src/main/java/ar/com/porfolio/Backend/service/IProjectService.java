package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Project;
import java.util.List;

public interface IProjectService {
    public List<Project> verProyectos ();
    public void creaProyecto (Project proyecto);
    public void borrarProyecto (Long id);
    public Project buscarProyecto (Long id);
    public void modificarProyecto (Project proyecto);
}
