
package com.facuMe.backend.service;

import com.facuMe.backend.model.Profile;
import com.facuMe.backend.repository.ProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService{

    @Autowired
    public ProfileRepository profRepo;
    
    
    @Override
    public List<Profile> showProfile() {
        return profRepo.findAll();
    }

    @Override
    public void createProfile(Profile prof) {
        profRepo.save(prof);
    }

    @Override
    public void deleteProfile(Long id) {
        profRepo.deleteById(id);
    }

    @Override
    public Profile searchProfile(Long id) {
        return profRepo.findById(id).orElse(null);
    }
    
}