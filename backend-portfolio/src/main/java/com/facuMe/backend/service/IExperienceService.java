
package com.facuMe.backend.service;

import com.facuMe.backend.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> showExperience ();
    
    public void createExperience (Experience exp);
    
    public void deleteExperience (Long id);
    
    public Experience searchExperience (Long id);
    
}
