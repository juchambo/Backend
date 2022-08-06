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

@CrossOrigin (origins = "https://mi-porfolio.web.app/")
@RestController
 public class PersonaController {
   
    @Autowired
    private IPersonaService userServ;
    
    @GetMapping ("/api/user/list")
    @ResponseBody
    public List<Persona> verUsuarios (){
        return userServ.verUsuarios();
    }
    
    @PostMapping ("/api/user/new")
    public void crearUsuario(@RequestBody Persona user){
        userServ.crearUsuario(user);
    }
 
   
    @DeleteMapping ("/api/user/delete/{id}")
    public void borrarUsuario (@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @GetMapping ("/api/user/{id}")
    public Persona buscarUsuario(@PathVariable Long id) {
        return userServ.buscarUsuario(id);
    }
    
    @PutMapping ("/api/user/edit/")
    public void modificarUsuario(@RequestBody Persona user){
        userServ.modificarUsuario(user);
    }
}
