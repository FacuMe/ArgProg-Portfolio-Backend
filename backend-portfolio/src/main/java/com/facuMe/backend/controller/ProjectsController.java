
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Projects;
import com.facuMe.backend.service.IProjectsService;
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

@RestController
public class ProjectsController {

    @Autowired
    private IProjectsService projServ;
    
    @PostMapping ("/new/project")
    public void createProject (@RequestBody Projects proj) {
        projServ.createProject(proj);
    }
    
    @GetMapping ("/list/projects")
    @ResponseBody
    public List<Projects> showProjects () {
        return projServ.showProjects();
    }
    
    @DeleteMapping ("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projServ.deleteProject(id);
    }
    
    @PutMapping ("/save/project/{id}")
    public void editProject (@PathVariable long id, 
                               @RequestBody projects proj) {
        Projects projToUpdate = projServ.searchProject(id);
        
        projToUpdate.setNombre(edu.getNombre());
        projToUpdate.setEntidad(edu.getEntidad());
        projToUpdate.setFechaInicio(edu.getFechaInicio());
        projToUpdate.setFechaFinalizacion(edu.getFechaFinalizacion());
        projToUpdate.setDescripcion(edu.getDescripcion());
        projToUpdate.setProyectoActual(edu.getProyectoActual());
        
        projServ.createProject(projToUpdate);
    }
    
}
