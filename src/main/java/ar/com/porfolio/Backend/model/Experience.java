package ar.com.porfolio.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEmpresa;
    private String puesto;
    private int esTrabajoActual;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String urlLogoEmpresa;
    private int tipoEmpleo;  
    private Long persona_id;
    
    public Experience() {
    }

    public Experience(Long id, String nombreEmpresa, String puesto, int esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, String urlLogoEmpresa, int tipoEmpleo, Long persona_id) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.urlLogoEmpresa = urlLogoEmpresa;
        this.tipoEmpleo = tipoEmpleo;
        this.persona_id = persona_id;
    }
}
