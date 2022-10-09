
package com.facuMe.backend.model;

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
    private String nombre;
    private String entidad;
    private String fechaInicio;
    private String fechaFinalizacion;
    private String descripcion;
    private Boolean proyectoActual;
    private String urlFoto;
    private String urlProyecto;
    
    public Project() {
    }

    public Project(Long id, String nombre, String entidad, String fechaInicio, String fechaFinalizacion, String descripcion, Boolean proyectoActual, String urlFoto, String urlProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.descripcion = descripcion;
        this.proyectoActual = proyectoActual;
        this.urlFoto = urlFoto;
        this.urlProyecto = urlProyecto;
    }
    
}