
package com.facuMe.backend.service;

import com.facuMe.backend.model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.facuMe.backend.repository.ProjectRepository;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    public ProjectRepository projRepo;
    
    
    @Override
    public List<Project> showProjects() {
        return projRepo.findAll();
    }

    @Override
    public void createProject(Project proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }

    @Override
    public Project searchProject(Long id) {
        return projRepo.findById(id).orElse(null);
    }
    
}
