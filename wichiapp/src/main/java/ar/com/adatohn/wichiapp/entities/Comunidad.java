package ar.com.adatohn.wichiapp.entities;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "comunidad")
public class Comunidad {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    
    @ManyToMany
    private Set<Producto> produccion;
    
    @ManyToMany
    private Set<Producto> produccionActual;
    

    @OneToOne(mappedBy = "comunidad", cascade = CascadeType.ALL)
    private Delegada delegada;

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

    public Delegada getDelegada() {
        return delegada;
    }

    public void setDelegada(Delegada delegada) {
        this.delegada = delegada;
    }

    public Set<Producto> getProduccion() {
        return produccion;
    }

    public void setProduccion(Set<Producto> produccion) {
        this.produccion = produccion;
    }

    public Set<Producto> getProduccionActual() {
        return produccionActual;
    }

    public void setProduccionActual(Set<Producto> produccionActual) {
        this.produccionActual = produccionActual;
    }

}