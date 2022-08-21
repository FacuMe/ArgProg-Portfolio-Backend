
package com.facuMe.backend.repository;

import com.facuMe.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    
}

