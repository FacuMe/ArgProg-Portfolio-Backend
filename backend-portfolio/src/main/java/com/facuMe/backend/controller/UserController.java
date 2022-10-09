
package com.facuMe.backend.controller;

import com.facuMe.backend.model.User;
import com.facuMe.backend.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
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
public class UserController {
    @Autowired
    private IUserService userServ;
    
    @GetMapping ("/list/user")
    @ResponseBody
    public List<User> showUser () {
        return userServ.showUser();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/user")
    public void createUser (@RequestBody User user) {
        userServ.createUser(user);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userServ.deleteUser(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/save/user/{id}")
    public void editUser (@PathVariable long id, 
                          @RequestBody User user) {
        User userToUpdate = userServ.searchUser(id);
        
        userToUpdate.setNombre(user.getNombre());
        userToUpdate.setApellido(user.getApellido());
        userToUpdate.setDescripcion1(user.getDescripcion1());
        userToUpdate.setDescripcion2(user.getDescripcion2());
        userToUpdate.setFechaNacimiento(user.getFechaNacimiento());
        userToUpdate.setDomicilio(user.getDomicilio());
        userToUpdate.setUrlFotoPerfil(user.getUrlFotoPerfil());
        userToUpdate.setCorreoElectronico(user.getCorreoElectronico());
        
        userServ.createUser(userToUpdate);
    }
    
}
