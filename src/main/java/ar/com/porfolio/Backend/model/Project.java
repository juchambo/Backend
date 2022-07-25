package ar.com.porfolio.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    private String puesto;
    private String fechaInicio;
    private String fechaFin; 
    private String descripcion; 
    private String urlFotoProyecto;
    private Long user_Id;

    public Project(Long id, String nombreProyecto, String puesto, String fechaInicio, String fechaFin, String descripcion, String urlFotoProyecto, Long user_Id) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.urlFotoProyecto = urlFotoProyecto;
        this.user_Id = user_Id;
    }

}
