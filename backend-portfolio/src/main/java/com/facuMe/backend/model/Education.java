
package com.facuMe.backend.model;

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
    private String institucion;
    private String nombre;
    private String fechaInicio;
    private String fechaFinalizacion;
    private String descripcion;
    private Boolean estudioActual;
    private String urlFoto;
    
    public Education() {
    }

    public Education(Long id, String institucion, String nombre, String fechaInicio, String fechaFinalizacion, String descripcion, Boolean estudioActual, String UrlFoto) {
        this.id = id;
        this.institucion = institucion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.descripcion = descripcion;
        this.estudioActual = estudioActual;
        this.urlFoto = urlFoto;
    }
    
    
}
