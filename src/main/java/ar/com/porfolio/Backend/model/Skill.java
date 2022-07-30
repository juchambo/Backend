
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
    private Long persona_id;

    public Skill() {
    }

    public Skill(Long id, String habilidad, String nivelHabilidad, Long persona_id) {
        this.id = id;
        this.habilidad = habilidad;
        this.nivelHabilidad = nivelHabilidad;
        this.persona_id = persona_id;
    }
    
}
