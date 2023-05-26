package parcial.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import java.util.List;
import java.util.Optional;
import parcial.demo.model.*;
import parcial.demo.services.*;
import parcial.demo.repository.*;




@RestController
@RequestMapping("/libros")
public class LibroController {


    Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private final LibroService LibroRepository;

   
    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Libro findEstablecimiento(@PathVariable Long id){
        return LibroService.obtenerLibroPorId();
        
    }
    @GetMapping("/List")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Libro> listEstablecimiento(){
        return LibroRepository.findAll();
    }
    // Opcional: Otros métodos y endpoints adicionales
}

