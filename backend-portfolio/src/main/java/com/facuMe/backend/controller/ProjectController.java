
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.facuMe.backend.service.IProjectService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;


//@CrossOrigin
//@CrossOrigin(origins="https://front-proyectofinal-argprog.web.app/")
@CrossOrigin(origins= {"https://front-proyectofinal-argprog.web.app/", "https://facume-portfolio-argprog.web.app/"})

@RestController
public class ProjectController {

    @Autowired
    private IProjectService projServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/project")
    public void createProject (@RequestBody Project proj) {
        projServ.createProject(proj);
    }
    
    @GetMapping ("/list/project")
    @ResponseBody
    public List<Project> showProjects () {
        return projServ.showProjects();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projServ.deleteProject(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/save/project/{id}")
    public void editProject (@PathVariable long id, 
                               @RequestBody Project proj) {
        Project projToUpdate = projServ.searchProject(id);
        
        projToUpdate.setNombre(proj.getNombre());
        projToUpdate.setEntidad(proj.getEntidad());
        projToUpdate.setFechaInicio(proj.getFechaInicio());
        projToUpdate.setFechaFinalizacion(proj.getFechaFinalizacion());
        projToUpdate.setDescripcion(proj.getDescripcion());
        projToUpdate.setProyectoActual(proj.getProyectoActual());
        projToUpdate.setUrlFoto(proj.getUrlFoto());
        projToUpdate.setUrlProyecto(proj.getUrlProyecto());
        
        projServ.createProject(projToUpdate);
    }
    
}
