package ar.com.porfolio.Backend.repository;

import ar.com.porfolio.Backend.model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{ 

    public List<Experience> findAllById(Long id);
        
}

