
package com.facuMe.backend.service;

import com.facuMe.backend.model.Profile;
import java.util.List;

public interface IProfileService {
    
    public List<Profile> showProfile ();
    
    public void createProfile (Profile prof);
    
    public void deleteProfile (Long id);
    
    public Profile searchProfile (Long id);
    
}
