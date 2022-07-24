package ar.com.porfolio.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String fechaNac;
    private String sobreMi;
    private String ciudadProvincia;
    private String urlFotoPerfil;
    private String urlFotoBackground;

    public Usuario() {
}
    
    public Usuario(Long id, String nombre, String apellido, String email, String fechaNac, String sobreMi, String ciudadProvincia, String urlFotoPerfil, String urlFotoBackground) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.sobreMi = sobreMi;
        this.ciudadProvincia = ciudadProvincia;
        this.urlFotoPerfil = urlFotoPerfil;
        this.urlFotoBackground = urlFotoBackground;
    }
}
