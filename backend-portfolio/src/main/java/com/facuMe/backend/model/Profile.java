
package com.facuMe.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Profile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    
    public Profile() {
    }

    public Profile(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
}
