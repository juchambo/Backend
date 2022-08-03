package ar.com.porfolio.Backend.repository;

import ar.com.porfolio.Backend.model.Persona;
import ar.com.porfolio.Backend.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
       Optional<Persona> findByEmail(String email);
       Optional<Long> findIdByEmail(String email);

 
}
