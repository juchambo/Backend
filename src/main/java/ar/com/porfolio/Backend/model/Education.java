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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreInstitucion;
    private String tituloObtenido;
    private String fechaInicio;
    private String fechaFin;
    private int estaCursando;
    private String urlLogoInstitucion;
    private Long userId;
}
