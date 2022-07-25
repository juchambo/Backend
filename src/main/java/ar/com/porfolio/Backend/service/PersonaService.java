
package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.porfolio.Backend.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository userRepo;
    
    @Override
    public List<Persona> verUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(Persona user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        userRepo.deleteById(id);    }

    @Override
    public Persona buscarUsuario(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarUsuario(Persona user) {
        userRepo.save(user);
    }
       
}
