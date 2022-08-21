
package com.facuMe.backend.repository;

import com.facuMe.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectRepository extends JpaRepository <Project, Long>{

}
