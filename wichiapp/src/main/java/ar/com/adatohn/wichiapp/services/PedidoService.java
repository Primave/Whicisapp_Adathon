package ar.com.adatohn.wichiapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.adatohn.wichiapp.entities.Pedido;
import ar.com.adatohn.wichiapp.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public void crearPedido(Pedido pedido){
        pedidoRepository.save(pedido);
    }
    
}
