
package com.facuMe.backend.service;

import com.facuMe.backend.model.User;
import java.util.List;

public interface IUserService {

    public List<User> showUser ();
    
    public void createUser(User user);
    
    public void deleteUser (Long id);
    
    public User searchUser (Long id);
    
}
