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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String puesto;
    private Number esTrabajoActual;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String urlLogoEmpresa;
    private Long userId;
    private int tipoEmpleo;  

    public Experience() {
    }

    public Experience(Long id, String nombreEmpresa, String puesto, Number esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, String urlLogoEmpresa, Long userId, int tipoEmpleo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.urlLogoEmpresa = urlLogoEmpresa;
        this.userId = userId;
        this.tipoEmpleo = tipoEmpleo;
    }
}
