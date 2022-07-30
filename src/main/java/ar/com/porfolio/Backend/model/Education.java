package ar.com.porfolio.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreInstitucion;
    private String tituloObtenido;
    private String fechaInicio;
    private String fechaFin;
    private int estaCursando;
    private String urlLogoInstitucion;
    private Long persona_id;



    public Education() {
    }

    public Education(Long id, String nombreInstitucion, String tituloObtenido, String fechaInicio, String fechaFin, int estaCursando, String urlLogoInstitucion, Long persona_id) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.tituloObtenido = tituloObtenido;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estaCursando = estaCursando;
        this.urlLogoInstitucion = urlLogoInstitucion;
        this.persona_id = persona_id;
    }


}
