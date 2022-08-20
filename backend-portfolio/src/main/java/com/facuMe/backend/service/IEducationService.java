
package com.facuMe.backend.service;

import com.facuMe.backend.model.Education;
import java.util.List;

public interface IEducationService {

    public List<Education> showEducation ();
    
    public void createEducation (Education edu);
    
    public void deleteEducation (Long id);
    
    public Education searchEducation (Long id);
    
}
