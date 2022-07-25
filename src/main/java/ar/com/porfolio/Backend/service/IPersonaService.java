
package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Persona;
import java.util.List;

public interface IPersonaService {
 
    public List<Persona> verUsuarios ();
    public void crearUsuario (Persona user);
    public void borrarUsuario (Long id);
    public Persona buscarUsuario (Long id);
    public void modificarUsuario (Persona user);
}
