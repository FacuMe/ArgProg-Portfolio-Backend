
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Skill;
import com.facuMe.backend.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService sklServ;
    
    @PostMapping ("/new/skill")
    public void createSkill (@RequestBody Skill skl) {
        sklServ.createSkill(skl);
    }
    
    @GetMapping ("/list/skill")
    @ResponseBody
    public List<Skill> showSkill () {
        return sklServ.showSkill();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id){
        sklServ.deleteSkill(id);
    }
    
    @PutMapping ("/save/skill/{id}")
    public void editSkill (@PathVariable long id, 
                          @RequestBody Skill skl) {
        Skill sklToUpdate = sklServ.searchSkill(id);
        
        sklToUpdate.setNombre(skl.getNombre());
        sklToUpdate.setPorcentaje(skl.getPorcentaje());
        sklToUpdate.setColor(skl.getColor());
        
        sklServ.createSkill(sklToUpdate);
    }
    
}
