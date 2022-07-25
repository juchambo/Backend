package ar.com.porfolio.Backend.repository;

import ar.com.porfolio.Backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Long>{
    
}
