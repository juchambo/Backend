package ar.com.porfolio.Backend.repository;

import ar.com.porfolio.Backend.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    
}

