
package com.facuMe.backend.repository;

import com.facuMe.backend.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectsRepository extends JpaRepository <Projects, Long>{

}
