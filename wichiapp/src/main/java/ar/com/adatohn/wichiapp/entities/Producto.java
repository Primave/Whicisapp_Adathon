package ar.com.adatohn.wichiapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String imagen;
    
    @ManyToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comunidad> comunidades = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Comunidad> getComunidades() {
        return comunidades;
    }

    public void setComunidades(List<Comunidad> comunidades) {
        this.comunidades = comunidades;
    }

    public void agregarComunidade(Comunidad comunidad){
        this.comunidades.add(comunidad);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

 

}
