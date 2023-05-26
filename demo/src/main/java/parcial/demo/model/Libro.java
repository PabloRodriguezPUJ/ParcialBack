package parcial.demo.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String referencia;
    private String autor;
    private Double precio;
    private String ubicacion;


    public Libro(){

    }
    public Libro(Long id, String titulo, String referencia,String autor, Double precio,  String ubicacion) {
       
        this.id=id;
        this.titulo=titulo;
       this.precio=precio;
       this.autor=autor;
       this.referencia=referencia;
       this.ubicacion=ubicacion;

        
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTítulo() {
        return titulo;
    }
    public void setTítulo(String título) {
        this.titulo = título;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getUbicación() {
        return ubicacion;
    }
    public void setUbicación(String ubicación) {
        this.ubicacion = ubicación;
    }

   
    
}
