
package com.facuMe.backend.service;

import com.facuMe.backend.model.Project;
import java.util.List;

public interface IProjectService {

    public List<Project> showProjects ();
    
    public void createProject (Project proj);
    
    public void deleteProject (Long id);
    
    public Project searchProject (Long id);
    
}
