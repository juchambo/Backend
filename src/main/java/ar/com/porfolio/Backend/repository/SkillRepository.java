package ar.com.porfolio.Backend.repository;

import ar.com.porfolio.Backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{

}
