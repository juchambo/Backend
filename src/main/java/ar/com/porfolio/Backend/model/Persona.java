package ar.com.porfolio.Backend.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String fechaNac;
    private String sobreMi;
    private String ciudadProvincia;
    private String urlFotoPerfil;
    private String urlFotoBackground;

    @OneToMany 
    @JoinColumn (name = "persona_id")
    private List<Experience> listaExperiencias;
    
    @OneToMany
    @JoinColumn (name = "persona_id")
    private List<Education> listaEducacion;
        
    @OneToMany 
    @JoinColumn (name = "persona_id")
    private List<Project> listaProyectos;
    
    @OneToMany
    @JoinColumn (name = "persona_id")
    private List<Skill> listaSkills;
 
    public Persona() {
}

    public Persona(Long id, String nombre, String apellido, String email, String fechaNac, String sobreMi, String ciudadProvincia, String urlFotoPerfil, String urlFotoBackground, List<Experience> listaExperiencias, List<Education> listaEducacion, List<Project> listaProyectos, List<Skill> listaSkills) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.sobreMi = sobreMi;
        this.ciudadProvincia = ciudadProvincia;
        this.urlFotoPerfil = urlFotoPerfil;
        this.urlFotoBackground = urlFotoBackground;
        this.listaExperiencias = listaExperiencias;
        this.listaEducacion = listaEducacion;
        this.listaProyectos = listaProyectos;
        this.listaSkills = listaSkills;
    }
 
}
