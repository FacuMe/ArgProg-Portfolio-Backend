
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Experience;
import com.facuMe.backend.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ExperienceController {
    
    @Autowired
    private IExperienceService expServ;
    
    @PostMapping ("/new/experience")
    public void createExperience (@RequestBody Experience exp) {
        expServ.createExperience(exp);
    }
    
    @GetMapping ("/list/experience")
    @ResponseBody
    public List<Experience> showExperience () {
        return expServ.showExperience();
    }
    
    @DeleteMapping ("/delete/experience/{id}")
    public void deleteExperience(@PathVariable Long id){
        expServ.deleteExperience(id);
    }
    
    @PutMapping ("/save/experience/{id}")
    public void editExperience (@PathVariable long id, 
                                      @RequestBody Experience exp) {
        Experience expToUpdate = expServ.searchExperience(id);
        
        expToUpdate.setPuesto(exp.getPuesto());
        expToUpdate.setEmpleador(exp.getEmpleador());
        expToUpdate.setFechaIngreso(exp.getFechaIngreso());
        expToUpdate.setFechaSalida(exp.getFechaSalida());
        expToUpdate.setTipoEmpleo(exp.getTipoEmpleo());
        expToUpdate.setDescripcion(exp.getDescripcion());
        expToUpdate.setEmpleoActual(exp.getEmpleoActual());
        expToUpdate.setUrlFoto(exp.getUrlFoto());
        
        expServ.createExperience(expToUpdate);
    }
}
