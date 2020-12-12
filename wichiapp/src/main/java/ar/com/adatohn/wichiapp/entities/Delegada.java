package ar.com.adatohn.wichiapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "delegada")
public class Delegada {
    
    @Id
    @Column(name = "delegada_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer delegadaId;
    private String nombre;
    @OneToOne
    @JoinColumn(name = "comunidad_id", referencedColumnName = "comunidad_id")
    private Comunidad comunidad;

    @OneToMany(mappedBy = "delegada", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Pedido> pedidos = new ArrayList<>();



    
    public Integer getDelegadaId() {
        return delegadaId;
    }

    public void setDelegadaId(Integer delegadaId) {
        this.delegadaId = delegadaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
        this.comunidad.setDelegada(this);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    

}
