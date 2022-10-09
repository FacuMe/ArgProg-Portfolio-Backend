
package com.facuMe.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String descripcion1;
    private String descripcion2;
    private String fechaNacimiento;
    private String domicilio;
    private String urlFotoPerfil;
    private String correoElectronico;
    
    public User() {
    }

    public User(Long id, String nombre, String apellido, String descripcion1, String descripcion2, String fechaNacimiento, String domicilio, String urlFotoPerfil, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.urlFotoPerfil = urlFotoPerfil;
        this.correoElectronico = correoElectronico;
    }
    
    
}
