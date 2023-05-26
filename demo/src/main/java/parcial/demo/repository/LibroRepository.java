package parcial.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Id;
import parcial.demo.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
   
}
