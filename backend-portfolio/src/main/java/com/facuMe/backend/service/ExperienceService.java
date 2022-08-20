
package com.facuMe.backend.service;

import com.facuMe.backend.model.Experience;
import com.facuMe.backend.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    public ExperienceRepository expRepo;
    
    
    @Override
    public List<Experience> showExperience() {
        return expRepo.findAll();
    }

    @Override
    public void createExperience(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience searchExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    
}
