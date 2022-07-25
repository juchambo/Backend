package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> verExperiencias ();
    public void crearExperiencia (Experience experiencia);
    public void borrarExperiencia (Long id);
    public Experience buscarExperiencia (Long id);
    public void modificarExperiencia (Experience experiencia);
}
