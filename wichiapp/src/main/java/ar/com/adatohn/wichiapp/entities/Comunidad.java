package ar.com.adatohn.wichiapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "comunidad")
public class Comunidad {
 
    @Id
    @Column(name = "comunidad_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comunidadId;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    private Producto producto;
    
    @OneToOne(mappedBy = "comunidad", cascade = CascadeType.ALL)
    private Delegada delegada;





    public Integer getComunidadId() {
        return comunidadId;
    }

    public void setComunidadId(Integer comunidadId) {
        this.comunidadId = comunidadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Delegada getDelegada() {
        return delegada;
    }

    public void setDelegada(Delegada delegada) {
        this.delegada = delegada;
    }

}