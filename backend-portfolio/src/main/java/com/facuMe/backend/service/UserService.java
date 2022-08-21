
package com.facuMe.backend.service;

import com.facuMe.backend.model.User;
import com.facuMe.backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository userRepo;
    
    
    @Override
    public List<User> showUser() {
        return userRepo.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User searchUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    
}
