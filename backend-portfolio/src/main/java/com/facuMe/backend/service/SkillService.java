
package com.facuMe.backend.service;

import com.facuMe.backend.model.Skill;
import com.facuMe.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository sklRepo;
    
    
    @Override
    public List<Skill> showSkill() {
        return sklRepo.findAll();
    }

    @Override
    public void createSkill(Skill skl) {
        sklRepo.save(skl);
    }

    @Override
    public void deleteSkill(Long id) {
        sklRepo.deleteById(id);
    }

    @Override
    public Skill searchSkill(Long id) {
        return sklRepo.findById(id).orElse(null);
    }
    
}
