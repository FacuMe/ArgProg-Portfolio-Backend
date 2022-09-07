
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Education;
import com.facuMe.backend.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin

@RestController
public class EducationController {

    @Autowired
    private IEducationService eduServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/education")
    public void createEducation (@RequestBody Education edu) {
        eduServ.createEducation(edu);
    }
    
    @GetMapping ("/list/education")
    @ResponseBody
    public List<Education> showEducation () {
        return eduServ.showEducation();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduServ.deleteEducation(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/save/education/{id}")
    public void editEducation (@PathVariable long id, 
                               @RequestBody Education edu) {
        Education eduToUpdate = eduServ.searchEducation(id);
        
        eduToUpdate.setInstitucion(edu.getInstitucion());
        eduToUpdate.setNombre(edu.getNombre());
        eduToUpdate.setFechaInicio(edu.getFechaInicio());
        eduToUpdate.setFechaFinalizacion(edu.getFechaFinalizacion());
        eduToUpdate.setDescripcion(edu.getDescripcion());
        eduToUpdate.setEstudioActual(edu.getEstudioActual());
        eduToUpdate.setUrlFoto(edu.getUrlFoto());
        
        eduServ.createEducation(eduToUpdate);
    }
    
}
