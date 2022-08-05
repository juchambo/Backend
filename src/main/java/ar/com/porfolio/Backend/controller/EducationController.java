package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Education;
import ar.com.porfolio.Backend.service.IEducationService;
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

@CrossOrigin (origins = "https://mi-porfolio.web.app/")
@RestController
public class EducationController {
    
    @Autowired
    private IEducationService eduServ;

    @PostMapping ("/api/education/new")
    public void crearEducacion(@RequestBody Education educacion) {
        eduServ.crearEducacion(educacion);
    }

    @GetMapping ("/api/education/list")
    @ResponseBody
    public List<Education> verEducacion() {
        return eduServ.verEducacion();
    }

    @DeleteMapping ("/api/education/delete/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @GetMapping ("/api/education/{id}")
    public Education buscarExperiencia(@PathVariable Long id) {
        return eduServ.buscarExperiencia(id);
    }

    @PutMapping ("/api/education/edit")
    public void modificarEducacion(@RequestBody Education educacion) {
        eduServ.modificarEducacion(educacion);
    }
    
    
}
