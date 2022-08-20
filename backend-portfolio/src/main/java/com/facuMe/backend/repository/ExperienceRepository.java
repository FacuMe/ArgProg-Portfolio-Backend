
package com.facuMe.backend.repository;

import com.facuMe.backend.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    
}
