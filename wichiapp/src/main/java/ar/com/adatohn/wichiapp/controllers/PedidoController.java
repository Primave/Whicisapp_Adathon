package ar.com.adatohn.wichiapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import ar.com.adatohn.wichiapp.entities.Pedido;
import ar.com.adatohn.wichiapp.models.requests.PedidoRequest;
import ar.com.adatohn.wichiapp.models.responses.GenericResponse;
import ar.com.adatohn.wichiapp.services.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PedidoController {
    
    @Autowired
    GenericResponse genericResponse;
    PedidoRequest pedidoRequest;
    PedidoService PedidoService;

    @PostMapping("/pedidos")
    public ResponseEntity<?> crearPedido(@RequestBody PedidoRequest infoPedido) {

        Pedido pedido = new Pedido();
        pedido.setDelegada(infoPedido.delegada);
        pedido.setProductos(infoPedido.productos);
        pedido.setCantidad(infoPedido.cantidad);
        PedidoService.crearPedido(pedido);

        return ResponseEntity.ok(pedido);
    }
    


}
