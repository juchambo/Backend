
package ar.com.porfolio.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidad;
    private String nivelHabilidad;

    public Skill() {
    }

    public Skill(Long id, String habilidad, String nivelHabilidad) {
        this.id = id;
        this.habilidad = habilidad;
        this.nivelHabilidad = nivelHabilidad;
    }
    
    
    
}
