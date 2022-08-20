
package com.facuMe.backend.service;

import com.facuMe.backend.model.Education;
import com.facuMe.backend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{

    @Autowired
    public EducationRepository eduRepo;
    
    
    @Override
    public List<Education> showEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education searchEducation(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
