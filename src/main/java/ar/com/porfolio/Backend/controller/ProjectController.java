package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Project;
import ar.com.porfolio.Backend.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    
    @Autowired
    private IProjectService projServ;

    @GetMapping ("/api/project/list")
    @ResponseBody
    public List<Project> verProyectos() {
        return projServ.verProyectos();
    }

    @PostMapping ("/api/project/new")
    public void creaProyecto(@RequestBody Project proyecto) {
        projServ.creaProyecto(proyecto);
    }

    @DeleteMapping ("/api/project/delete/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        projServ.borrarProyecto(id);
    }

    @GetMapping ("/api/project/{id}")
    public Project buscarProyecto(@PathVariable long id) {
        return projServ.buscarProyecto(id);
    }

    @PutMapping ("/api/project/edit")
    public void modificarProyecto(@RequestBody Project proyecto) {
        projServ.modificarProyecto(proyecto);
    }       
}
