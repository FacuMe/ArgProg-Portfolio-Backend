
package com.facuMe.backend.controller;

import com.facuMe.backend.model.Profile;
import com.facuMe.backend.service.IProfileService;
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
public class ProfileController {
    
    
    @Autowired
    private IProfileService profServ;
   
    @PostMapping ("/new/profile")
    public void createProfile (@RequestBody Profile prof) {
        profServ.createProfile(prof);
    }
    
    @GetMapping ("/list/profile")
    @ResponseBody
    public List<Profile> showProfile () {
        return profServ.showProfile();
    }
    
    @DeleteMapping ("/delete/profile/{id}")
    public void deleteProfile(@PathVariable Long id){
        profServ.deleteProfile(id);
    }
    
    @PutMapping ("/save/profile/{id}")
    public void editProfile (@PathVariable long id,
                              @RequestBody Profile prof) {
        Profile profToUpdate = profServ.searchProfile(id);
        
        profToUpdate.setDescripcion(prof.getDescripcion());
        
        profServ.createProfile(profToUpdate);
    }
}

