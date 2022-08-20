
package com.facuMe.backend.service;

import com.facuMe.backend.model.Projects;
import com.facuMe.backend.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {

    @Autowired
    public ProjectsRepository projRepo;
    
    
    @Override
    public List<Projects> showProjects() {
        return projRepo.findAll();
    }

    @Override
    public void createProject(Projects proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }

    @Override
    public Projects searchProject(Long id) {
        return projRepo.findById(id).orElse(null);
    }
    
}
