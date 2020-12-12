package ar.com.adatohn.wichiapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
 
    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;
    private String nombre;
    private String descripcion;
    private String collor;
    private String tejido;
    //TODO arreglar para armazenar imagen en servidor externo
    @Lob
    private byte imagem;
    
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comunidad> comunidades = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    private Pedido pedido;



    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
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

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    public byte getImagem() {
        return imagem;
    }

    public void setImagem(byte imagem) {
        this.imagem = imagem;
    }

    public List<Comunidad> getComunidades() {
        return comunidades;
    }

    public void setComunidades(List<Comunidad> comunidades) {
        this.comunidades = comunidades;
    }

    public void agregarComunidade(Comunidad comunidad){
        this.comunidades.add(comunidad);
        comunidad.setProducto(this);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


 

}
