package ar.com.adatohn.wichiapp.models.requests;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.adatohn.wichiapp.entities.Delegada;
import ar.com.adatohn.wichiapp.entities.Producto;

@RequestMapping
public class PedidoRequest {

    public int pedidoId;
    public Delegada delegada;
    public List<Producto> productos;
    public int cantidad;

    
}
