package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Experience;
import ar.com.porfolio.Backend.service.IExperienceService;
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

@CrossOrigin (origins = "http://localhost:4200/")
@RestController
public class ExperienceController {

    @Autowired
    private IExperienceService expServ;
    
    @PostMapping ("/api/experience/new")
    public void crearExperiencia(@RequestBody Experience experiencia){
        expServ.crearExperiencia(experiencia);
    }
    
    @GetMapping ("/api/experience/list")
    @ResponseBody
    public List<Experience> verExperiencias (){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/api/experience/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    @GetMapping ("/api/experience/{id}")
    public Experience buscarExperiencia(@PathVariable Long id) {
    return expServ.buscarExperiencia(id);
    }

    @PutMapping ("/api/experience/edit/")
    public void modificarExperiencia(@RequestBody Experience experiencia) {
        expServ.modificarExperiencia(experiencia);
    }    

}
