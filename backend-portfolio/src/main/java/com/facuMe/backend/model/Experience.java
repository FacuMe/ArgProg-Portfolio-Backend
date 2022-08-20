
package com.facuMe.backend.model;

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
    private String puesto;
    private String empleador;
    private String fechaIngreso;
    private String fechaSalida;
    private String tipoEmpleo;
    private String descripcion;
    private Boolean empleoActual;
    
    public Experience() {
    }

    public Experience(Long id, String puesto, String empleador, String fechaIngreso, String fechaSalida, String tipoEmpleo, String descripcion, Boolean empleoActual) {
        this.id = id;
        this.puesto = puesto;
        this.empleador = empleador;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.tipoEmpleo = tipoEmpleo;
        this.descripcion = descripcion;
        this.empleoActual = empleoActual;
    }

    
    
    
    
    
}
