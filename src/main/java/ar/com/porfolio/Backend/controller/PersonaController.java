package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ar.com.porfolio.Backend.service.IPersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
 public class PersonaController {
   
    @Autowired
    private IPersonaService userServ;
    
    @GetMapping ("/user/list")
    @ResponseBody
    public List<Persona> verUsuarios (){
        return userServ.verUsuarios();
    }
    
    @PostMapping ("/user/new")
    public void crearUsuario(@RequestBody Persona user){
        userServ.crearUsuario(user);
    }
 
   
    @DeleteMapping ("/user/delete/{id}")
    public void borrarUsuario (@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @GetMapping ("/user/{id}")
    public Persona buscarUsuario(@PathVariable Long id) {
        return userServ.buscarUsuario(id);
    }
    
    @PutMapping ("/user/edit/{id}")
    public void modificarUsuario(@PathVariable Long id, @RequestBody Persona user){
        userServ.modificarUsuario(user);
    }
}
