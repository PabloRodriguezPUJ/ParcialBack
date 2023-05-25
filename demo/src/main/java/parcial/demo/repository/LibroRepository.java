package parcial.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;
import parcial.demo.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
   
}
