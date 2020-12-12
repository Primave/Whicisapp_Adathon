package ar.com.adatohn.wichiapp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @Column (name = "pedido_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pedidoId;
//TODO cambiar para ENUM
    @Column (name = "estado_id")
    private Integer estadoId;
//TODO fecha con data y hora
    @Column (name = "fecha_creacion")
    private Date fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "delegada_id", referencedColumnName = "delegada_id")
    private Delegada delegada;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Producto> productos = new ArrayList<>();
    private Integer cantidad;



    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Integer estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Delegada getDelegada() {
        return delegada;
    }

    public void setDelegada(Delegada delegada) {
        this.delegada = delegada;
        this.delegada.getPedidos().add(this);
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

   
   

    
}
