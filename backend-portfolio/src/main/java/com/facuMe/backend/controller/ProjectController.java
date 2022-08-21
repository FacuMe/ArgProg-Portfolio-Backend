
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

@RestController
public class ProjectController {

    @Autowired
    private IProjectService projServ;
    
    @PostMapping ("/new/project")
    public void createProject (@RequestBody Project proj) {
        projServ.createProject(proj);
    }
    
    @GetMapping ("/list/project")
    @ResponseBody
    public List<Project> showProjects () {
        return projServ.showProjects();
    }
    
    @DeleteMapping ("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projServ.deleteProject(id);
    }
    
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
        
        projServ.createProject(projToUpdate);
    }
    
}
