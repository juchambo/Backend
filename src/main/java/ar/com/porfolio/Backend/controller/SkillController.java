package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Skill;
import ar.com.porfolio.Backend.service.ISkillService;
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

@CrossOrigin(origins = "https://mi-porfolio.web.app/")
@RestController
public class SkillController {

    @Autowired
    private ISkillService skillServ;

    @GetMapping("/api/skill/list")
    @ResponseBody
    public List<Skill> verHabilidades() {
        return skillServ.verHabilidades();
    }

    @PostMapping("/api/skill/new")
    public void crearHabilidad(@RequestBody Skill skill) {
        skillServ.crearHabilidad(skill);
    }

    @DeleteMapping("/api/skill/delete/{id}")
    public void borrarHabilidad(@PathVariable Long id) {
        skillServ.borrarHabilidad(id);
    }

    @GetMapping("/api/skill/{id}")
    public Skill buscarHabilidad(@PathVariable Long id) {
        return skillServ.buscarHabilidad(id);
    }

    @PutMapping("/api/skill/edit/")
    public void modificarHabilidad(@RequestBody Skill skill) {
        skillServ.modificarHabilidad(skill);
    }

}
