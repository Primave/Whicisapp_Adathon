package ar.com.adatohn.wichiapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.adatohn.wichiapp.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer>{
    
    
}
