
package com.facuMe.backend.service;

import com.facuMe.backend.model.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> showSkill ();
    
    public void createSkill (Skill skl);
    
    public void deleteSkill (Long id);
    
    public Skill searchSkill (Long id);
    
}
