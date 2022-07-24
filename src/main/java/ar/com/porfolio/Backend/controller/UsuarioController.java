package ar.com.porfolio.Backend.controller;

import ar.com.porfolio.Backend.model.Usuario;
import ar.com.porfolio.Backend.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class UsuarioController {
   
    @Autowired
    private IUsuarioService userServ;
    
    @GetMapping ("/user/list")
    @ResponseBody
    public List<Usuario> verUsuarios (){
        return userServ.verUsuarios();
    }
    
    @PostMapping ("/user/new")
    public void crearUsuario(@RequestBody Usuario user){
        userServ.crearUsuario(user);
    }
 
   
    @DeleteMapping ("/user/delete/{id}")
    public void borrarUsuario (@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @GetMapping ("/user/{id}")
    public Usuario buscarUsuario(@PathVariable Long id) {
        return userServ.buscarUsuario(id);
    }
    
    @PutMapping ("/user/edit")
    public void modificarUsuario(@RequestBody Usuario user){
        userServ.modificarUsuario(user);
    }
}
