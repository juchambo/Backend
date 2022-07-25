package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> verEducacion ();
    public void crearEducacion (Education educacion);
    public void borrarEducacion (Long id);
    public Education buscarExperiencia (Long id);
    public void modificarEducacion (Education educacion);
}    
   

