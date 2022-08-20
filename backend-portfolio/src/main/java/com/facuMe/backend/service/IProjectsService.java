
package com.facuMe.backend.service;

import com.facuMe.backend.model.Projects;
import java.util.List;

public interface IProjectsService {

    public List<Projects> showProjects ();
    
    public void createProject (Projects proj);
    
    public void deleteProyect (Long id);
    
    public Projects searchProyect (Long id);
    
}
