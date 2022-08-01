package ar.com.porfolio.Backend.service;

import ar.com.porfolio.Backend.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> verHabilidades ();
    public void crearHabilidad (Skill skill);
    public void borrarHabilidad (Long id);
    public Skill buscarHabilidad (Long id);
    public void modificarHabilidad (Skill skill);
}
